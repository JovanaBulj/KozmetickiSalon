package get.ctrls;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import get.jpa.Klijent;
import get.jpa.Racun;
import get.jpa.Recepcioner;
import get.jpa.Specijalnost;
import get.jpa.Termin;
import get.jpa.Usluga;
import get.jpa.VrstaUsluge;
import get.jpa.Zaposleni;
import get.reps.KlijentRepository;
import get.reps.RacunRepository;
import get.reps.RecepcionerRepository;
import get.reps.SpecijalnostRepository;
import get.reps.TerminRepository;
import get.reps.UslugaRepository;
import get.reps.VrstaUslugeRepository;
import get.reps.ZaposleniRepository;

@RestController
public class GETRestController {

	@Autowired
	private KlijentRepository klijentRepository;
	
	@Autowired
	private RacunRepository racunRepository;
	
	@Autowired
	private RecepcionerRepository recepcionerRepository;
	
	@Autowired
	private SpecijalnostRepository specijalnostRepository;
	
	@Autowired
	private TerminRepository terminRepository;
	
	@Autowired
	private UslugaRepository uslugaRepository;
	
	@Autowired
	private VrstaUslugeRepository vrstaUslugeRepository;
	
	@Autowired
	private ZaposleniRepository zaposleniRepository;
	
	
	// Klijent //
	
	//vraca kolekciju svih klijenata iz bp
	@GetMapping("klijent")
	public Collection<Klijent> getKlijenti(){
		return klijentRepository.findAll();
	}
	
	//vraca klijenta iz bp ciji je id zadata vrednost
	@GetMapping("klijent/{id}")
	public ResponseEntity<Klijent> getKlijent(@PathVariable("id") Integer id){
		Klijent klijent = klijentRepository.getOne(id);
		return new ResponseEntity<Klijent>(klijent, HttpStatus.OK);
	}
	
	
	//vraca klijenta iz bp cije je prezime zadata vrednost
	@GetMapping("klijentPrezime/{prezime}")
	public Collection<Klijent> getKlijentPrezime(@PathVariable("klijentPrezime") String klijentPrezime){
		return klijentRepository.findByPrezimeKContainingIgnoreCase(klijentPrezime);
	}
	
	
	// Racun //
	
	//vraca kolekciju svih racuna iz bp
	@GetMapping("racun")
	public Collection<Racun> getRacuni(){
		return racunRepository.findAll();
	}
	
	//vraca racun iz bp ciji je id zadata vrednost
	@GetMapping("racun/{id}")
	public ResponseEntity<Racun> getRacun(@PathVariable("id") Integer id) {
		Racun racun = racunRepository.getOne(id);
		return new ResponseEntity<Racun>(racun,HttpStatus.OK);
	}
	
	
	// Recepcioner //
	
	
	// Vraca kolekciju svih recepcionera iz bp
	@GetMapping("recepcioner")
	public Collection<Recepcioner> getRecepcioneri(){
		return recepcionerRepository.findAll();
	}
	
	//vraca recepcionera sa datim id-jem
	@GetMapping("recepcioner/{id}")
	public ResponseEntity<Recepcioner> getRecepcioner(@PathVariable("id") Integer id) {
		Recepcioner recepcioner = recepcionerRepository.getOne(id);
		return new ResponseEntity<Recepcioner>(recepcioner,HttpStatus.OK);
	}
	
	//vraca recepcionera iz bp cije je prezime zadata vrednost
	@GetMapping("recepcionerPrezime/{prezime}")
	public Collection<Recepcioner> getRecepcionerPrezime(@PathVariable("recepcionerPrezime") String recepcionerPrezime){
		return recepcionerRepository.findByPrezimeRecContainingIgnoreCase(recepcionerPrezime);
	}	
	
	
	// Specijalnost //
	
	@GetMapping("specijalnost")
	public Collection<Specijalnost> getSpecijalnosti(){
		return specijalnostRepository.findAll();		
	}
	
	@GetMapping("specijalnost/{id}")
	public ResponseEntity<Specijalnost> getSpecijalnost(@PathVariable("id") Integer id){
		Specijalnost specijalnost = specijalnostRepository.getOne(id);
		return new ResponseEntity<Specijalnost>(specijalnost,HttpStatus.OK);
				
	}
	
	
	// Termin //
	
	@GetMapping("termin")
	public Collection<Termin> getTermini(){
		return terminRepository.findAll();
	}
	
	@GetMapping("termin/{id}")
	public ResponseEntity<Termin> getTermin(@PathVariable("id") Integer id){
		Termin termin = terminRepository.getOne(id);
		return new ResponseEntity<Termin>(termin, HttpStatus.OK);
	}
	
	
	// Usluga //
	
	@GetMapping("usluga")
	public Collection<Usluga> getUsluge(){
		return uslugaRepository.findAll();
	}
	
	@GetMapping("usluga/{id}")
	public ResponseEntity<Usluga> getUsluga(@PathVariable("id") Integer id){
		Usluga usluga = uslugaRepository.getOne(id);
		return new ResponseEntity<Usluga>(usluga, HttpStatus.OK);
	}
	
	
	
	// Vrsta Usluge //
	
	
	@GetMapping("vrstaUsluge")
	public Collection<VrstaUsluge> getVrsteUsluga(){
		return vrstaUslugeRepository.findAll();
	}	
	
	
	@GetMapping("vrstaUsluge/{id}")
	public ResponseEntity<VrstaUsluge> getVrstaUsluge(@PathVariable("id") Integer id){
		VrstaUsluge vrstaUsluge = vrstaUslugeRepository.getOne(id);
		return new ResponseEntity<VrstaUsluge>(vrstaUsluge, HttpStatus.OK);
	}
	
	@GetMapping("vrstaUslugeNaziv/{naziv}")
	public Collection<VrstaUsluge> getVrstaUslugeNaziv(@PathVariable("vrstaUslugeNaziv") String vrstaUslugeNaziv){
		return vrstaUslugeRepository.findByNazivVuContainingIgnoreCase(vrstaUslugeNaziv);
	}
		
	
	
	// Zaposleni //
	
	
	@GetMapping("zaposleni")
	public Collection<Zaposleni> getZaposleni(){
		return zaposleniRepository.findAll();
	}
	
	@GetMapping("zaposleni/{id}")
	public ResponseEntity<Zaposleni> getZaposleni(@PathVariable("id") Integer id){
		Zaposleni zaposleni = zaposleniRepository.getOne(id);
		return new ResponseEntity<Zaposleni>(zaposleni, HttpStatus.OK);
	}
	
	
	
}
