package Apollo3.Apollo_3_spring.Servicios;

import Apollo3.Apollo_3_spring.Entidades.Empresa;
import Apollo3.Apollo_3_spring.Repositorio.EmpresaRepositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class empresaServicio {

    private EmpresaRepositorio repositorio;

    public empresaServicio(EmpresaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public ArrayList<Empresa> listarEmpresas(){
        return (ArrayList<Empresa>) repositorio.findAll();
    }

    public Optional<Empresa> buscarEmpresa(long id_empresa){
        return repositorio.findById(String.valueOf(id_empresa));
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
