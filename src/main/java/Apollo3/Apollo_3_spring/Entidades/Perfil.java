package Apollo3.Apollo_3_spring.Entidades;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "Perfil")
public class Perfil {

    @Id
    @Column(unique = true, length = 30)
    private String id_perfil;
    @Column(length = 50)
    private String imagen;
    @Column(length = 50)
    private String telefono;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date creacionAt;
    @Temporal(TemporalType.TIMESTAMP)
    private Date actualizacionAt;

    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    public Set<Empleado> empleados;

    @PrePersist
    public void prePersist(){
        this.creacionAt = new Date();
    }

    public Perfil() {
    }

    public Perfil(String id_perfil, String imagen, String telefono, Date creacionAt, Date actualizacionAt) {
        this.id_perfil = id_perfil;
        this.imagen = imagen;
        this.telefono = telefono;
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
}
