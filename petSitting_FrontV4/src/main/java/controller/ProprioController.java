package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import model.Annonce;
import repositories.AnnonceRepository;
import repositories.CompteRepository;

@Controller
@RequestMapping("/proprio")
public class ProprioController {

	@Autowired
	CompteRepository compteRepository;
	
	@Autowired
	AnnonceRepository annonceRepository;
	
	
	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam(name="numA") Integer numA) {
		annonceRepository.deleteById(numA);
		return new ModelAndView("redirect:/proprio/ConsulterAnnonces");	
	}
	
	@GetMapping("/add")
	public ModelAndView add() { 
		return new ModelAndView("proprio/PublierAnnonce","annonce",new Annonce());
	}
	
	@PostMapping("/save")
	public ModelAndView save(@ModelAttribute Annonce annonce) { 
		annonceRepository.save(annonce);
		return new ModelAndView("redirect:/proprio/ConsulterAnnonces"); 
	}
	
}
