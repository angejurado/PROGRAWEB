package pe.edu.upc.serviceimpl;

import java.util.List;   

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import pe.edu.upc.daointerface.CardDao;
import pe.edu.upc.entity.Card;
import pe.edu.upc.serviceinterface.ICardService;

@Named
@RequestScoped
public class CardServiceImpl implements ICardService {

	@Named
	private CardDao lD;
	
	@Override
	public void insert(Card car) {
		lD.insert(car);
	}

	@Override
	public List<Card> list() {
		// TODO Auto-generated method stub
		return lD.list();
	}
	
}