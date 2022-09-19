package Apollo3.Apollo_3_spring.Servicios;

import Apollo3.Apollo_3_spring.Entidades.Empleado;
import Apollo3.Apollo_3_spring.Repositorio.EmpresaRepositorio;
import Apollo3.Apollo_3_spring.Repositorio.empleadoRepositorio;
import Apollo3.Apollo_3_spring.Repositorio.EmpresaRepositorio;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class empleadoServicio {

    private empleadoRepositorio empleadoRepo;
    private EmpresaRepositorio empresaRepo;

    public empleadoServicio(empleadoRepositorio empleadoRepo, EmpresaRepositorio empresaRepo) {
        this.empleadoRepo = empleadoRepo;
        this.empresaRepo = empresaRepo;
    }

    public ArrayList<Empleado> listarEmpleados(){
        return (ArrayList<Empleado>) empleadoRepo.findAll();
    }

    public Empleado agregarEmpleado(long id_empresa, Empleado empleado){

        empresaRepo.findById(String.valueOf(id_empresa)).map(empresa -> {
            empleado.setEmpresa(empresa);
            return empresa;
        });
        return empleadoRepo.save(empleado);
    }
}
