package Apollo3.Apollo_3_spring.Entidades;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Empleado")
public class Empleado {

    //Creo los atributos
    @Id
    @Column(unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id_empleado;
    @Column(length = 50, nullable = false)
    private String nombre;
    @Column(length = 50, nullable = false)
    private String correo;
    @OneToOne
    @JoinColumn(name = "id_perfil", referencedColumnName = "id_perfil", nullable = false)
    private Perfil perfil;
    @Column(length = 20, nullable = false)
    private String rol;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_empresa", referencedColumnName = "id_empresa", nullable = false)
    private Empresa empresa;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date creacionAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizacionAt;

    @PrePersist
    public void prePersist(){
        this.creacionAt = new Date();
    }

    public Empleado() {
    }

    public Empleado(long id_empleado, String nombre, String correo, Perfil perfil, String rol, Empresa empresa, Date creacionAt, Date actualizacionAt) {
        this.id_empleado = id_empleado;
        this.nombre = nombre;
        this.correo = correo;
        this.perfil = perfil;
        this.rol = rol;
        this.empresa = empresa;
        this.creacionAt = creacionAt;
        this.actualizacionAt = actualizacionAt;
    }

    public long getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado(long id_empleado) {
        this.id_empleado = id_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
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
        return "Empleado{" +
                "id_empleado=" + id_empleado +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", perfil=" + perfil +
                ", rol='" + rol + '\'' +
                ", empresa=" + empresa +
                ", creacionAt=" + creacionAt +
                ", actualizacionAt=" + actualizacionAt +
                '}';
    }
}
