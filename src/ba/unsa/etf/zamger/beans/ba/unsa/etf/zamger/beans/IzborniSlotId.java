package ba.unsa.etf.zamger.beans;

// Generated May 26, 2015 12:09:40 PM by Hibernate Tools 3.4.0.CR1

/**
 * IzborniSlotId generated by hbm2java
 */
public class IzborniSlotId implements java.io.Serializable {

	private int id;
	private int predmet;

	public IzborniSlotId() {
	}

	public IzborniSlotId(int id, int predmet) {
		this.id = id;
		this.predmet = predmet;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPredmet() {
		return this.predmet;
	}

	public void setPredmet(int predmet) {
		this.predmet = predmet;
	}

}