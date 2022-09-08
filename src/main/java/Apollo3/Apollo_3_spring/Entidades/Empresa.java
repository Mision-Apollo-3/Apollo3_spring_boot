package Apollo3.Apollo_3_spring.Entidades;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Empresa")
public class Empresa {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_empresa;
    @Column(unique = true, length = 50, nullable = false)
    private String nombre;
    @Column(unique = true, length = 50, nullable = false)
    private String nit;
    @Column(length = 20, nullable = false)
    private String telefono;
    @Column(length = 50, nullable = false)
    private String direccion;
    @Column(nullable = false)
    private Calendar creacionAt;
    @Column
    private Calendar actualizacionAt;

    public Empresa() {
    }

    public Empresa(long id_empresa, String nombre, String nit, String telefono, String direccion, Calendar creacionAt, Calendar actualizacionAt) {
        this.id_empresa = id_empresa;
        this.nombre = nombre;
        this.nit = nit;
        this.telefono = telefono;
        this.direccion = direccion;
        this.creacionAt = creacionAt;
        this.actualizacionAt = actualizacionAt;
    }

    public long getId_empresa() {
        return id_empresa;
    }

    public void setId_empresa(long id_empresa) {
        this.id_empresa = id_empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    @Override
    public String toString() {
        return "Empresa{" +
                "id_empresa=" + id_empresa +
                ", nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                ", creacionAt=" + creacionAt +
                ", actualizacionAt=" + actualizacionAt +
                '}';
    }
}
