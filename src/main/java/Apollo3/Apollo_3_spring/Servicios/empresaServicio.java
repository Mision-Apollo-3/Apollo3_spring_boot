package Apollo3.Apollo_3_spring.Servicios;

import Apollo3.Apollo_3_spring.Entidades.Empresa;
import Apollo3.Apollo_3_spring.Repositorio.empresaRepositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class empresaServicio {

    private empresaRepositorio repositorio;

    public empresaServicio(empresaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public ArrayList<Empresa> listarEmpresas(){
        return (ArrayList<Empresa>) repositorio.findAll();
    }

    public Optional<Empresa> buscarEmpresa(long id_empresa){
        return repositorio.findById(id_empresa);
    }

    public String agregarEmpresa(Empresa empresa){
        if(buscarEmpresa(empresa.getId_empresa()).isEmpty()){
            repositorio.save(empresa);
            return "Empresa registrada exitosamente";
        }
        else
            return "La empresa ya existe en la base de datos";
    }
}
