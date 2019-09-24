package get.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.VrstaUsluge;

public interface VrstaUslugeRepository extends JpaRepository<VrstaUsluge, Integer>{
	Collection<VrstaUsluge> findByNazivVuContainingIgnoreCase(String name);
}
