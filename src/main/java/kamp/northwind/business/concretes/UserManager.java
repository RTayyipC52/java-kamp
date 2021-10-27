package kamp.northwind.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kamp.northwind.business.abstracts.UserService;
import kamp.northwind.core.dataAccess.UserDao;
import kamp.northwind.core.entities.User;
import kamp.northwind.core.utilities.results.DataResult;
import kamp.northwind.core.utilities.results.Result;
import kamp.northwind.core.utilities.results.SuccessDataResult;
import kamp.northwind.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{

	private UserDao userDao;
	
	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu");
	}

}
