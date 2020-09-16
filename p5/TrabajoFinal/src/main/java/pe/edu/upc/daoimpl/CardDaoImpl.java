package pe.edu.upc.daoimpl;
import java.io.Serializable;    
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.CardDao;
import pe.edu.upc.entity.Card;

public class CardDaoImpl implements Serializable, CardDao{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TBDS")
	private EntityManager em;
	
	@Transactional
	public void insert(Card car) {
		try {
			em.persist(car);

		} catch (Exception e) {
			System.out.println("Error al insertar ");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Card> list() {
		List<Card> lista = new ArrayList<Card>();
		try {
			Query q = em.createQuery("from Card l");
			lista = (List<Card>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar");
		}
		return lista;
	}
}
