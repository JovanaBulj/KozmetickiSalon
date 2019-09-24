package get.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Klijent;

public interface KlijentRepository extends JpaRepository<Klijent, Integer>{
	Collection<Klijent> findByPrezimeKContainingIgnoreCase(String name);
}
