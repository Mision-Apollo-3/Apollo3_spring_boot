package Apollo3.Apollo_3_spring.Entidades;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, String> {
    ArrayList<Empleado> findByID(String funcion);


}
