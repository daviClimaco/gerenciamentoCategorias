package daviClimaco.gerenciamentoCategorias.services;

import daviClimaco.gerenciamentoCategorias.entity.Categoria;
import daviClimaco.gerenciamentoCategorias.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServices {
    private CategoriaRepository categoriaRepository;

    public CategoriaServices(CategoriaRepository categoriaRepository) {
        this.categoriaRepository = categoriaRepository;
    }

    public void salvar(Categoria categoria){
        categoriaRepository.save(categoria);
    }

    public void deletar(Long id) {
        categoriaRepository.deleteById(id);
    }

    public Categoria buscarCategoriaPorId(Long id){
        return categoriaRepository.findById(id).orElse(null);
    }

    public List<Categoria> buscarTodas(){
        return categoriaRepository.findAll();
    }

}