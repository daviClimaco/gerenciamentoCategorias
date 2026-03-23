package daviClimaco.gerenciamentoCategorias.repository;

import daviClimaco.gerenciamentoCategorias.entity.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
