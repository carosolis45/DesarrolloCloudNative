package cl.duoc.ejemplo.microservicio.dto;

import java.math.BigDecimal;
import java.util.List;

public class ResumenInscripcionDTO {
    private String estudiante;
    private List<CursoDTO> cursos;
    private BigDecimal total;
    private String fecha;
    
    public String getEstudiante() { return estudiante; }
    public void setEstudiante(String estudiante) { this.estudiante = estudiante; }
    public List<CursoDTO> getCursos() { return cursos; }
    public void setCursos(List<CursoDTO> cursos) { this.cursos = cursos; }
    public BigDecimal getTotal() { return total; }
    public void setTotal(BigDecimal total) { this.total = total; }
    public String getFecha() { return fecha; }
    public void setFecha(String fecha) { this.fecha = fecha; }
    
    public static class CursoDTO {
        private String nombre;
        private String instructor;
        private String duracion;
        private BigDecimal costo;
        
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        public String getInstructor() { return instructor; }
        public void setInstructor(String instructor) { this.instructor = instructor; }
        public String getDuracion() { return duracion; }
        public void setDuracion(String duracion) { this.duracion = duracion; }
        public BigDecimal getCosto() { return costo; }
        public void setCosto(BigDecimal costo) { this.costo = costo; }
    }
}