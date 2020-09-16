package pe.edu.upc.daointerface;

import java.util.List;     

import pe.edu.upc.entity.Brand;
 
public interface IBrandDao {

	public void insert(Brand bra);
	
	public List<Brand> list();
	
}
