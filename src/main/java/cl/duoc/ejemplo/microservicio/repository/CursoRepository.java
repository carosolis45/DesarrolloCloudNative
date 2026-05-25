package cl.duoc.ejemplo.microservicio.repository;

import cl.duoc.ejemplo.microservicio.entity.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
