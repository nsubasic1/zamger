package ba.unsa.etf.zamger.beans;

// Generated May 20, 2015 3:15:09 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * PrijemniTrenutnoEditujeId generated by hbm2java
 */
public class PrijemniTrenutnoEditujeId implements java.io.Serializable {

	private int prijemni;
	private Date vrijeme;

	public PrijemniTrenutnoEditujeId() {
	}

	public PrijemniTrenutnoEditujeId(int prijemni, Date vrijeme) {
		this.prijemni = prijemni;
		this.vrijeme = vrijeme;
	}

	public int getPrijemni() {
		return this.prijemni;
	}

	public void setPrijemni(int prijemni) {
		this.prijemni = prijemni;
	}

	public Date getVrijeme() {
		return this.vrijeme;
	}

	public void setVrijeme(Date vrijeme) {
		this.vrijeme = vrijeme;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PrijemniTrenutnoEditujeId))
			return false;
		PrijemniTrenutnoEditujeId castOther = (PrijemniTrenutnoEditujeId) other;

		return (this.getPrijemni() == castOther.getPrijemni())
				&& ((this.getVrijeme() == castOther.getVrijeme()) || (this
						.getVrijeme() != null && castOther.getVrijeme() != null && this
						.getVrijeme().equals(castOther.getVrijeme())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPrijemni();
		result = 37 * result
				+ (getVrijeme() == null ? 0 : this.getVrijeme().hashCode());
		return result;
	}

}