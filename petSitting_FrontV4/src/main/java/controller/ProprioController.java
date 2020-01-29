package controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
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
	
	@GetMapping("/consulterAnnonces")
	public String reditectConsulterAnnonces(Integer numC, Model model) {	
		model.addAttribute("numC",numC);
		model.addAttribute("annonces", annonceRepository.selectAnnonceByProprio(numC));
		return "proprio/consulterAnnonces";
	}
	
	@GetMapping("/modifierAnnonce")
	public String reditectModifierAnnonce(Integer numC, Model model) {
		model.addAttribute("numC",numC);
		return "proprio/modifierAnnonce";
	}
	
	@GetMapping("/publierAnnonce")
	public String reditectPublierAnnonce(Integer numC, Model model) {
		model.addAttribute("annonce",new Annonce());
		model.addAttribute("numC",numC);
		return "proprio/publierAnnonce";
	}

	@GetMapping("/delete")
	public ModelAndView delete(@RequestParam(name="numA") Integer numA, Integer numC) {
		annonceRepository.deleteByNumA(numA);
		return new ModelAndView("redirect:/proprio/consulterAnnonces", "numC", numC);	
	}
	
	@GetMapping("/savePubli")
	public String savePubli(@ModelAttribute ("annonce") @Valid Annonce annonce, BindingResult br, Integer numC, Model model) { 
		if(br.hasErrors())
			{return "proprio/publierAnnonce";}
		annonceRepository.save(annonce);
		return "redirect:/proprio/consulterAnnonces"; 
	}
	
	@GetMapping("/saveModif")
	public String saveModif(@ModelAttribute ("annonce") @Valid Annonce annonce, BindingResult br, Integer numC, Model model) { 
		if(br.hasErrors())
			{return "proprio/publierAnnonce";}
		annonceRepository.save(annonce);
		return "redirect:/proprio/consulterAnnonces"; 
	}
	
//	@PostMapping("/form")
//	public String afficheForm(@ModelAttribute Identifiants id ,HttpSession session) { //pour passer les identifiants en param ; attention : pas de classe abstraite avec @model 
//// @ModelAttribute instancie un objet "Identifiant" et prend les parametres qui ont le meme nom que ses attributs
//
//		
//		session.setAttribute("identifiants", id);
//
////		session.setAttribute("mail", mail);
////		session.setAttribute("mdp", mdp);
//		
//		return "showform";
//	}


}