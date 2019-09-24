package get.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Specijalnost;

public interface SpecijalnostRepository extends JpaRepository<Specijalnost, Integer>{
		Collection<Specijalnost> findByNazivSpecContainingIgnoreCase(String name);

}
