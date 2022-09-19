package Apollo3.Apollo_3_spring.Controlador;

import Apollo3.Apollo_3_spring.Entidades.Empresa;
import Apollo3.Apollo_3_spring.Entidades.MovimientoDinero;
import Apollo3.Apollo_3_spring.Servicios.ServicioMovimientoDinero;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
public class ControladorMovimientoDinero {

    private ServicioMovimientoDinero servicioDM;

    public ControladorMovimientoDinero(ServicioMovimientoDinero servicioDM) {
        this.servicioDM = servicioDM;
    }
    @GetMapping("/ListarMovimiento")
    public ArrayList<MovimientoDinero> Consultarinformacion(){
        return servicioDM.Consultarinformacion();
    }
    @GetMapping("/BuscarMD/{id_movimiento}")
    public Optional<MovimientoDinero> BuscarMD (@PathVariable ("id_movimiento") Long id_movimiento){
        return servicioDM.BuscarMD(id_movimiento);
    }
    @PostMapping("/agregarMD")
    public String agregarMD(@RequestBody MovimientoDinero MD_1){
        return servicioDM.agregarMD(MD_1);
    }
    @PutMapping ("ActualizarMD")
    public String ActualizarMD (@RequestBody MovimientoDinero MD_1){
        return servicioDM.ActualizarMD(MD_1);
    }
    @DeleteMapping("EliminarMD/{id_movimiento}")
    public String EliminarMD(@PathVariable ("id_movimiento") Long id_movimiento){
        return servicioDM.EliminarMD(id_movimiento);

    }

}
