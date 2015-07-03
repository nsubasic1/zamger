package ba.unsa.etf.zamger.beans;

// Generated May 20, 2015 3:15:09 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * ProjekatRss generated by hbm2java
 */
public class ProjekatRss implements java.io.Serializable {

	private int id;
	private String naziv;
	private String url;
	private String opis;
	private int projekat;
	private int osoba;
	private Date vrijeme;

	public ProjekatRss() {
	}

	public ProjekatRss(int id, String naziv, String url, String opis,
			int projekat, int osoba, Date vrijeme) {
		this.id = id;
		this.naziv = naziv;
		this.url = url;
		this.opis = opis;
		this.projekat = projekat;
		this.osoba = osoba;
		this.vrijeme = vrijeme;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public int getProjekat() {
		return this.projekat;
	}

	public void setProjekat(int projekat) {
		this.projekat = projekat;
	}

	public int getOsoba() {
		return this.osoba;
	}

	public void setOsoba(int osoba) {
		this.osoba = osoba;
	}

	public Date getVrijeme() {
		return this.vrijeme;
	}

	public void setVrijeme(Date vrijeme) {
		this.vrijeme = vrijeme;
	}

}