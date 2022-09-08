package Apollo3.Apollo_3_spring.Entidades;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Perfil")
public class Perfil {

    @Id
    @Column
    private String id_perfil;
    @Column(length = 50)
    private String imagen;
    @Column(length = 50)
    private String telefono;
    @OneToOne
    @JoinColumn(name = "id_empleado")
    private Empleado empleado;
    @Column(nullable = false)
    private Calendar creacionAt;
    @Column
    private Calendar actualizacionAt;

    public Perfil() {
    }

    public Perfil(String id_perfil, String imagen, String telefono, Empleado empleado, Calendar creacionAt, Calendar actualizacionAt) {
        this.id_perfil = id_perfil;
        this.imagen = imagen;
        this.telefono = telefono;
        this.empleado = empleado;
        this.creacionAt = creacionAt;
        this.actualizacionAt = actualizacionAt;
    }

    public String getId_perfil() {
        return id_perfil;
    }

    public void setId_perfil(String id_perfil) {
        this.id_perfil = id_perfil;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Calendar getCreacionAt() {
        return creacionAt;
    }

    public void setCreacionAt(Calendar creacionAt) {
        this.creacionAt = creacionAt;
    }

    public Calendar getActualizacionAt() {
        return actualizacionAt;
    }

    public void setActualizacionAt(Calendar actualizacionAt) {
        this.actualizacionAt = actualizacionAt;
    }
}
