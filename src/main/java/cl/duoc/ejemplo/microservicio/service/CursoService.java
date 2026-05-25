package cl.duoc.ejemplo.microservicio.service;

import cl.duoc.ejemplo.microservicio.entity.Curso;
import cl.duoc.ejemplo.microservicio.repository.CursoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CursoService {
    
    private final CursoRepository cursoRepository;
    
    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }
    
    public List<Curso> listarTodos() {
        return cursoRepository.findAll();
    }
    
    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }
    
    public Curso buscarPorId(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }
}
