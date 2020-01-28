package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import repositories.CompteRepository;

@Controller
@RequestMapping("/proprio")
public class ProprioController {

	@Autowired
	CompteRepository compteRepository;
	
}
