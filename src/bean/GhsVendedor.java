package bean;
// Generated 23/10/2023 15:42:33 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * GhsVendedor generated by hbm2java
 */
@Entity
@Table(name="ghs_vendedor"
    ,catalog="db_gabrielh"
)
public class GhsVendedor  implements java.io.Serializable {


     private int idghsVendedor;
     private String ghsNome;
     private String ghsEmail;
     private String ghsCpf;
     private Date ghsDataNascimento;
     private String ghsTelefone;

    public GhsVendedor() {
    }

	
    public GhsVendedor(int idghsVendedor, String ghsNome, String ghsEmail, String ghsCpf, Date ghsDataNascimento, String ghsTelefone) {
        this.idghsVendedor = idghsVendedor;
        this.ghsNome = ghsNome;
        this.ghsEmail = ghsEmail;
        this.ghsCpf = ghsCpf;
        this.ghsDataNascimento = ghsDataNascimento;
        this.ghsTelefone = ghsTelefone;
    }
    
     @Id 

    
    @Column(name="idghs_vendedor", unique=true, nullable=false)
    public int getIdghsVendedor() {
        return this.idghsVendedor;
    }
    
    public void setIdghsVendedor(int idghsVendedor) {
        this.idghsVendedor = idghsVendedor;
    }

    
    @Column(name="ghs_nome", nullable=false, length=45)
    public String getGhsNome() {
        return this.ghsNome;
    }
    
    public void setGhsNome(String ghsNome) {
        this.ghsNome = ghsNome;
    }

    
    @Column(name="ghs_email", nullable=false, length=50)
    public String getGhsEmail() {
        return this.ghsEmail;
    }
    
    public void setGhsEmail(String ghsEmail) {
        this.ghsEmail = ghsEmail;
    }

    
    @Column(name="ghs_cpf", nullable=false, length=14)
    public String getGhsCpf() {
        return this.ghsCpf;
    }
    
    public void setGhsCpf(String ghsCpf) {
        this.ghsCpf = ghsCpf;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ghs_dataNascimento", nullable=false, length=10)
    public Date getGhsDataNascimento() {
        return this.ghsDataNascimento;
    }
    
    public void setGhsDataNascimento(Date ghsDataNascimento) {
        this.ghsDataNascimento = ghsDataNascimento;
    }

    
    @Column(name="ghs_telefone", nullable=false, length=18)
    public String getGhsTelefone() {
        return this.ghsTelefone;
    }
    
    public void setGhsTelefone(String ghsTelefone) {
        this.ghsTelefone = ghsTelefone;
    }



}


