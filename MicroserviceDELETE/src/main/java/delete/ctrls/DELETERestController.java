package delete.ctrls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import delete.jpa.Klijent;
import delete.jpa.Racun;
import delete.jpa.Recepcioner;
import delete.jpa.Specijalnost;
import delete.jpa.Termin;
import delete.jpa.Usluga;
import delete.jpa.VrstaUsluge;
import delete.jpa.Zaposleni;
import delete.reps.KlijentRepository;
import delete.reps.RacunRepository;
import delete.reps.RecepcionerRepository;
import delete.reps.SpecijalnostRepository;
import delete.reps.TerminRepository;
import delete.reps.UslugaRepository;
import delete.reps.VrstaUslugeRepository;
import delete.reps.ZaposleniRepository;

@RestController
public class DELETERestController {

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
		
		@DeleteMapping("klijent/{id}")
		public ResponseEntity<Klijent> deleteKlijent(@PathVariable ("id") Integer id){
			if(!klijentRepository.existsById(id))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			klijentRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		// Racun //
		
		@DeleteMapping("racun/{id}")
		public ResponseEntity<Racun> deleteRacun(@PathVariable ("id") Integer id){
			if(!racunRepository.existsById(id))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			racunRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		// Recepcioner //
		
		@DeleteMapping("recepcioner/{id}")
		public ResponseEntity<Recepcioner> deleteRecepcioner(@PathVariable ("id") Integer id){
			if(!recepcionerRepository.existsById(id))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			recepcionerRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		
		// Specijalnost //
		

		@DeleteMapping("specijalnost/{id}")
		public ResponseEntity<Specijalnost> deleteSpecijalnost(@PathVariable ("id") Integer id){
			if(!specijalnostRepository.existsById(id))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			specijalnostRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		
		// Termin //
		
		@DeleteMapping("termin/{id}")
		public ResponseEntity<Termin> deleteTermin(@PathVariable ("id") Integer id){
			if(!terminRepository.existsById(id))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			terminRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		// Usluga //
		
		@DeleteMapping("usluga/{id}")
		public ResponseEntity<Usluga> deleteUsluga(@PathVariable ("id") Integer id){
			if(!uslugaRepository.existsById(id))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			uslugaRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		// Vrsta Usluge // 
		
		@DeleteMapping("vrstaUsluge/{id}")
		public ResponseEntity<VrstaUsluge> deleteVrstaUsluge(@PathVariable ("id") Integer id){
			if(!vrstaUslugeRepository.existsById(id))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			vrstaUslugeRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		
		
		
		// Zaposleni //
		
		@DeleteMapping("zaposleni/{id}")
		public ResponseEntity<Zaposleni> deleteZaposleni(@PathVariable ("id") Integer id){
			if(!zaposleniRepository.existsById(id))
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			zaposleniRepository.deleteById(id);
			return new ResponseEntity<>(HttpStatus.OK);
		}
}

