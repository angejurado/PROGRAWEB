package pe.edu.upc.entity;
import java.util.Date;    

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Membership")
public class Membership {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int IDMembership;

	@Column(name = "NMembership", nullable = false, length = 35)
	private String NMembership;	

	@Column(name = "FirtDate", nullable = false, length = 65)
	private Date FirtDate;
	
	private Date LastDate;
	

	/* constructores */
	public Membership() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Membership(int iDMembership, String nMembership, Date firtDate, Date lastDate) {
		super();
		IDMembership = iDMembership;
		NMembership = nMembership;
		FirtDate = firtDate;
		LastDate = lastDate;
	}


	public int getIDMembership() {
		return IDMembership;
	}


	public void setIDMembership(int iDMembership) {
		IDMembership = iDMembership;
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
