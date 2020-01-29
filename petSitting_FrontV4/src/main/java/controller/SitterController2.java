package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Compte;
import model.Proprio;
import repositories.AnnonceRepository;
import repositories.CompteRepository;

@Controller
public class SitterController2 {

	@Autowired
	CompteRepository compteRepository;
	
	@Autowired
	AnnonceRepository annonceRepository;

	@GetMapping("/sitter/afficherAnnoncesBySitter")
	public ModelAndView menuProprio(@RequestParam(name="numC") Integer numC) {

		return new ModelAndView("/sitter/afficherAnnoncesBySitter","annonces", annonceRepository.selectAnnonceBySitter(numC)) ;	
		}


}
