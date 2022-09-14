package Apollo3.Apollo_3_spring.Controlador;

import Apollo3.Apollo_3_spring.Entidades.Empresa;
import Apollo3.Apollo_3_spring.Servicios.empresaServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class empresaControlador {

    private empresaServicio servicio;

    public empresaControlador(empresaServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping("/ListarEmpresas")
    public ArrayList<Empresa> listarEmpresas(){
        return servicio.listarEmpresas();
    }

    @GetMapping("/BuscarEmpresa/{id}")
    public Optional<Empresa> buscarLibro(@PathVariable("id") long id_empresa){
        return servicio.buscarEmpresa(id_empresa);
    }

    @PostMapping("/AgregarEmpresa")
    public String agregarEmpresa(@RequestBody Empresa empresa){
        return servicio.agregarEmpresa(empresa);
    }
}
