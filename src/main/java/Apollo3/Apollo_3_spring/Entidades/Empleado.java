package Apollo3.Apollo_3_spring.Entidades;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table(name = "Empleado")
public class Empleado {

    //Creo los atributos
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id_empleado;
    @Column(length = 50, nullable = false)
    private String nombre;
    @Column(length = 50, nullable = false)
    private String correo;
    @OneToOne
    @JoinColumn(name = "id_perfil")
    private Perfil perfil;
    @Column(length = 20, nullable = false)
    private String rol;
    @ManyToOne
    @JoinColumn(name = "id_empresa")
    private Empresa empresa;
    @Column(nullable = false)
    private Calendar creacionAt;
    @Column
    private Calendar actualizacionAt;

    public Empleado() {
    }

    public Empleado(long id_empleado, String nombre, String correo, Perfil perfil, String rol, Empresa empresa, Calendar creacionAt, Calendar actualizacionAt) {
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
