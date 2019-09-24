package get.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Recepcioner;

public interface RecepcionerRepository extends JpaRepository<Recepcioner, Integer> {
	Collection<Recepcioner> findByPrezimeRecContainingIgnoreCase(String name);
}
