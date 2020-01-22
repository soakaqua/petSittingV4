package test_general;

public class test {

//    public static void postulerAnnonce(Sitter s, Annonce a, String message) {
//        EntityManager em=JpaContext.getInstance().createEntityManager();
//        DaoReponse daoReponse = DaoReponseFactory.getInstance(); // attention : supprimer ligne dans dao.
//        //ReponsePK key = new ReponsePK((Sitter) s, a);
//        int numC=s.getNumC();
//        int numA=a.getNumA();
//        Reponse rep = new Reponse(numC, numA, message);
//
//        daoReponse.insert(rep);
//        em.close();
//    }
	
	public static void main(String[] args) {
//		JpaContext.getInstance(); 	//ne pas supprimer : sert à tester le fonctionnement de la liaison avec la base de donnée.

		// ------------------ Faite vos tests ici ! --------------------
		

		//----- Test Insert --------
//        DaoAnnonce daoAnnonce = DaoAnnonceFactory.getInstance();
// 
//        Annonce c = new Annonce();
//        c.setMessage("msg test");
//        c.setTitre("titre test");
//        c.setNumC(10);
//        c.setStatut(0);
//        
//        Annonce c2 = new Annonce();
//        c2.setMessage("msg test");
//        c2.setTitre("titre test");
//        c2.setNumC(10);
//        c2.setStatut(1);
//
//        daoAnnonce.insert(c);
//        daoAnnonce.insert(c2);
//        
//        DaoCompte daoCompte = DaoCompteFactory.getInstance();
//        Proprio p1= new Proprio();
//        p1.setNom("nom");
//        p1.setPrenom("prenom");
//        Sitter s1= new Sitter();
//        s1.setNom("nom");
//        s1.setPrenom("prenom");
//        
//        daoCompte.insert(s1);
//        daoCompte.insert(p1);
//        
//        postulerAnnonce(s1,c,"test");
        
      //----- Tests Methodes --------
        
//      Proprio.afficherAnnoncesPubliees(10);
//      Proprio.publierAnnonce("titre", "message", 11, null);
//      Proprio.modifierContenuAnnonce(105, "toto", "toto");
        
        //----- Test selectAnnonceByProprio --------
       
//      List<Annonce> c2 = new ArrayList();
//      c2 =daoAnnonce.selectAnnonceByProprio(10);
//      System.out.println(c2);
        
        //----- Test afficherAnnoncesTerminees --------
        
//      List<Annonce> list = new ArrayList();
//      list =daoAnnonce.afficherAnnoncesTerminees(100);
//      System.out.println(list);
//        
        
        //----- Test selectAnnonceBySitter --------
        
//        List<Annonce> list2 = new ArrayList();
//        list2 =daoAnnonce.selectAnnonceBySitter(100);
//        System.out.println(list2);
        
      //----- Test insert --------
//	      DaoCompte daoCompte = DaoCompteFactory.getInstance();
//	      Compte c = new Compte();
//	      c.setMail("1@1");
//	      c.setMdpC("1");
//	      daoCompte.insert(c);

        //----- Test selectById --------
//        Annonce c2 = new Annonce();
//        c2 = daoAnnonce.selectById(100);
//        System.out.println(c2.getTitre());

        //----- Test update --------
//        c.setTitre("toto");
//        c = daoAnnonce.update(c);
//        System.out.println(c.getTitre());

        //----- Test selectAll --------
//        System.out.println(daoAnnonce.selectAll());

        //----- Test deleteById --------
//        daoAnnonce.deleteById(100);

		
		
		
		// ------------------------ Fin tests ! ------------------------
//		JpaContext.destroy(); // ne pas supprimer !
	}

}
