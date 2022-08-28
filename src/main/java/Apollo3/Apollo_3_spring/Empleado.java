package Apollo3.Apollo_3_spring;

import org.springframework.context.annotation.Profile;

import java.util.Date;

public class Empleado {

    private long DocumentoIdentidad;
    private String Correo;
    private Profile Perfil;
    private String Funcion;
    private String Empresa;
    private String Transacciones[];
    private Date Actualizar;
    private Date Crear;

    public Empleado(long documentoIdentidad, String correo, Profile perfil, String funcion, String empresa, String[] transacciones, Date actualizar, Date crear) {
        DocumentoIdentidad = documentoIdentidad;
        Correo = correo;
        Perfil = perfil;
        Funcion = funcion;
        Empresa = empresa;
        Transacciones = transacciones;
        Actualizar = actualizar;
        Crear = crear;
    }

    public long getDocumentoIdentidad() {
        return DocumentoIdentidad;
    }

    public void setDocumentoIdentidad(long documentoIdentidad) {
        DocumentoIdentidad = documentoIdentidad;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public Profile getPerfil() {
        return Perfil;
    }

    public void setPerfil(Profile perfil) {
        Perfil = perfil;
    }

    public String getFuncion() {
        return Funcion;
    }

    public void setFuncion(String funcion) {
        Funcion = funcion;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    public String[] getTransacciones() {
        return Transacciones;
    }

    public void setTransacciones(String[] transacciones) {
        Transacciones = transacciones;
    }

    public Date getActualizar() {
        return Actualizar;
    }

    public void setActualizar(Date actualizar) {
        Actualizar = actualizar;
    }

    public Date getCrear() {
        return Crear;
    }

    public void setCrear(Date crear) {
        Crear = crear;
    }
}
