
package pe.edu.upc.daointerface;

import java.util.List;     

import pe.edu.upc.entity.Card;
 
public interface CardDao {

	public void insert(Card car);
	
	public List<Card> list();
	
}