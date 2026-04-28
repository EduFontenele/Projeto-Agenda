package entities;

public class Contato {
   private long telefone;
   private String nome;
   private String endereco;
   private int id;

   public Contato(long telefone, String nome, String endereco, int id){
    this.telefone = telefone;
    this.nome = nome;
    this.endereco = endereco;
    this.id = this.id;
   }

   

   public long getTelefone() {
    return telefone;
   }

   public void setTelefone(long telefone) {
    this.telefone = telefone;
   }

   public String getNome() {
    return nome;
   }

   public void setNome(String nome) {
    this.nome = nome;
   }

   public String getEndereco() {
    return endereco;
   }

   public void setEndereco(String endereco) {
    this.endereco = endereco;
   }

   
}
