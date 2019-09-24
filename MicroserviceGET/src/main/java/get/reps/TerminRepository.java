package get.reps;

//import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Termin;

public interface TerminRepository extends JpaRepository<Termin, Integer>{
	//Collection<Termin> findBy
}
