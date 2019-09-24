package post.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import post.jpa.Klijent;
import post.jpa.Racun;
import post.jpa.Recepcioner;
import post.jpa.Specijalnost;
import post.jpa.Termin;
import post.jpa.Usluga;
import post.jpa.VrstaUsluge;
import post.jpa.Zaposleni;
import post.reps.KlijentRepository;
import post.reps.RacunRepository;
import post.reps.RecepcionerRepository;
import post.reps.SpecijalnostRepository;
import post.reps.TerminRepository;
import post.reps.UslugaRepository;
import post.reps.VrstaUslugeRepository;
import post.reps.ZaposleniRepository;

@RestController
public class POSTRestController {

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
	
	//unos novog klijenta u bp
	@PostMapping("klijent")
	public ResponseEntity<Klijent> insertKlijent(@RequestBody Klijent klijent){
		if(klijentRepository.existsById(klijent.getKlijentId()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		klijentRepository.save(klijent);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	// Racun //
	
	//unos novog racuna u bp
	@PostMapping("racun")
	public ResponseEntity<Racun> insertRacun(@RequestBody Racun racun){
		if(racunRepository.existsById(racun.getRacunId()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		racunRepository.save(racun);
		return new ResponseEntity<>(HttpStatus.OK);
	}
		
		
	
	// Recepcioner // 
		
	
	//unos novog recepcionera u bp
	@PostMapping("recepcioner")
	public ResponseEntity<Recepcioner> insertRecepcioner(@RequestBody Recepcioner recepcioner){
		if(recepcionerRepository.existsById(recepcioner.getRecepcionerId()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		recepcionerRepository.save(recepcioner);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	// Specijalnost //
	
	
	// unos nove specijalnosti u bp
	@PostMapping("specijalnost")
	public ResponseEntity<Specijalnost> insertSpecijalnost(@RequestBody Specijalnost specijalnost){
		if(specijalnostRepository.existsById(specijalnost.getSpecijalnostId()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		specijalnostRepository.save(specijalnost);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	// Termin //
	
	//unos novog termina u bp
	@PostMapping("termin")
	public ResponseEntity<Termin> insertTermin(@RequestBody Termin termin){
		if(terminRepository.existsById(termin.getTerminId()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		terminRepository.save(termin);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	// Usluga //
	
	
	// Unos nove usluge u bp 
	@PostMapping("usluga")
	public ResponseEntity<Usluga> insertUsluga(@RequestBody Usluga usluga){
		if(uslugaRepository.existsById(usluga.getUslugaId()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		uslugaRepository.save(usluga);
		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	
	// Vrsta Usluge //
	
	// Unos nove vrste usluge u bp 
	@PostMapping("vrstaUsluge")
	public ResponseEntity<VrstaUsluge> insertVrstaUsluge(@RequestBody VrstaUsluge vrstaUsluge){
		if(vrstaUslugeRepository.existsById(vrstaUsluge.getVrstaUslugeId()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		vrstaUslugeRepository.save(vrstaUsluge);
		return new ResponseEntity<>(HttpStatus.OK);

	}
	
	
	// Zaposleni //
	
	//unos novog zaposlenog u bp
	@PostMapping("zaposleni")
	public ResponseEntity<Zaposleni> insertZaposleni(@RequestBody Zaposleni zaposleni){
		if(zaposleniRepository.existsById(zaposleni.getZaposleniId()))
			return new ResponseEntity<>(HttpStatus.CONFLICT);
		zaposleniRepository.save(zaposleni);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
	
}
