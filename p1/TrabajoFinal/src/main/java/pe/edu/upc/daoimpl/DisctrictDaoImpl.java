package pe.edu.upc.daoimpl;
import java.io.Serializable;    
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IDisctrictDao;
import pe.edu.upc.entity.Disctrict;

public class DisctrictDaoImpl implements Serializable, IDisctrictDao{
	/**
	 *  
	 */
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TBDS")
	private EntityManager em;
	
	@Transactional
	public void insert(Disctrict dis) {
		try {
			em.persist(dis);

		} catch (Exception e) {
			System.out.println("Error al insertar ");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Disctrict> list() {
		List<Disctrict> lista = new ArrayList<Disctrict>();
		try {
			Query q = em.createQuery("from District l");
			lista = (List<Disctrict>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar");
		}
		return lista;
	}

}