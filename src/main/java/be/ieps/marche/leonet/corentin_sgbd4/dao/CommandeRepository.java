package be.ieps.marche.leonet.corentin_sgbd4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.ieps.marche.leonet.corentin_sgbd4.model.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Integer>{

}
