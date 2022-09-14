package Apollo3.Apollo_3_spring.Entidades;


import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class EmpleadoControlador {
    private EmpleadoServicio servicio;

    public EmpleadoControlador(EmpleadoServicio servicio) {

        this.servicio = servicio;
    }

    @GetMapping("/ListarEmpleados")
    public ArrayList<Empleado> listar() {
        return servicio.listarEmpleados();
    }

    @GetMapping("/BuscarEmpleado/{id}")
    public Optional<Empleado> buscarEmpleado(@PathVariable("id") String isbn) {
        return servicio.buscarEmpleado(Long.parseLong(isbn));
    }

    @GetMapping("/BuscarID/{ID}")
    public ArrayList<Empleado> buscarAutor(@PathVariable("ID") String ID) {
        return servicio.buscarID(ID);
    }

    @PostMapping("/AgregarEmpleado")
    public String agregarEmpleado(@RequestBody Empleado Empleado) {
        return servicio.agregarEmpleado(Empleado);
    }

    @PutMapping("/ActualizarEmpleado")
    public String actualizarEmpleado(@RequestBody Empleado Empleado) {
        return servicio.actualizarEmpleado(Empleado);
    }

    @GetMapping("/Actualizar edit/{ID}/{edit}")
    public String actualizarEdit(@PathVariable("ID") String ID, @PathVariable("edit") String perfil) {
        return servicio.actualizarPerfil(ID, perfil);
    }

    @DeleteMapping("/EliminarEmpleado/{ID}")
    public String eliminarEmpleado(@PathVariable("ID") String ID) {
        return servicio.eliminarEmpleado(ID);
    }
}

