package pe.edu.upc.entity;
import java.util.Date;    

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Brand")
public class Brand {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IDBrand;

	@Column(name = "NBrand", nullable = false, length = 35)
	private String NBrand;
	

	/* constructores */
	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Brand(int iDBrand, String nBrand) {
		super();
		IDBrand = iDBrand;
		NBrand = nBrand;
	}

	


	public int getIDBrand() {
		return IDBrand;
	}


	public void setIDBrand(int iDBrand) {
		IDBrand = iDBrand;
	}


	public String getNBrand() {
		return NBrand;
	}


	public void setNBrand(String nBrand) {
		NBrand = nBrand;
	}

	
	

}
