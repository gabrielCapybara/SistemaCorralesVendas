package bean;
// Generated 16/09/2023 15:43:39 by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GhsCliente generated by hbm2java
 */
@Entity
@Table(name="ghs_cliente"
    ,catalog="db_gabrielh"
)
public class GhsCliente  implements java.io.Serializable {


     private int idgbsCliente;
     private String ghsNome;
     private String ghsCpf;
     private String gbsRg;
     private String gbsSexo;
     private Date gbsDataNascimento;
     private String gbsEmail;
     private String gbsEndereco;
     private String gbsBairro;
     private String gbsCidade;
     private String gbsTelefoneResidencial;
     private String gbsCelular;
     private String gbsEstado;
     private int gbsIdade;
     private String gbsRegiao;

    public GhsCliente() {
    }

	
    public GhsCliente(int idgbsCliente, String ghsNome, String ghsCpf, String gbsRg, String gbsSexo, Date gbsDataNascimento, String gbsEmail, String gbsEndereco, String gbsBairro, String gbsCidade, String gbsCelular, String gbsEstado, int gbsIdade) {
        this.idgbsCliente = idgbsCliente;
        this.ghsNome = ghsNome;
        this.ghsCpf = ghsCpf;
        this.gbsRg = gbsRg;
        this.gbsSexo = gbsSexo;
        this.gbsDataNascimento = gbsDataNascimento;
        this.gbsEmail = gbsEmail;
        this.gbsEndereco = gbsEndereco;
        this.gbsBairro = gbsBairro;
        this.gbsCidade = gbsCidade;
        this.gbsCelular = gbsCelular;
        this.gbsEstado = gbsEstado;
        this.gbsIdade = gbsIdade;
    }
    public GhsCliente(int idgbsCliente, String ghsNome, String ghsCpf, String gbsRg, String gbsSexo, Date gbsDataNascimento, String gbsEmail, String gbsEndereco, String gbsBairro, String gbsCidade, String gbsTelefoneResidencial, String gbsCelular, String gbsEstado, int gbsIdade, String gbsRegiao) {
       this.idgbsCliente = idgbsCliente;
       this.ghsNome = ghsNome;
       this.ghsCpf = ghsCpf;
       this.gbsRg = gbsRg;
       this.gbsSexo = gbsSexo;
       this.gbsDataNascimento = gbsDataNascimento;
       this.gbsEmail = gbsEmail;
       this.gbsEndereco = gbsEndereco;
       this.gbsBairro = gbsBairro;
       this.gbsCidade = gbsCidade;
       this.gbsTelefoneResidencial = gbsTelefoneResidencial;
       this.gbsCelular = gbsCelular;
       this.gbsEstado = gbsEstado;
       this.gbsIdade = gbsIdade;
       this.gbsRegiao = gbsRegiao;
    }
   
     @Id 

    
    @Column(name="idgbs_cliente", unique=true, nullable=false)
    public int getIdgbsCliente() {
        return this.idgbsCliente;
    }
    
    public void setIdgbsCliente(int idgbsCliente) {
        this.idgbsCliente = idgbsCliente;
    }

    
    @Column(name="ghs_nome", nullable=false, length=100)
    public String getGhsNome() {
        return this.ghsNome;
    }
    
    public void setGhsNome(String ghsNome) {
        this.ghsNome = ghsNome;
    }

    
    @Column(name="ghs_cpf", nullable=false, length=14)
    public String getGhsCpf() {
        return this.ghsCpf;
    }
    
    public void setGhsCpf(String ghsCpf) {
        this.ghsCpf = ghsCpf;
    }

    
    @Column(name="gbs_rg", nullable=false, length=10)
    public String getGbsRg() {
        return this.gbsRg;
    }
    
    public void setGbsRg(String gbsRg) {
        this.gbsRg = gbsRg;
    }

    
    @Column(name="gbs_sexo", nullable=false, length=10)
    public String getGbsSexo() {
        return this.gbsSexo;
    }
    
    public void setGbsSexo(String gbsSexo) {
        this.gbsSexo = gbsSexo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="gbs_dataNascimento", nullable=false, length=10)
    public Date getGbsDataNascimento() {
        return this.gbsDataNascimento;
    }
    
    public void setGbsDataNascimento(Date gbsDataNascimento) {
        this.gbsDataNascimento = gbsDataNascimento;
    }

    
    @Column(name="gbs_email", nullable=false, length=80)
    public String getGbsEmail() {
        return this.gbsEmail;
    }
    
    public void setGbsEmail(String gbsEmail) {
        this.gbsEmail = gbsEmail;
    }

    
    @Column(name="gbs_endereco", nullable=false, length=45)
    public String getGbsEndereco() {
        return this.gbsEndereco;
    }
    
    public void setGbsEndereco(String gbsEndereco) {
        this.gbsEndereco = gbsEndereco;
    }

    
    @Column(name="gbs_bairro", nullable=false, length=30)
    public String getGbsBairro() {
        return this.gbsBairro;
    }
    
    public void setGbsBairro(String gbsBairro) {
        this.gbsBairro = gbsBairro;
    }

    
    @Column(name="gbs_cidade", nullable=false, length=100)
    public String getGbsCidade() {
        return this.gbsCidade;
    }
    
    public void setGbsCidade(String gbsCidade) {
        this.gbsCidade = gbsCidade;
    }

    
    @Column(name="gbs_telefoneResidencial", length=10)
    public String getGbsTelefoneResidencial() {
        return this.gbsTelefoneResidencial;
    }
    
    public void setGbsTelefoneResidencial(String gbsTelefoneResidencial) {
        this.gbsTelefoneResidencial = gbsTelefoneResidencial;
    }

    
    @Column(name="gbs_celular", nullable=false, length=10)
    public String getGbsCelular() {
        return this.gbsCelular;
    }
    
    public void setGbsCelular(String gbsCelular) {
        this.gbsCelular = gbsCelular;
    }

    
    @Column(name="gbs_estado", nullable=false, length=50)
    public String getGbsEstado() {
        return this.gbsEstado;
    }
    
    public void setGbsEstado(String gbsEstado) {
        this.gbsEstado = gbsEstado;
    }

    
    @Column(name="gbs_idade", nullable=false)
    public int getGbsIdade() {
        return this.gbsIdade;
    }
    
    public void setGbsIdade(int gbsIdade) {
        this.gbsIdade = gbsIdade;
    }

    
    @Column(name="gbs_regiao", length=11)
    public String getGbsRegiao() {
        return this.gbsRegiao;
    }
    
    public void setGbsRegiao(String gbsRegiao) {
        this.gbsRegiao = gbsRegiao;
    }




}

