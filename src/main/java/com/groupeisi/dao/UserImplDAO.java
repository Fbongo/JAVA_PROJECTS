package com.groupeisi.dao;

import java.sql.ResultSet;
import java.util.List;

import com.groupeisi.entities.User;

public class UserImplDAO implements IUserDAO
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

	public int create(User user) {
		result = 0;
		try {
			String sql = "INSERT INTO user VALUES(null,?,?)";
			db.init(sql);
			db.getPstm().setString(1, user.getEmail());
			db.getPstm().setString(2, user.getPassword());

			result = db.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		return result;
	}


	public int update(User user) 
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public int remove(int id)
	{
		// TODO Auto-generated method stub
		return 0;
	}

	public User get(int id)
	{
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAll() 
	{
		// TODO Auto-generated method stub
		return null;
	}

	public User getConnection(String email, String password) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
