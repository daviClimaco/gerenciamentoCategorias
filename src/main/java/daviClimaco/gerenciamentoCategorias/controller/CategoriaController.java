package daviClimaco.gerenciamentoCategorias.controller;

import daviClimaco.gerenciamentoCategorias.entity.Categoria;
import daviClimaco.gerenciamentoCategorias.services.CategoriaServices;
import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
    private CategoriaServices categoriaServices;

    public CategoriaController(CategoriaServices categoriaServices) {
        this.categoriaServices = categoriaServices;
    }

    @PostMapping
    public void salvar(@RequestBody Categoria categoria){
        categoriaServices.salvar(categoria);
    }

    @DeleteMapping ("{id}")
    public void deletar(@PathVariable Long id) {
        categoriaServices.deletar(id);
    }

    @GetMapping
    public List<Categoria> buscarTodos(){
        return categoriaServices.buscarTodas();
    }

    @GetMapping("{id}")
    public Categoria buscarPorId(@PathVariable Long id){
        return categoriaServices.buscarCategoriaPorId(id);
    }

}