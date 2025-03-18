package be.ieps.marche.leonet.corentin_sgbd4.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import be.ieps.marche.leonet.corentin_sgbd4.dao.CategorieRepository;
import be.ieps.marche.leonet.corentin_sgbd4.dao.StatsCategorie;

@Controller
public class StatistiqueController {

	@Autowired
	private CategorieRepository catRep;
	
	@RequestMapping(value="/statistiques")
	String getStatistiques() {
		return "statistiques/stats";
	}
	
	@RequestMapping(value="/statistiques/categories_stats")
	@ResponseBody
	List<StatsCategorie> getStatistiquesValues() {
		return catRep.findByNombreCommandeCategorie();
	}
}
