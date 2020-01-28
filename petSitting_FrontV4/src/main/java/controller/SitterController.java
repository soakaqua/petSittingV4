package controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class SitterController {
	@GetMapping("/PostulerAnnonce")
	public String PostulerAnonncesSitterAffichage () {
		return "sitter/PostulerAnnonce";	
	}
	
	
}





















//@Controller
//public class HelloController {
//	@PostMapping("/hello") // meme chose qu audessus
//	@RequestMapping(value = "/hello", method = RequestMethod.GET)
//	public String methodget() {
//
//		return "hello";
//	}
//}
//	@RequestMapping("/bye")
//	public String bye() {
//
//		return "bye";
//
//	}

//@PostMapping("/formulaire") //POST MAPPING ici car on veut ENVOYER des infos
//public String affichage(@ModelAttribute Personne p,Model model) {
//		model.addAttribute("personne", p);
//		return "formulaireRecup"; 
//}

//@RequestMapping(value = "/formulaire", method = RequestMethod.GET)
//public String formulaireP (@RequestParam(name = "prenom", required = false, defaultValue = "Prenom") String prenom, @RequestParam(name = "nom",required = false,defaultValue ="Nom") String nom,
//	 Model model) {
//
//	model.addAttribute("prenom", prenom);
//	model.addAttribute("nom", nom);
//
//	return "formulaire";
//	
//}


//@GetMapping("/list")
//public String list(Model model) {
//	//dans le fichier.jsp/c:forEach le nom de l'items doit etre identique a la variable qui est ici ("personnes")
//	model.addAttribute("personnes", personneRepository.findAll());
//	return "personne/list"; 
//}





//	@RequestMapping("/personne")
//	@Controller
//	public class PersonneController {
//		
//		@Autowired
//		PersonneRepository personneRepository; 
//
//		@Autowired
//		SalleRepository salleRepository; 
//		
//		
//		
//		@GetMapping("/list")
//		public String list(Model model) {
//			//dans le fichier.jsp/c:forEach le nom de l'items doit etre identique a la variable qui est ici ("personnes")
//			model.addAttribute("personnes", personneRepository.findAll());
//			return "personne/list"; 
//		}
//		
//		
//		@GetMapping("/edit")
//		public String edit(@RequestParam(name="id") Integer id, Model model) {
//			Optional<Personne> opt=personneRepository.findById(id); 
//			Personne p =null; 
//			if(opt.isPresent()) {
//				p=opt.get(); 
//			}
//			return goEdit(p, model);
////			model.addAttribute("personne", p);
////			return "personne/edit"; 
//		}
//		
//		@GetMapping("/addFormateur")
//		public String addFormateur(Model model) {
//			return goEdit(new Formateur(), model); 
//			
//		}
//		
//		@GetMapping("/addEleve")
//		public String addEleve (Model model) {
//			return goEdit(new Eleve(), model); 
//		}
//		
//		//pour rassembler les deux editeurs eleve et formateur
//		public String goEdit(Personne p, Model model) {
//			model.addAttribute("personne", p); 
//			model.addAttribute("civilites", Civilite.values());
//			model.addAttribute("salle", salleRepository.findAll());
//			
//			
//			return "personne/edit"; 
//		}
//		
//		
//		@PostMapping("/saveEleve")
//		public String saveEleve(@ModelAttribute("personne")@Valid Eleve personne,BindingResult br, Model model) {
//			return save (personne,br, model); 
//		}
//		
//		
//		@PostMapping("/saveFormateur")
//		//BindingResult faut le mettre juste a^res l on=bjet que vous valider et c est lui qui verifie si il est bien valide nptre objet qui a ete genere par valid si c est bon ou pas pr savoir le truc qui n a pas marche
//		public String saveFormateur(@ModelAttribute ("personne")@Valid Formateur personne,BindingResult br, Model model) {
//			return save (personne,br, model); 	
//		}
//		
//		
//		public String save(Personne personne, BindingResult br, Model model) {
//			
//			if (br.hasErrors())
//				return "personne/edit";
//			
//			if (personne.getSalle()!=null&&personne.getSalle().getNom().isEmpty()) {
//				
//				personne.setSalle(null);
//			}
//			
//			personneRepository.save(personne); 
//			return "redirect:/personne/list"; 
//		}
//		
//		
//		@GetMapping("/delete")
//		public String delete (@RequestParam(name="id") Integer id) {
//			personneRepository.deleteById(id);
//			return "redirect:/personne/list"; 
//		}
//		
//	}

	
	
	
	
	
	

