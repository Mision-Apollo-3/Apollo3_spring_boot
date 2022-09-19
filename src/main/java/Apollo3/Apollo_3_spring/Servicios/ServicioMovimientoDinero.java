package Apollo3.Apollo_3_spring.Servicios;

import Apollo3.Apollo_3_spring.Entidades.Empresa;
import Apollo3.Apollo_3_spring.Entidades.MovimientoDinero;
import Apollo3.Apollo_3_spring.Repositorio.MovimientoDineroRepositorio;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ServicioMovimientoDinero {
    private MovimientoDineroRepositorio repositorioMD;

    public ServicioMovimientoDinero(MovimientoDineroRepositorio repositorio) {
        this.repositorioMD = repositorio;
    }
    public ArrayList<MovimientoDinero> Consultarinformacion(){ //Consultar all info
        return (ArrayList<MovimientoDinero>) this.repositorioMD.findAll();
    }
    public Optional<MovimientoDinero> BuscarMD(Long id_movimiento){
        return repositorioMD.findById(id_movimiento);
    }
    public String agregarMD( MovimientoDinero MD_1) {
        String MD = Long.toString(MD_1.getId_movimiento());
        if (!BuscarMD(Long.valueOf(MD)).isPresent()) {
            repositorioMD.save(MD_1);
            return "Se agrego Movimiento de Dinero";
        } else {
            return "No se agrego el Movimiento de Dinero";
        }
    }
    public String ActualizarMD (MovimientoDinero MD_1) {
        String MD = Long.toString(MD_1.getId_movimiento());
        if(BuscarMD(Long.valueOf(MD)).isPresent()){
            repositorioMD.save(MD_1);
            return  "Movimiento de Dinero actualizado";
        }else{
            return "El movimiento de dinero a actualizar no existe";
        }
    }
    public String EliminarMD(long id_movimiento){

        if(BuscarMD(Long.valueOf(String.valueOf(id_movimiento))).isPresent()){
            repositorioMD.deleteById((id_movimiento));
            return "Se eliminó el Movimiento de Dinero";
        }else{
            return " El movimiento de dinero a eliminar no existe ";
        }
    }


}
