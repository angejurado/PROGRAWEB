package pe.edu.upc.daoimpl;

import java.io.Serializable;    
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.daointerface.IBrandDao;
import pe.edu.upc.entity.Brand;

public class BrandDaoImpl implements Serializable, IBrandDao{
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	@PersistenceContext(unitName = "TBDS")
	private EntityManager em;
	
	@Transactional
	public void insert(Brand bra) {
		try {
			em.persist(bra);

		} catch (Exception e) {
			System.out.println("Error al insertar ");
		}
	}

	@SuppressWarnings("unchecked")
	public List<Brand> list() {
		List<Brand> lista = new ArrayList<Brand>();
		try {
			Query q = em.createQuery("from Brand l");
			lista = (List<Brand>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar");
		}
		return lista;
	}
}
