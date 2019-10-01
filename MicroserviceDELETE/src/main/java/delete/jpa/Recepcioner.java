package delete.jpa;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;


/**
 * The persistent class for the recepcioner database table.
 * 
 */
@Entity
//@NamedQuery(name="Recepcioner.findAll", query="SELECT r FROM Recepcioner r")
public class Recepcioner implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RECEPCIONER_RECEPCIONERID_GENERATOR", sequenceName="RECEPCIONER_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RECEPCIONER_RECEPCIONERID_GENERATOR")
	@Column(name="recepcioner_id")
	private Integer recepcionerId;

	@Column(name="ime_rec")
	private String imeRec;

	@Column(name="prezime_rec")
	private String prezimeRec;

	//bi-directional many-to-one association to Termin
	@OneToMany(mappedBy="recepcioner")
	@JsonIgnore
	private List<Termin> termins;

	public Recepcioner() {
	}

	public Integer getRecepcionerId() {
		return this.recepcionerId;
	}

	public void setRecepcionerId(Integer recepcionerId) {
		this.recepcionerId = recepcionerId;
	}

	public String getImeRec() {
		return this.imeRec;
	}

	public void setImeRec(String imeRec) {
		this.imeRec = imeRec;
	}

	public String getPrezimeRec() {
		return this.prezimeRec;
	}

	public void setPrezimeRec(String prezimeRec) {
		this.prezimeRec = prezimeRec;
	}

	public List<Termin> getTermins() {
		return this.termins;
	}

	public void setTermins(List<Termin> termins) {
		this.termins = termins;
	}

	public Termin addTermin(Termin termin) {
		getTermins().add(termin);
		termin.setRecepcioner(this);

		return termin;
	}

	public Termin removeTermin(Termin termin) {
		getTermins().remove(termin);
		termin.setRecepcioner(null);

		return termin;
	}

}