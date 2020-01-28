package controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import model.Compte;
import repositories.CompteRepository;

@Controller
public class MenuController {
	
	@Autowired
	CompteRepository compteRepository;
	
	@GetMapping("/menu")
	public ModelAndView menuProprio() {
		Compte proprio = new Compte();
		Optional<Compte> opt = compteRepository.findById(101);
		if(opt.isPresent()) {
			proprio= opt.get();
		}
		
		return new ModelAndView("menu", "compte", proprio );
	}
	
	
}
