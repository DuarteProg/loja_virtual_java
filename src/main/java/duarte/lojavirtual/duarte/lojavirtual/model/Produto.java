package duarte.lojavirtual.duarte.lojavirtual.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
    private Long id;

    private String tipoUnidade;


    private String nome;

    private Boolean ativo = Boolean.TRUE;

    @Column(columnDefinition = "text", length = 2000)
    private String descricao;

//    nota produto

    private Double peso;

    private Double largura;

    private Double altura;

    private Double profundidade;

    private BigDecimal valorVenda = BigDecimal.ZERO;

    private Integer QtdEstoque = 0;

    private Integer QtdeAlertaEstoque = 0;

    private String linkYouTube;

    private Boolean alertaQtdeEstoque = Boolean.FALSE;

    private Integer qtddClique = 0;

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoUnidade() {
        return tipoUnidade;
    }

    public void setTipoUnidade(String tipoUnidade) {
        this.tipoUnidade = tipoUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getLargura() {
        return largura;
    }

    public void setLargura(Double largura) {
        this.largura = largura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getProfundidade() {
        return profundidade;
    }

    public void setProfundidade(Double profundidade) {
        this.profundidade = profundidade;
    }

    public BigDecimal getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(BigDecimal valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Integer getQtdEstoque() {
        return QtdEstoque;
    }

    public void setQtdEstoque(Integer qtdEstoque) {
        QtdEstoque = qtdEstoque;
    }

    public Integer getQtdeAlertaEstoque() {
        return QtdeAlertaEstoque;
    }

    public void setQtdeAlertaEstoque(Integer qtdeAlertaEstoque) {
        QtdeAlertaEstoque = qtdeAlertaEstoque;
    }

    public String getLinkYouTube() {
        return linkYouTube;
    }

    public void setLinkYouTube(String linkYouTube) {
        this.linkYouTube = linkYouTube;
    }

    public Boolean getAlertaQtdeEstoque() {
        return alertaQtdeEstoque;
    }

    public void setAlertaQtdeEstoque(Boolean alertaQtdeEstoque) {
        this.alertaQtdeEstoque = alertaQtdeEstoque;
    }

    public Integer getQtddClique() {
        return qtddClique;
    }

    public void setQtddClique(Integer qtddClique) {
        this.qtddClique = qtddClique;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(id, produto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}