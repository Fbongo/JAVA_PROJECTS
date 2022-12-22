package com.groupeisi.presentation;

import java.text.ParseException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

import com.groupeisi.dao.IInscriptionDAO;
import com.groupeisi.dao.IUserDAO;
import com.groupeisi.dao.InscriptionImplDAO;
import com.groupeisi.dao.UserImplDAO;
import com.groupeisi.entities.Inscription;
import com.groupeisi.entities.User;


 public class Main 
 {

		private static Logger logger = Logger.getLogger(Main.class);

		public static void main(String[] args) throws ParseException {

			BasicConfigurator.configure();

			//CREATION DE USER
			IUserDAO userDAO = new UserImplDAO();
			User user = new User();
			user.setEmail("diouffatou@gmail.com");
			user.setPassword("passer");	
			
			
			//CREATION D'INSCRIPTION
			IInscriptionDAO inscriptionDAO = new InscriptionImplDAO();
			Inscription inscription = new Inscription();
			inscription.setPrenom("Djibril Randa");
			inscription.setNom("Bongo");
			inscription.setEmail("bongodjibril@gmail.com");
			inscription.setAdresse("Keur Massar");
			inscription.setPassword("passer");
			inscription.setClasse("DITI5");
			
			
			int resultUser, resultInscription;
			resultUser = userDAO.create(user);
			resultInscription = inscriptionDAO.create(inscription);
			logger.debug(resultUser);
			logger.debug(resultInscription);
		}


}
