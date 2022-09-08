package Apollo3.Apollo_3_spring.Entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Empleado {

    //Creo los atributos

    @Id
    @Column(unique=true, length =30)
    private int ID;
    @Column(nullable=false, length=50)
    private String correo;
    @Column(nullable=false, length=50)
    private String perfil;
    @Column(nullable=false, length=50)
    private String funcion;
    @Column(nullable=false, length=50)
    private String empresa;
    @Column(nullable=false, length=50)
    private String transacciones;
    @Column(nullable=false, length=50)
    private String actualizar;
    @Column(nullable=false, length=50)
    private String crear;

    //Constructor


    public Empleado(int ID, String correo, String perfil, String funcion, String empresa, String transacciones, String actualizar, String crear) {
        this.ID = ID;
        this.correo = correo;
        this.perfil = perfil;
        this.funcion = funcion;
        this.empresa = empresa;
        this.transacciones = transacciones;
        this.actualizar = actualizar;
        this.crear = crear;
    }

    public String getID() {
        return String.valueOf(ID);
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getTransacciones() {
        return transacciones;
    }

    public void setTransacciones(String transacciones) {
        this.transacciones = transacciones;
    }

    public String getActualizar() {
        return actualizar;
    }

    public void setActualizar(String actualizar) {
        this.actualizar = actualizar;
    }

    public String getCrear() {
        return crear;
    }

    public void setCrear(String crear) {
        this.crear = crear;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "ID=" + ID +
                ", correo='" + correo + '\'' +
                ", perfil='" + perfil + '\'' +
                ", funcion='" + funcion + '\'' +
                ", empresa='" + empresa + '\'' +
                ", transacciones='" + transacciones + '\'' +
                ", actualizar='" + actualizar + '\'' +
                ", crear='" + crear + '\'' +
                '}';
    }
}
