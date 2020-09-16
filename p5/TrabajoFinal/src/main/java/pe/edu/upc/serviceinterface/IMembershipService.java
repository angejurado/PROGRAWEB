package pe.edu.upc.serviceinterface;

import java.util.List;     

import pe.edu.upc.entity.Membership;
 
public interface IMembershipService {

	public void insert(Membership men);
	
	public List<Membership> list();
	
}
