package Apollo3.Apollo_3_spring.Controlador;

import Apollo3.Apollo_3_spring.Entidades.Empleado;
import Apollo3.Apollo_3_spring.Servicios.empleadoServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class empleadoControlador {

    public empleadoServicio servicio;

    public empleadoControlador(empleadoServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/ListarEmpleados")
    public ArrayList<Empleado> listarEmpleados(){
        return servicio.listarEmpleados();
    }

    @PostMapping("/AgregarEmpleado/{id_empresa}")
    public Empleado agregarEmpleado(@PathVariable("id_empresa") long id_empresa, @RequestBody Empleado empleado){
        return servicio.agregarEmpleado(id_empresa, empleado);
    }
}
