package Apollo3.Apollo_3_spring.Repositorio;
import Apollo3.Apollo_3_spring.Entidades.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface EmpresaRepositorio extends  JpaRepository<Empresa, String>{
}
