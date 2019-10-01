package delete.jpa;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the racun database table.
 * 
 */
@Entity
//@NamedQuery(name="Racun.findAll", query="SELECT r FROM Racun r")
public class Racun implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="RACUN_RACUNID_GENERATOR", sequenceName="RACUN_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="RACUN_RACUNID_GENERATOR")
	@Column(name="racun_id")
	private Integer racunId;

	@Column(name="nacin_placanja")
	private String nacinPlacanja;

	//bi-directional many-to-one association to Usluga
	@ManyToOne
	@JoinColumn(name="usluga_id")
	private Usluga usluga;

	public Racun() {
	}

	public Integer getRacunId() {
		return this.racunId;
	}

	public void setRacunId(Integer racunId) {
		this.racunId = racunId;
	}

	public String getNacinPlacanja() {
		return this.nacinPlacanja;
	}

	public void setNacinPlacanja(String nacinPlacanja) {
		this.nacinPlacanja = nacinPlacanja;
	}

	public Usluga getUsluga() {
		return this.usluga;
	}

	public void setUsluga(Usluga usluga) {
		this.usluga = usluga;
	}

}