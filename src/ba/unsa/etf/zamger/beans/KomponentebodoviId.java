package ba.unsa.etf.zamger.beans;

// Generated May 20, 2015 3:15:09 PM by Hibernate Tools 3.4.0.CR1

/**
 * KomponentebodoviId generated by hbm2java
 */
public class KomponentebodoviId implements java.io.Serializable {

	private int student;
	private int predmet;
	private int komponenta;

	public KomponentebodoviId() {
	}

	public KomponentebodoviId(int student, int predmet, int komponenta) {
		this.student = student;
		this.predmet = predmet;
		this.komponenta = komponenta;
	}

	public int getStudent() {
		return this.student;
	}

	public void setStudent(int student) {
		this.student = student;
	}

	public int getPredmet() {
		return this.predmet;
	}

	public void setPredmet(int predmet) {
		this.predmet = predmet;
	}

	public int getKomponenta() {
		return this.komponenta;
	}

	public void setKomponenta(int komponenta) {
		this.komponenta = komponenta;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof KomponentebodoviId))
			return false;
		KomponentebodoviId castOther = (KomponentebodoviId) other;

		return (this.getStudent() == castOther.getStudent())
				&& (this.getPredmet() == castOther.getPredmet())
				&& (this.getKomponenta() == castOther.getKomponenta());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getStudent();
		result = 37 * result + this.getPredmet();
		result = 37 * result + this.getKomponenta();
		return result;
	}

}