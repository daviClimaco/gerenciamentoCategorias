package daviClimaco.gerenciamentoCategorias.controller;

import daviClimaco.gerenciamentoCategorias.entity.Categoria;
import daviClimaco.gerenciamentoCategorias.services.CategoriaServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("categorias")
public class CategoriaController {
    private CategoriaServices categoriaServices;

    public CategoriaController(CategoriaServices categoriaServices) {
        this.categoriaServices = categoriaServices;
    }

    @PostMapping
    public ResponseEntity<Categoria> salvar(@RequestBody Categoria categoria){
        Categoria requeste = categoriaServices.salvar(categoria);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequestUri()
                .path("/{id}").buildAndExpand(categoria.getId())
                .toUri();
        return ResponseEntity.created(uri).body(requeste);
    }

    @DeleteMapping ("{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        categoriaServices.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<Categoria>> buscarTodos(){
        List<Categoria> requeste = categoriaServices.buscarTodas();
        return ResponseEntity.ok().body(requeste);
    }

    @GetMapping("{id}")
    public Categoria buscarPorId(@PathVariable Long id){
        return categoriaServices.buscarCategoriaPorId(id);
    }

    @PutMapping("{id}")
    public Categoria atualizar(@PathVariable Long id, @RequestBody Categoria categoria){
        return categoriaServices.atualizar(id, categoria);
    }

}