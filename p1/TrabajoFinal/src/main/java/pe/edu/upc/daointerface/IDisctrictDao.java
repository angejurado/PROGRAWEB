package pe.edu.upc.daointerface;

import java.util.List;     

import pe.edu.upc.entity.Disctrict;
 
public interface IDisctrictDao {

	public void insert(Disctrict dis);
	
	public List<Disctrict> list();
	
}