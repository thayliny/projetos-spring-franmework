
import javax.persistence.Entity;



public class Cliente {

    private String nome;
    private Endereco endereco;

    public long getId()
    {
        return id;
    }
    public void setId(Long id){
        this.id = id;

    }
    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public endereco getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco){
        this.indereco = indereco;
    }




}
