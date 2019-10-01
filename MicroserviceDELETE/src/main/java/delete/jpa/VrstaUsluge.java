package delete.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the vrsta_usluge database table.
 * 
 */
@Entity
@Table(name="vrsta_usluge")
//@NamedQuery(name="VrstaUsluge.findAll", query="SELECT v FROM VrstaUsluge v")
public class VrstaUsluge implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="VRSTA_USLUGE_VRSTAUSLUGEID_GENERATOR", sequenceName="VRSTA_USLUGE_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="VRSTA_USLUGE_VRSTAUSLUGEID_GENERATOR")
	@Column(name="vrsta_usluge_id")
	private Integer vrstaUslugeId;

	@Column(name="naziv_vu")
	private String nazivVu;

	//bi-directional many-to-one association to Usluga
	@OneToMany(mappedBy="vrstaUsluge")
	@JsonIgnore
	private List<Usluga> uslugas;

	public VrstaUsluge() {
	}

	public Integer getVrstaUslugeId() {
		return this.vrstaUslugeId;
	}

	public void setVrstaUslugeId(Integer vrstaUslugeId) {
		this.vrstaUslugeId = vrstaUslugeId;
	}

	public String getNazivVu() {
		return this.nazivVu;
	}

	public void setNazivVu(String nazivVu) {
		this.nazivVu = nazivVu;
	}

	public List<Usluga> getUslugas() {
		return this.uslugas;
	}

	public void setUslugas(List<Usluga> uslugas) {
		this.uslugas = uslugas;
	}

	public Usluga addUsluga(Usluga usluga) {
		getUslugas().add(usluga);
		usluga.setVrstaUsluge(this);

		return usluga;
	}

	public Usluga removeUsluga(Usluga usluga) {
		getUslugas().remove(usluga);
		usluga.setVrstaUsluge(null);

		return usluga;
	}

}