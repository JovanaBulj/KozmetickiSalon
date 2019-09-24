package delete.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the specijalnost database table.
 * 
 */
@Entity
@NamedQuery(name="Specijalnost.findAll", query="SELECT s FROM Specijalnost s")
public class Specijalnost implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="SPECIJALNOST_SPECIJALNOSTID_GENERATOR", sequenceName="SPECIJALNOST_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SPECIJALNOST_SPECIJALNOSTID_GENERATOR")
	@Column(name="specijalnost_id")
	private Integer specijalnostId;

	@Column(name="naziv_spec")
	private String nazivSpec;

	//bi-directional many-to-one association to Zaposleni
	@OneToMany(mappedBy="specijalnost")
	@JsonIgnore
	private List<Zaposleni> zaposlenis;

	public Specijalnost() {
	}

	public Integer getSpecijalnostId() {
		return this.specijalnostId;
	}

	public void setSpecijalnostId(Integer specijalnostId) {
		this.specijalnostId = specijalnostId;
	}

	public String getNazivSpec() {
		return this.nazivSpec;
	}

	public void setNazivSpec(String nazivSpec) {
		this.nazivSpec = nazivSpec;
	}

	public List<Zaposleni> getZaposlenis() {
		return this.zaposlenis;
	}

	public void setZaposlenis(List<Zaposleni> zaposlenis) {
		this.zaposlenis = zaposlenis;
	}

	public Zaposleni addZaposleni(Zaposleni zaposleni) {
		getZaposlenis().add(zaposleni);
		zaposleni.setSpecijalnost(this);

		return zaposleni;
	}

	public Zaposleni removeZaposleni(Zaposleni zaposleni) {
		getZaposlenis().remove(zaposleni);
		zaposleni.setSpecijalnost(null);

		return zaposleni;
	}

}