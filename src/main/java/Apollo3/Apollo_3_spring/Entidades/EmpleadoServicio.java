package Apollo3.Apollo_3_spring.Entidades;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;

public class EmpleadoServicio {
    private EmpleadoRepositorio repositorio;

    public EmpleadoServicio(EmpleadoRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public ArrayList<Empleado> listarEmpleados() {//Consultar todos
        return (ArrayList<Empleado>) repositorio.findAll();
    }

    public Optional<Empleado> buscarEmpleado(long ID) {

        return repositorio.findById(String.valueOf(ID));
    }

    public ArrayList<Empleado> buscarID(String ID) {
        return repositorio.findByID(ID);
    }

    public String agregarEmpleado(Empleado Empleado) {
        if (!buscarEmpleado(Empleado.getId()).isPresent()) {
            repositorio.save(Empleado);
            return "Empleado Registrado exitosamente.";
        } else {
            return "El Empleado ya existe. ";
        }
    }


    public String actualizarLibro(Empleado Empleado) {
        if (buscarEmpleado(Empleado.getId()).isPresent()) {
            repositorio.save(Empleado);
            return "Empleado actualizado exitosamente";
        } else {
            return "El Empleado a modificar no existe.";
        }
    }

    public String actualizarEmpleado(Empleado Empleado) {
        if (buscarEmpleado(Empleado.getId()).isPresent()) {
            repositorio.save(Empleado);
            return "Empleado Actualizado Exitosamente";
        } else {
            return "Empleado a Actualizar no existe";
        }
    }

    public String actualizarPerfil(String ID, String perfil) {
        if (buscarEmpleado (Long.parseLong(ID)).isPresent()) {
            Empleado empleado1 = repositorio.findById(ID).get();
            empleado1.setPerfilId(Long.parseLong(perfil));
            repositorio.save(empleado1);
            return "Empleado actualizado";
        } else {
            return "Empleado a actualizar no existe";
        }
    }

        public String eliminarEmpleado(String ID){
            if(buscarEmpleado(Long.parseLong(ID)).isPresent()) {
                repositorio.deleteById(ID);
                return "Empleado Eliminado";
            } else {
                return "El Empleado a eliminar no existe";

            }
        }
    }





