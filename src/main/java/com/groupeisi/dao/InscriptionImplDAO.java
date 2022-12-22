package com.groupeisi.dao;

import java.sql.ResultSet;
import java.util.List;

import com.groupeisi.entities.Inscription;
import com.groupeisi.entities.User;

public class InscriptionImplDAO implements IInscriptionDAO
{
	private BD db = new BD();
	private int result;
	private ResultSet rs;

	public ResultSet getRs() {
		return rs;
	}

	public void setRs(ResultSet rs) {
		this.rs = rs;
	}

	public int create(Inscription inscription) {
		result = 0;
		try {
			String sql = "INSERT INTO inscription VALUES(null,?,?,?,?,?,?)";
			db.init(sql);
			db.getPstm().setString(1, inscription.getPrenom());
			db.getPstm().setString(2, inscription.getNom());
			db.getPstm().setString(3, inscription.getEmail());
			db.getPstm().setString(4, inscription.getAdresse());
			db.getPstm().setString(5, inscription.getPassword());
			db.getPstm().setString(6, inscription.getClasse());

			result = db.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return result;
	}
	
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

	}

	public int add(Inscription inscription) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Inscription inscription) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int remove(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Inscription get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Inscription> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Inscription getConnection(String prenom, String nom, String email, String adresse, String password) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	
}

