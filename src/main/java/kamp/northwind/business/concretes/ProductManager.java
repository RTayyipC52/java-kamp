package kamp.northwind.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kamp.northwind.business.abstracts.ProductService;
import kamp.northwind.core.utilities.results.DataResult;
import kamp.northwind.core.utilities.results.Result;
import kamp.northwind.core.utilities.results.SuccessDataResult;
import kamp.northwind.core.utilities.results.SuccessResult;
import kamp.northwind.dataAccess.abstracts.ProductDao;
import kamp.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService {

	private ProductDao productDao;
	
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}

	@Override
	public DataResult<List<Product>> getall() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(),"Data listelendi.");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Ürün eklendi.");
	}

}
