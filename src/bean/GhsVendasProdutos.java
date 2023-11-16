package bean;
// Generated 23/10/2023 15:42:33 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * GhsVendasProdutos generated by hbm2java
 */
@Entity
@Table(name="ghs_vendas_produtos"
    ,catalog="db_gabrielh"
    //db_gabriel_corrales
)
public class GhsVendasProdutos  implements java.io.Serializable {


     private int idghsVendasProdutos;
     private GhsProdutos ghsProdutos;
     private GhsVendas ghsVendas;
     private double ghsQuantidade;
     private double ghsValorUnitario;
     private String ghsStatusVenda;

    public GhsVendasProdutos() {
    }

    public GhsVendasProdutos(int idghsVendasProdutos, GhsProdutos ghsProdutos, GhsVendas ghsVendas, double ghsQuantidade, double ghsValorUnitario, String ghsStatusVenda) {
       this.idghsVendasProdutos = idghsVendasProdutos;
       this.ghsProdutos = ghsProdutos;
       this.ghsVendas = ghsVendas;
       this.ghsQuantidade = ghsQuantidade;
       this.ghsValorUnitario = ghsValorUnitario;
       this.ghsStatusVenda = ghsStatusVenda;
    }
   
     @Id 

    
    @Column(name="idghs_vendas_produtos", unique=true, nullable=false)
    public int getIdghsVendasProdutos() {
        return this.idghsVendasProdutos;
    }
    
    public void setIdghsVendasProdutos(int idghsVendasProdutos) {
        this.idghsVendasProdutos = idghsVendasProdutos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idghs_produtos", nullable=false)
    public GhsProdutos getGhsProdutos() {
        return this.ghsProdutos;
    }
    
    public void setGhsProdutos(GhsProdutos ghsProdutos) {
        this.ghsProdutos = ghsProdutos;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idghs_vendas", nullable=false)
    public GhsVendas getGhsVendas() {
        return this.ghsVendas;
    }
    
    public void setGhsVendas(GhsVendas ghsVendas) {
        this.ghsVendas = ghsVendas;
    }

    
    @Column(name="ghs_quantidade", nullable=false, precision=22, scale=0)
    public double getGhsQuantidade() {
        return this.ghsQuantidade;
    }
    
    public void setGhsQuantidade(double ghsQuantidade) {
        this.ghsQuantidade = ghsQuantidade;
    }

    
    @Column(name="ghs_valorUnitario", nullable=false, precision=22, scale=0)
    public double getGhsValorUnitario() {
        return this.ghsValorUnitario;
    }
    
    public void setGhsValorUnitario(double ghsValorUnitario) {
        this.ghsValorUnitario = ghsValorUnitario;
    }

    
    @Column(name="ghs_statusVenda", nullable=false, length=45)
    public String getGhsStatusVenda() {
        return this.ghsStatusVenda;
    }
    
    public void setGhsStatusVenda(String ghsStatusVenda) {
        this.ghsStatusVenda = ghsStatusVenda;
    }




}


