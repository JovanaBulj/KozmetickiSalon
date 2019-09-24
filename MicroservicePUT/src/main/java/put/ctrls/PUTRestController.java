package put.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import put.jpa.Klijent;
import put.jpa.Racun;
import put.jpa.Recepcioner;
import put.jpa.Specijalnost;
import put.jpa.Termin;
import put.jpa.Usluga;
import put.jpa.VrstaUsluge;
import put.jpa.Zaposleni;
import put.reps.KlijentRepository;
import put.reps.RacunRepository;
import put.reps.RecepcionerRepository;
import put.reps.SpecijalnostRepository;
import put.reps.TerminRepository;
import put.reps.UslugaRepository;
import put.reps.VrstaUslugeRepository;
import put.reps.ZaposleniRepository;

@RestController
public class PUTRestController {


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
	
		//azuriranje klijenta u bp
		@PutMapping("klijent")
		public ResponseEntity<Klijent> updateKlijent(@RequestBody Klijent klijent){
			if(!klijentRepository.existsById(klijent.getKlijentId()))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			klijentRepository.save(klijent);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		
		// Racun //
		
		//unos novog racuna u bp
		@PutMapping("racun")
		public ResponseEntity<Racun> updateRacun(@RequestBody Racun racun){
			if(!racunRepository.existsById(racun.getRacunId()))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			racunRepository.save(racun);
			return new ResponseEntity<>(HttpStatus.OK);
		}
			
			
		
		// Recepcioner // 
			
		
		//unos novog recepcionera u bp
		@PutMapping("recepcioner")
		public ResponseEntity<Recepcioner> updateRecepcioner(@RequestBody Recepcioner recepcioner){
			if(!recepcionerRepository.existsById(recepcioner.getRecepcionerId()))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			recepcionerRepository.save(recepcioner);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		// Specijalnost //
		
		
		// unos nove specijalnosti u bp
		@PutMapping("specijalnost")
		public ResponseEntity<Specijalnost> updateSpecijalnost(@RequestBody Specijalnost specijalnost){
			if(!specijalnostRepository.existsById(specijalnost.getSpecijalnostId()))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			specijalnostRepository.save(specijalnost);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		// Termin //
		
		//unos novog termina u bp
		@PutMapping("termin")
		public ResponseEntity<Termin> updateTermin(@RequestBody Termin termin){
			if(!terminRepository.existsById(termin.getTerminId()))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			terminRepository.save(termin);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		
		// Usluga //
		
		
		// Unos nove usluge u bp 
		@PutMapping("usluga")
		public ResponseEntity<Usluga> updateUsluga(@RequestBody Usluga usluga){
			if(!uslugaRepository.existsById(usluga.getUslugaId()))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			uslugaRepository.save(usluga);
			return new ResponseEntity<>(HttpStatus.OK);

		}
		
		
		// Vrsta Usluge //
		
		// Unos nove vrste usluge u bp 
		@PutMapping("vrstaUsluge")
		public ResponseEntity<VrstaUsluge> updateVrstaUsluge(@RequestBody VrstaUsluge vrstaUsluge){
			if(!vrstaUslugeRepository.existsById(vrstaUsluge.getVrstaUslugeId()))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			vrstaUslugeRepository.save(vrstaUsluge);
			return new ResponseEntity<>(HttpStatus.OK);

		}
		
		
		// Zaposleni //
		
		//unos novog zaposlenog u bp
		@PutMapping("zaposleni")
		public ResponseEntity<Zaposleni> updateZaposleni(@RequestBody Zaposleni zaposleni){
			if(!zaposleniRepository.existsById(zaposleni.getZaposleniId()))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			zaposleniRepository.save(zaposleni);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
	
}
