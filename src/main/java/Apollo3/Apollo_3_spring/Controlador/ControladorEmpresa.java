package Apollo3.Apollo_3_spring.Controlador;

import Apollo3.Apollo_3_spring.Entidades.Empresa;
import Apollo3.Apollo_3_spring.Servicios.ServicioEmpresa;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class ControladorEmpresa {
    private ServicioEmpresa servicio;

    public ControladorEmpresa(ServicioEmpresa servicio) {
        this.servicio = servicio;
    }
    @GetMapping("/ListarEmpresa")
    public ArrayList<Empresa> ConsultarEmpresa (){
        return  servicio.ConsultarEmpresa();
    }
    @GetMapping("/BuscarEmpresa/{id_empresa}")
    public Optional<Empresa> BuscarEmpresa (@PathVariable ("id_empresa") String id_empresa){
        return servicio.BuscarEmpresa(id_empresa);
    }
    @PostMapping("/AgregarEmpresa")
    public String AgregarEmpresa(@RequestBody Empresa Empresa_1){
           return servicio.agregarEmpresa(Empresa_1);
    }
    @PutMapping ("ActualizaEmpresa")
    public String ActualizarEmpresa (@RequestBody Empresa Empresa_1){
       return servicio.ActualizarEmpresa(Empresa_1);
    }
    @DeleteMapping("ElminarEmpresa/{id_empresa}")
    public String EliminarEmpresa(@PathVariable ("id_empresa") Long id_empresa){
        return servicio.EliminarEmpresa(id_empresa);

    }

}
