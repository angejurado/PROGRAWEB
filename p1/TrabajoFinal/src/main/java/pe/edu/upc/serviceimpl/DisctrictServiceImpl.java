package pe.edu.upc.serviceimpl;

import java.util.List;   

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.IDisctrictDao;
import pe.edu.upc.entity.Disctrict;
import pe.edu.upc.serviceinterface.IDisctrictService;

@Named
@RequestScoped
public class DisctrictServiceImpl implements IDisctrictService {

	@Named
	private IDisctrictDao lD;
	
	@Override
	public void insert(Disctrict dis) {
		lD.insert(dis);
	}

	@Override
	public List<Disctrict> list() {
		// TODO Auto-generated method stub
		return lD.list();
	}
	
}