package com.groupeisi.dao;

import java.util.List;

import com.groupeisi.entities.Inscription;

public interface IInscriptionDAO
{

	public int create (Inscription inscription);
    public int update (Inscription inscription);
    public int remove(int id);
    public Inscription get (int id);
    public List<Inscription> getAll();
    public Inscription getConnection (String prenom, String nom, String email, String adresse, String password);
}
