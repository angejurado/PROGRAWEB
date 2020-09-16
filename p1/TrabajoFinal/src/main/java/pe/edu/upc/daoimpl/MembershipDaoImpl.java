package pe.edu.upc.daoimpl;

import java.io.Serializable;    
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.MembershipDao;
import pe.edu.upc.entity.Membership;

public class MembershipDaoImpl implements Serializable, MembershipDao{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TBDS")
	private EntityManager em;
	
	@Transactional
	public void insert(Membership men) {
		try {
			em.persist(men);

		} catch (Exception e) {
			System.out.println("Error al insertar ");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Membership> list() {
		List<Membership> lista = new ArrayList<Membership>();
		try {
			Query q = em.createQuery("from Membership l");
			lista = (List<Membership>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar");
		}
		return lista;
	}
}
