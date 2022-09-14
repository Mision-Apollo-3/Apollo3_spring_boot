package Apollo3.Apollo_3_spring.Servicios;

import Apollo3.Apollo_3_spring.Entidades.Empresa;
import Apollo3.Apollo_3_spring.Repositorio.EmpresaRepositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class ServicioEmpresa {
private EmpresaRepositorio repositorioEmpresa;

    public ServicioEmpresa(EmpresaRepositorio repositorioEmpresa) {
        this.repositorioEmpresa = repositorioEmpresa;
    }
    public ArrayList<Empresa> ConsultarEmpresa(){
        return (ArrayList<Empresa>) repositorioEmpresa.findAll();
    }
    public Optional<Empresa> BuscarEmpresa(String id_empresa){
        return repositorioEmpresa.findById(id_empresa);
    }
    public   String agregarEmpresa( Empresa Empresa_1) {
        String EMP = Long.toString(Empresa_1.getId_empresa());
        if (!BuscarEmpresa(EMP).isPresent()) {
            repositorioEmpresa.save(Empresa_1);
            return "Se agrego empresa";
        } else {
            return "No se agrego empresa";
        }
    }
    public String ActualizarEmpresa (Empresa Empresa_1) {
        String EMP = Long.toString(Empresa_1.getId_empresa());
        if(BuscarEmpresa(EMP).isPresent()){
           repositorioEmpresa.save(Empresa_1);
            return  "Empresa  actualizado";
        }else{
            return "La empresa que quiere actualizar no existe";
        }
    }
    public String EliminarEmpresa(long id_empresa){

        if(BuscarEmpresa(String.valueOf(id_empresa)).isPresent()){
            repositorioEmpresa.deleteById(String.valueOf((id_empresa)));
            return "Se elimino Empresa";
        }else{
            return " La empresa a eliminar no existe ";
        }
    }
}
