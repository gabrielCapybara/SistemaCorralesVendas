package bean;
// Generated 23/10/2023 15:42:33 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * GhsProdutos generated by hbm2java
 */
@Entity
@Table(name="ghs_produtos"
    ,catalog="db_gabrielh"
)
public class GhsProdutos  implements java.io.Serializable {


     private int idghsProdutos;
     private String ghsNome;
     private String ghsDescricao;
     private double ghsPreco;
     private int ghsQuantidade;
     private double ghsValorUnitario;

    public GhsProdutos() {
    }

	
    public GhsProdutos(int idghsProdutos, String ghsNome, String ghsDescricao, double ghsPreco, int ghsQuantidade, double ghsValorUnitario) {
        this.idghsProdutos = idghsProdutos;
        this.ghsNome = ghsNome;
        this.ghsDescricao = ghsDescricao;
        this.ghsPreco = ghsPreco;
        this.ghsQuantidade = ghsQuantidade;
        this.ghsValorUnitario = ghsValorUnitario;
    }
    
   
     @Id 

    
    @Column(name="idghs_produtos", unique=true, nullable=false)
    public int getIdghsProdutos() {
        return this.idghsProdutos;
    }
    
    public void setIdghsProdutos(int idghsProdutos) {
        this.idghsProdutos = idghsProdutos;
    }

    
    @Column(name="ghs_nome", nullable=false, length=50)
    public String getGhsNome() {
        return this.ghsNome;
    }
    
    public void setGhsNome(String ghsNome) {
        this.ghsNome = ghsNome;
    }

    
    @Column(name="ghs_descricao", nullable=false, length=150)
    public String getGhsDescricao() {
        return this.ghsDescricao;
    }
    
    public void setGhsDescricao(String ghsDescricao) {
        this.ghsDescricao = ghsDescricao;
    }

    
    @Column(name="ghs_preco", nullable=false, precision=10)
    public double getGhsPreco() {
        return this.ghsPreco;
    }
    
    public void setGhsPreco(double ghsPreco) {
        this.ghsPreco = ghsPreco;
    }

    
    @Column(name="ghs_quantidade", nullable=false)
    public int getGhsQuantidade() {
        return this.ghsQuantidade;
    }
    
    public void setGhsQuantidade(int ghsQuantidade) {
        this.ghsQuantidade = ghsQuantidade;
    }

    
    @Column(name="ghs_valorUnitario", nullable=false, precision=10)
    public double getGhsValorUnitario() {
        return this.ghsValorUnitario;
    }
    
    public void setGhsValorUnitario(double ghsValorUnitario) {
        this.ghsValorUnitario = ghsValorUnitario;
    }


}


