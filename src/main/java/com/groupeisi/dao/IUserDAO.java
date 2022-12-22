package com.groupeisi.dao;

import java.util.List;

import com.groupeisi.entities.User;

public interface IUserDAO 
{

	public int create (User user);
    public int update (User user);
    public int remove(int id);
    public User get (int id);
    public List<User> getAll();
    public User getConnection (String email, String password);

}
