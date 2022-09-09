package Apollo3.Apollo_3_spring.Entidades;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;

@Entity
@Table
public class Empleado {

    //Creo los atributos

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String email;
    private long perfilId;
    private long funcionId;
    private long empresa;
    private ArrayList<Long> transaccion;
    private Date actualizado;
    private Date creado;

    //Constructor
    public Empleado(long id, String email, long perfilId, long funcionId, long empresa, ArrayList<Long> transaccion, Date actualizado, Date creado) {
        this.id = id;
        this.email = email;
        this.perfilId = perfilId;
        this.funcionId = funcionId;
        this.empresa = empresa;
        this.transaccion = transaccion;
        this.actualizado = actualizado;
        this.creado = creado;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPerfilId() {
        return perfilId;
    }

    public void setPerfilId(long perfilId) {
        this.perfilId = perfilId;
    }

    public long getFuncionId() {
        return funcionId;
    }

    public void setFuncionId(long funcionId) {
        this.funcionId = funcionId;
    }

    public long getEmpresa() {
        return empresa;
    }

    public void setEmpresa(long empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Long> getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(ArrayList<Long> transaccion) {
        this.transaccion = transaccion;
    }

    public Date getActualizado() {
        return actualizado;
    }

    public void setActualizado(Date actualizado) {
        this.actualizado = actualizado;
    }

    public Date getCreado() {
        return creado;
    }

    public void setCreado(Date creado) {
        this.creado = creado;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", perfilId=" + perfilId +
                ", funcionId=" + funcionId +
                ", empresa=" + empresa +
                ", transaccion=" + transaccion +
                ", actualizado=" + actualizado +
                ", creado=" + creado +
                '}';
    }
}
