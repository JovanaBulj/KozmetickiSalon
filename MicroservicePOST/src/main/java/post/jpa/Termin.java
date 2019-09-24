package post.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the termin database table.
 * 
 */
@Entity
@NamedQuery(name="Termin.findAll", query="SELECT t FROM Termin t")
public class Termin implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="TERMIN_TERMINID_GENERATOR", sequenceName="TERMIN_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="TERMIN_TERMINID_GENERATOR")
	@Column(name="termin_id")
	private Integer terminId;

	@Temporal(TemporalType.DATE)
	private Date datum;

	//bi-directional many-to-one association to Klijent
	@ManyToOne
	@JoinColumn(name="klijent_id")
	private Klijent klijent;

	//bi-directional many-to-one association to Recepcioner
	@ManyToOne
	@JoinColumn(name="recepcioner_id")
	private Recepcioner recepcioner;

	//bi-directional many-to-one association to Usluga
	@OneToMany(mappedBy="termin")
	@JsonIgnore
	private List<Usluga> uslugas;

	public Termin() {
	}

	public Integer getTerminId() {
		return this.terminId;
	}

	public void setTerminId(Integer terminId) {
		this.terminId = terminId;
	}

	public Date getDatum() {
		return this.datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Klijent getKlijent() {
		return this.klijent;
	}

	public void setKlijent(Klijent klijent) {
		this.klijent = klijent;
	}

	public Recepcioner getRecepcioner() {
		return this.recepcioner;
	}

	public void setRecepcioner(Recepcioner recepcioner) {
		this.recepcioner = recepcioner;
	}

	public List<Usluga> getUslugas() {
		return this.uslugas;
	}

	public void setUslugas(List<Usluga> uslugas) {
		this.uslugas = uslugas;
	}

	public Usluga addUsluga(Usluga usluga) {
		getUslugas().add(usluga);
		usluga.setTermin(this);

		return usluga;
	}

	public Usluga removeUsluga(Usluga usluga) {
		getUslugas().remove(usluga);
		usluga.setTermin(null);

		return usluga;
	}

}