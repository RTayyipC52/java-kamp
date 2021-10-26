package kamp.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;

import kamp.northwind.business.abstracts.UserService;
import kamp.northwind.core.dataAccess.UserDao;
import kamp.northwind.core.entities.User;
import kamp.northwind.core.utilities.results.DataResult;
import kamp.northwind.core.utilities.results.Result;

public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
