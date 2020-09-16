package pe.edu.upc.daointerface;


import java.util.List;     

import pe.edu.upc.entity.Membership;
 
public interface MembershipDao {

	public void insert(Membership men);
	
	public List<Membership> list();
	
	
}
