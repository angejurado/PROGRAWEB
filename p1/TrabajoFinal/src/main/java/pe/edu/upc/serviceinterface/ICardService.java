package pe.edu.upc.serviceinterface;

import java.util.List;     

import pe.edu.upc.entity.Card;
 
public interface ICardService {

	public void insert(Card car);
	
	public List<Card> list();
	
}