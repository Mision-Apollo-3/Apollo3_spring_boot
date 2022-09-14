package Apollo3.Apollo_3_spring.Repositorio;

import Apollo3.Apollo_3_spring.Entidades.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface empleadoRepositorio extends JpaRepository<Empleado, Long> {
}
