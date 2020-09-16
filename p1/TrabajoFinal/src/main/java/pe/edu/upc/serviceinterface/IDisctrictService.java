package pe.edu.upc.serviceinterface;

import java.util.List;     

import pe.edu.upc.entity.Disctrict;
 
public interface IDisctrictService {

	public void insert(Disctrict dis);
	
	public List<Disctrict> list();
	
}

