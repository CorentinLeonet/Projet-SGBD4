package be.ieps.marche.leonet.corentin_sgbd4.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import be.ieps.marche.leonet.corentin_sgbd4.model.ListeArticle;

@Repository
public interface ListeArticleRepository  extends JpaRepository<ListeArticle, Integer> {

}
