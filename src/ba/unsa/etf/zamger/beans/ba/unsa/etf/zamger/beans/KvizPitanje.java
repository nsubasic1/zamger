package ba.unsa.etf.zamger.beans;

// Generated May 26, 2015 12:09:40 PM by Hibernate Tools 3.4.0.CR1

/**
 * KvizPitanje generated by hbm2java
 */
public class KvizPitanje implements java.io.Serializable {

	private Integer id;
	private Kviz kviz;
	private String tip;
	private String tekst;
	private float bodova;
	private boolean vidljivo;
	private int ukupno;
	private int tacnih;

	public KvizPitanje() {
	}

	public KvizPitanje(Kviz kviz, String tip, String tekst, float bodova,
			boolean vidljivo, int ukupno, int tacnih) {
		this.kviz = kviz;
		this.tip = tip;
		this.tekst = tekst;
		this.bodova = bodova;
		this.vidljivo = vidljivo;
		this.ukupno = ukupno;
		this.tacnih = tacnih;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Kviz getKviz() {
		return this.kviz;
	}

	public void setKviz(Kviz kviz) {
		this.kviz = kviz;
	}

	public String getTip() {
		return this.tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public String getTekst() {
		return this.tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public float getBodova() {
		return this.bodova;
	}

	public void setBodova(float bodova) {
		this.bodova = bodova;
	}

	public boolean isVidljivo() {
		return this.vidljivo;
	}

	public void setVidljivo(boolean vidljivo) {
		this.vidljivo = vidljivo;
	}

	public int getUkupno() {
		return this.ukupno;
	}

	public void setUkupno(int ukupno) {
		this.ukupno = ukupno;
	}

	public int getTacnih() {
		return this.tacnih;
	}

	public void setTacnih(int tacnih) {
		this.tacnih = tacnih;
	}

}