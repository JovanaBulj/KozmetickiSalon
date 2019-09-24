package delete.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;


/**
 * The persistent class for the klijent database table.
 * 
 */
@Entity
@NamedQuery(name="Klijent.findAll", query="SELECT k FROM Klijent k")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Klijent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="KLIJENT_KLIJENTID_GENERATOR", sequenceName="KLIJENT_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="KLIJENT_KLIJENTID_GENERATOR")
	@Column(name="klijent_id")
	private Integer klijentId;

	private String adresa;

	@Column(name="ime_k")
	private String imeK;

	private String kontakt;

	@Column(name="prezime_k")
	private String prezimeK;

	//bi-directional many-to-one association to Termin
	@OneToMany(mappedBy="klijent")
	@JsonIgnore
	private List<Termin> termins;

	public Klijent() {
	}

	public Integer getKlijentId() {
		return this.klijentId;
	}

	public void setKlijentId(Integer klijentId) {
		this.klijentId = klijentId;
	}

	public String getAdresa() {
		return this.adresa;
	}

	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}

	public String getImeK() {
		return this.imeK;
	}

	public void setImeK(String imeK) {
		this.imeK = imeK;
	}

	public String getKontakt() {
		return this.kontakt;
	}

	public void setKontakt(String kontakt) {
		this.kontakt = kontakt;
	}

	public String getPrezimeK() {
		return this.prezimeK;
	}

	public void setPrezimeK(String prezimeK) {
		this.prezimeK = prezimeK;
	}

	public List<Termin> getTermins() {
		return this.termins;
	}

	public void setTermins(List<Termin> termins) {
		this.termins = termins;
	}

	public Termin addTermin(Termin termin) {
		getTermins().add(termin);
		termin.setKlijent(this);

		return termin;
	}

	public Termin removeTermin(Termin termin) {
		getTermins().remove(termin);
		termin.setKlijent(null);

		return termin;
	}

}