package ba.unsa.etf.zamger.beans;

// Generated May 20, 2015 3:15:09 PM by Hibernate Tools 3.4.0.CR1

/**
 * Zvanje generated by hbm2java
 */
public class Zvanje implements java.io.Serializable {

	private Integer id;
	private String naziv;
	private String titula;

	public Zvanje() {
	}

	public Zvanje(String naziv, String titula) {
		this.naziv = naziv;
		this.titula = titula;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getTitula() {
		return this.titula;
	}

	public void setTitula(String titula) {
		this.titula = titula;
	}

}