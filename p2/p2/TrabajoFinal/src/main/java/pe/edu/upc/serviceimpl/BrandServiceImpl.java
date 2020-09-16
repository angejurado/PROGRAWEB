package pe.edu.upc.serviceimpl;
import java.util.List;   

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.IBrandDao;
import pe.edu.upc.entity.Brand;
import pe.edu.upc.serviceinterface.IBrandService;

@Named
@RequestScoped
public class BrandServiceImpl implements IBrandService {

	@Named
	private IBrandDao lD;
	
	@Override
	public void insert(Brand bra) {
		lD.insert(bra);
	}

	@Override
	public List<Brand> list() {
		// TODO Auto-generated method stub
		return lD.list();
	}
	
}