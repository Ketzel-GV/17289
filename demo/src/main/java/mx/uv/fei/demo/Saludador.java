package mx.uv.fei.demo;
import jakarta.persistence.*;

@Entity
public class Saludador {
    @Id 
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Integer id;

    public Integer getId(){
        return id;
    }

    public void setId(){
        
    }
    private String contenido;

    public Saludador(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }
}