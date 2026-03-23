package daviClimaco.gerenciamentoCategorias.entity;

import jakarta.persistence.*;

@Entity(name = "Categoria")
@Table(name = "tb_livro")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_categoria")
    private String nome;

    @Column(name = "descricao_categoria")
    private String descricao;

}