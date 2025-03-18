package be.ieps.marche.leonet.corentin_sgbd4.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import be.ieps.marche.leonet.corentin_sgbd4.model.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer>{

	public Categorie findByNom(String nom);
	
	@Query(value= "select distinct categorie.nom_categorie as \"categorie\", SUM(listearticles.qtycommande) as \"nombreCommande\" from categorie, articles, listearticles where articles.id_article = listearticles.articleid_article and articles.id_categorie = categorie.id_categorie group by categorie.id_categorie",
			nativeQuery = true)
	List<StatsCategorie> findByNombreCommandeCategorie();
}
