package Apollo3.Apollo_3_spring.Entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Empresa")
public class Empresa {

    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_empresa;
    @Column(unique = true, length = 50, nullable = false)
    private String nombre;
    @Column(unique = true, length = 50, nullable = false)
    private String nit;
    @Column(length = 20, nullable = false)
    private String telefono;
    @Column(length = 50, nullable = false)
    private String direccion;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date creacionAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizacionAt;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Set<Empleado> empleados;

    @OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Set<MovimientoDinero> movimientoDineros;

    @PrePersist
    public void prePersist(){
        this.creacionAt = new Date();
    }

    public Empresa() {
    }

    public Empresa(long id_empresa, String nombre, String nit, String telefono, String direccion, Date creacionAt, Date actualizacionAt) {
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

    public Date getCreacionAt() {
        return creacionAt;
    }

    public void setCreacionAt(Date creacionAt) {
        this.creacionAt = creacionAt;
    }

    public Date getActualizacionAt() {
        return actualizacionAt;
    }

    public void setActualizacionAt(Date actualizacionAt) {
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
