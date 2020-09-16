package pe.edu.upc.entity;

	import java.util.Date;   

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "Card")
	public class Card {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int IDCard;

		@Column(name = "NumTCard", nullable = false, length = 35)
		private String NumTCard;
		
		@Column(name = "DExpiration", nullable = false, length = 45)
		private String DExpiration;
		
		@Column(name = "CPin", nullable = false, length = 55)
		private String CPin;
		

		/* constructores */
		public Card() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		
		public Card(int iDCard, String numTCard, String dExpiration, String cPin) {
			super();
			IDCard = iDCard;
			NumTCard = numTCard;
			DExpiration = dExpiration;
			CPin = cPin;
		}



		public int getIDCard() {
			return IDCard;
		}


		public void setIDCard(int iDCard) {
			IDCard = iDCard;
		}


		public String getNumTCard() {
			return NumTCard;
		}


		public void setNumTCard(String numTCard) {
			NumTCard = numTCard;
		}


		public String getDExpiration() {
			return DExpiration;
		}


		public void setDExpiration(String dExpiration) {
			DExpiration = dExpiration;
		}


		public String getCPin() {
			return CPin;
		}


		public void setCPin(String cPin) {
			CPin = cPin;
		}

		
	}

