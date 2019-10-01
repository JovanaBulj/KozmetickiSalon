package delete.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the zaposleni database table.
 * 
 */
@Entity
//@NamedQuery(name="Zaposleni.findAll", query="SELECT z FROM Zaposleni z")
public class Zaposleni implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="ZAPOSLENI_ZAPOSLENIID_GENERATOR", sequenceName="ZAPOSLENI_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ZAPOSLENI_ZAPOSLENIID_GENERATOR")
	@Column(name="zaposleni_id")
	private Integer zaposleniId;

	@Column(name="ime_zap")
	private String imeZap;

	@Column(name="prezime_zap")
	private String prezimeZap;

	private Boolean prijavljen;

	//bi-directional many-to-one association to Usluga
	@OneToMany(mappedBy="zaposleni")
	@JsonIgnore
	private List<Usluga> uslugas;

	//bi-directional many-to-one association to Specijalnost
	@ManyToOne
	@JoinColumn(name="specijalnost_id")
	private Specijalnost specijalnost;

	public Zaposleni() {
	}

	public Integer getZaposleniId() {
		return this.zaposleniId;
	}

	public void setZaposleniId(Integer zaposleniId) {
		this.zaposleniId = zaposleniId;
	}

	public String getImeZap() {
		return this.imeZap;
	}

	public void setImeZap(String imeZap) {
		this.imeZap = imeZap;
	}

	public String getPrezimeZap() {
		return this.prezimeZap;
	}

	public void setPrezimeZap(String prezimeZap) {
		this.prezimeZap = prezimeZap;
	}

	public Boolean getPrijavljen() {
		return this.prijavljen;
	}

	public void setPrijavljen(Boolean prijavljen) {
		this.prijavljen = prijavljen;
	}

	public List<Usluga> getUslugas() {
		return this.uslugas;
	}

	public void setUslugas(List<Usluga> uslugas) {
		this.uslugas = uslugas;
	}

	public Usluga addUsluga(Usluga usluga) {
		getUslugas().add(usluga);
		usluga.setZaposleni(this);

		return usluga;
	}

	public Usluga removeUsluga(Usluga usluga) {
		getUslugas().remove(usluga);
		usluga.setZaposleni(null);

		return usluga;
	}

	public Specijalnost getSpecijalnost() {
		return this.specijalnost;
	}

	public void setSpecijalnost(Specijalnost specijalnost) {
		this.specijalnost = specijalnost;
	}

}