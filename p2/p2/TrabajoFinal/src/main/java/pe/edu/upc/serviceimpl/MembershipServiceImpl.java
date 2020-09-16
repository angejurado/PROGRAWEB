package pe.edu.upc.serviceimpl;

import java.util.List;   

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.MembershipDao;
import pe.edu.upc.entity.Membership;
import pe.edu.upc.serviceinterface.IMembershipService;

@Named
@RequestScoped
public class MembershipServiceImpl implements IMembershipService {

	@Named
	private MembershipDao lD;
	
	@Override
	public void insert(Membership men) {
		lD.insert(men);
	}

	@Override
	public List<Membership> list() {
		// TODO Auto-generated method stub
		return lD.list();
	}
	
}
