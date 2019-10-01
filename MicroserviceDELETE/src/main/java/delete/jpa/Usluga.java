package delete.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.util.List;


/**
 * The persistent class for the usluga database table.
 * 
 */
@Entity
//@NamedQuery(name="Usluga.findAll", query="SELECT u FROM Usluga u")
public class Usluga implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="USLUGA_USLUGAID_GENERATOR", sequenceName="USLUGA_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="USLUGA_USLUGAID_GENERATOR")
	@Column(name="usluga_id")
	private Integer uslugaId;

	@Column(name="cena_usluge")
	private BigDecimal cenaUsluge;

	//bi-directional many-to-one association to Racun
	@OneToMany(mappedBy="usluga")
	@JsonIgnore
	private List<Racun> racuns;

	//bi-directional many-to-one association to Termin
	@ManyToOne
	@JoinColumn(name="termin_id")
	private Termin termin;

	//bi-directional many-to-one association to VrstaUsluge
	@ManyToOne
	@JoinColumn(name="vrsta_usluge_id")
	private VrstaUsluge vrstaUsluge;

	//bi-directional many-to-one association to Zaposleni
	@ManyToOne
	@JoinColumn(name="zaposleni_id")
	private Zaposleni zaposleni;

	public Usluga() {
	}

	public Integer getUslugaId() {
		return this.uslugaId;
	}

	public void setUslugaId(Integer uslugaId) {
		this.uslugaId = uslugaId;
	}

	public BigDecimal getCenaUsluge() {
		return this.cenaUsluge;
	}

	public void setCenaUsluge(BigDecimal cenaUsluge) {
		this.cenaUsluge = cenaUsluge;
	}

	public List<Racun> getRacuns() {
		return this.racuns;
	}

	public void setRacuns(List<Racun> racuns) {
		this.racuns = racuns;
	}

	public Racun addRacun(Racun racun) {
		getRacuns().add(racun);
		racun.setUsluga(this);

		return racun;
	}

	public Racun removeRacun(Racun racun) {
		getRacuns().remove(racun);
		racun.setUsluga(null);

		return racun;
	}

	public Termin getTermin() {
		return this.termin;
	}

	public void setTermin(Termin termin) {
		this.termin = termin;
	}

	public VrstaUsluge getVrstaUsluge() {
		return this.vrstaUsluge;
	}

	public void setVrstaUsluge(VrstaUsluge vrstaUsluge) {
		this.vrstaUsluge = vrstaUsluge;
	}

	public Zaposleni getZaposleni() {
		return this.zaposleni;
	}

	public void setZaposleni(Zaposleni zaposleni) {
		this.zaposleni = zaposleni;
	}

}