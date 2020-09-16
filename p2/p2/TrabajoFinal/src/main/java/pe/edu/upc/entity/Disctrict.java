package pe.edu.upc.entity;
import java.util.Date;    

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Disctrict")

public class Disctrict {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IDDisctric	;

	@Column(name = "NMembership", nullable = false, length = 35)
	private String NMembership;	

	@Column(name = "FirtDate", nullable = false, length = 65)
	private Date FirtDate;

	private Date LastDate;
	

	public int getIDDisctric() {
		return IDDisctric;
	}

	public void setIDDisctric(int iDDisctric) {
		IDDisctric = iDDisctric;
	}

	public String getNMembership() {
		return NMembership;
	}

	public void setNMembership(String nMembership) {
		NMembership = nMembership;
	}

	public Date getFirtDate() {
		return FirtDate;
	}

	public void setFirtDate(Date firtDate) {
		FirtDate = firtDate;
	}

	public Date getLastDate() {
		return LastDate;
	}

	public void setLastDate(Date lastDate) {
		LastDate = lastDate;
	}

	
	
	
}
