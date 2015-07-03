package ba.unsa.etf.zamger.beans;

// Generated May 20, 2015 3:15:09 PM by Hibernate Tools 3.4.0.CR1

/**
 * UpisKriterijId generated by hbm2java
 */
public class UpisKriterijId implements java.io.Serializable {

	private int prijemniTermin;
	private int studij;

	public UpisKriterijId() {
	}

	public UpisKriterijId(int prijemniTermin, int studij) {
		this.prijemniTermin = prijemniTermin;
		this.studij = studij;
	}

	public int getPrijemniTermin() {
		return this.prijemniTermin;
	}

	public void setPrijemniTermin(int prijemniTermin) {
		this.prijemniTermin = prijemniTermin;
	}

	public int getStudij() {
		return this.studij;
	}

	public void setStudij(int studij) {
		this.studij = studij;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UpisKriterijId))
			return false;
		UpisKriterijId castOther = (UpisKriterijId) other;

		return (this.getPrijemniTermin() == castOther.getPrijemniTermin())
				&& (this.getStudij() == castOther.getStudij());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPrijemniTermin();
		result = 37 * result + this.getStudij();
		return result;
	}

}