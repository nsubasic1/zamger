package ba.unsa.etf.zamger.beans;

// Generated May 20, 2015 3:15:09 PM by Hibernate Tools 3.4.0.CR1

/**
 * AnketaPredmetId generated by hbm2java
 */
public class AnketaPredmetId implements java.io.Serializable {

	private int anketa;
	private Integer predmet;
	private int akademskaGodina;
	private int semestar;
	private boolean aktivna;

	public AnketaPredmetId() {
	}

	public AnketaPredmetId(int anketa, int akademskaGodina, int semestar,
			boolean aktivna) {
		this.anketa = anketa;
		this.akademskaGodina = akademskaGodina;
		this.semestar = semestar;
		this.aktivna = aktivna;
	}

	public AnketaPredmetId(int anketa, Integer predmet, int akademskaGodina,
			int semestar, boolean aktivna) {
		this.anketa = anketa;
		this.predmet = predmet;
		this.akademskaGodina = akademskaGodina;
		this.semestar = semestar;
		this.aktivna = aktivna;
	}

	public int getAnketa() {
		return this.anketa;
	}

	public void setAnketa(int anketa) {
		this.anketa = anketa;
	}

	public Integer getPredmet() {
		return this.predmet;
	}

	public void setPredmet(Integer predmet) {
		this.predmet = predmet;
	}

	public int getAkademskaGodina() {
		return this.akademskaGodina;
	}

	public void setAkademskaGodina(int akademskaGodina) {
		this.akademskaGodina = akademskaGodina;
	}

	public int getSemestar() {
		return this.semestar;
	}

	public void setSemestar(int semestar) {
		this.semestar = semestar;
	}

	public boolean isAktivna() {
		return this.aktivna;
	}

	public void setAktivna(boolean aktivna) {
		this.aktivna = aktivna;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AnketaPredmetId))
			return false;
		AnketaPredmetId castOther = (AnketaPredmetId) other;

		return (this.getAnketa() == castOther.getAnketa())
				&& ((this.getPredmet() == castOther.getPredmet()) || (this
						.getPredmet() != null && castOther.getPredmet() != null && this
						.getPredmet().equals(castOther.getPredmet())))
				&& (this.getAkademskaGodina() == castOther.getAkademskaGodina())
				&& (this.getSemestar() == castOther.getSemestar())
				&& (this.isAktivna() == castOther.isAktivna());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAnketa();
		result = 37 * result
				+ (getPredmet() == null ? 0 : this.getPredmet().hashCode());
		result = 37 * result + this.getAkademskaGodina();
		result = 37 * result + this.getSemestar();
		result = 37 * result + (this.isAktivna() ? 1 : 0);
		return result;
	}

}