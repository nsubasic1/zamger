package ba.unsa.etf.zamger.beans;

// Generated May 20, 2015 3:15:09 PM by Hibernate Tools 3.4.0.CR1

/**
 * ProsliciklusUspjehId generated by hbm2java
 */
public class ProsliciklusUspjehId implements java.io.Serializable {

	private int osoba;
	private int fakultet;
	private int akademskaGodina;
	private int brojSemestara;
	private double opciUspjeh;
	private double dodatniBodovi;

	public ProsliciklusUspjehId() {
	}

	public ProsliciklusUspjehId(int osoba, int fakultet, int akademskaGodina,
			int brojSemestara, double opciUspjeh, double dodatniBodovi) {
		this.osoba = osoba;
		this.fakultet = fakultet;
		this.akademskaGodina = akademskaGodina;
		this.brojSemestara = brojSemestara;
		this.opciUspjeh = opciUspjeh;
		this.dodatniBodovi = dodatniBodovi;
	}

	public int getOsoba() {
		return this.osoba;
	}

	public void setOsoba(int osoba) {
		this.osoba = osoba;
	}

	public int getFakultet() {
		return this.fakultet;
	}

	public void setFakultet(int fakultet) {
		this.fakultet = fakultet;
	}

	public int getAkademskaGodina() {
		return this.akademskaGodina;
	}

	public void setAkademskaGodina(int akademskaGodina) {
		this.akademskaGodina = akademskaGodina;
	}

	public int getBrojSemestara() {
		return this.brojSemestara;
	}

	public void setBrojSemestara(int brojSemestara) {
		this.brojSemestara = brojSemestara;
	}

	public double getOpciUspjeh() {
		return this.opciUspjeh;
	}

	public void setOpciUspjeh(double opciUspjeh) {
		this.opciUspjeh = opciUspjeh;
	}

	public double getDodatniBodovi() {
		return this.dodatniBodovi;
	}

	public void setDodatniBodovi(double dodatniBodovi) {
		this.dodatniBodovi = dodatniBodovi;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ProsliciklusUspjehId))
			return false;
		ProsliciklusUspjehId castOther = (ProsliciklusUspjehId) other;

		return (this.getOsoba() == castOther.getOsoba())
				&& (this.getFakultet() == castOther.getFakultet())
				&& (this.getAkademskaGodina() == castOther.getAkademskaGodina())
				&& (this.getBrojSemestara() == castOther.getBrojSemestara())
				&& (this.getOpciUspjeh() == castOther.getOpciUspjeh())
				&& (this.getDodatniBodovi() == castOther.getDodatniBodovi());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getOsoba();
		result = 37 * result + this.getFakultet();
		result = 37 * result + this.getAkademskaGodina();
		result = 37 * result + this.getBrojSemestara();
		result = 37 * result + (int) this.getOpciUspjeh();
		result = 37 * result + (int) this.getDodatniBodovi();
		return result;
	}

}