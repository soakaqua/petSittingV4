package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.*;
import repositories.*;

@Controller
@RequestMapping("/proprio")
public class ProprioController {

	@Autowired
	CompteRepository compteRepository;
	
	@Autowired
	AnnonceRepository annonceRepository;
	
	@GetMapping("/proprio/consulterAnnonces")
	public String reditectConsulterAnnonces(@RequestParam(name="numC") Integer numC) {
		return "proprio/consulterAnnonces";
	}
	
	@GetMapping("/proprio/modifierAnnonce")
	public String reditectModifierAnnonce(@RequestParam(name="numC") Integer numC) {
		return "proprio/modifierAnnonce";
	}
	
	@GetMapping("/proprio/publierAnnonce")
	public String reditectPublierAnnonce(@RequestParam(name="numC") Integer numC) {
		return "proprio/publierAnnonce";
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam(name="numA") Integer numA, @RequestParam(name="numC") Integer numC) {
		annonceRepository.deleteById(numA);
		return new ModelAndView("redirect:/proprio/consulterAnnonces");	
	}
	
	@GetMapping("/add")
	public ModelAndView add(@RequestParam(name="numC") Integer numC) { 
		return new ModelAndView("proprio/publierAnnonce","annonce",new Annonce());
	}
	
	@PostMapping("/save")
	public ModelAndView save(@ModelAttribute Annonce annonce, @RequestParam(name="numC") Integer numC) { 
		annonceRepository.save(annonce);
		return new ModelAndView("redirect:/proprio/consulterAnnonces"); 
	}
	
}
