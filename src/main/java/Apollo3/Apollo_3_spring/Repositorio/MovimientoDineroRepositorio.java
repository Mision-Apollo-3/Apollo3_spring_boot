package Apollo3.Apollo_3_spring.Repositorio;

import Apollo3.Apollo_3_spring.Entidades.MovimientoDinero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoDineroRepositorio extends JpaRepository<MovimientoDinero, Long> {
}
