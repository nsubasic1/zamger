package ba.unsa.etf.zamger.beans;

// Generated May 20, 2015 3:15:09 PM by Hibernate Tools 3.4.0.CR1

/**
 * TemaZaZadacuId generated by hbm2java
 */
public class TemaZaZadacuId implements java.io.Serializable {

	private int osoba;
	private int zadaca;

	public TemaZaZadacuId() {
	}

	public TemaZaZadacuId(int osoba, int zadaca) {
		this.osoba = osoba;
		this.zadaca = zadaca;
	}

	public int getOsoba() {
		return this.osoba;
	}

	public void setOsoba(int osoba) {
		this.osoba = osoba;
	}

	public int getZadaca() {
		return this.zadaca;
	}

	public void setZadaca(int zadaca) {
		this.zadaca = zadaca;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof TemaZaZadacuId))
			return false;
		TemaZaZadacuId castOther = (TemaZaZadacuId) other;

		return (this.getOsoba() == castOther.getOsoba())
				&& (this.getZadaca() == castOther.getZadaca());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getOsoba();
		result = 37 * result + this.getZadaca();
		return result;
	}

}