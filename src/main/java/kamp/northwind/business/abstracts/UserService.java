package kamp.northwind.business.abstracts;

import kamp.northwind.core.entities.User;
import kamp.northwind.core.utilities.results.DataResult;
import kamp.northwind.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
}
