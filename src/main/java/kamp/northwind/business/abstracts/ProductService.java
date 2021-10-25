package kamp.northwind.business.abstracts;

import java.util.List;

import kamp.northwind.core.utilities.results.DataResult;
import kamp.northwind.core.utilities.results.Result;
import kamp.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getall();
	Result add(Product product);
}
