package avaliacao_1.roteiro_8.parte_3;

import avaliacao_1.roteiro_8.parte_2.Veiculo;

public class Cliente {
   private String cpfCnpj;
   private String nome;
   private String endereco;
   private String email;
   private String telefone;
   private Veiculo veiculo; // Adicionamos um atributo Veiculo para representar o veículo do cliente

   // Construtor
   public Cliente(String cpfCnpj, String nome, String endereco, String email, String telefone, Veiculo veiculo) {
      this.cpfCnpj = cpfCnpj;
      this.nome = nome;
      this.endereco = endereco;
      this.email = email;
      this.telefone = telefone;
      this.veiculo = veiculo;
   }

   // Getters e Setters
   public String getCpfCnpj() {
      return cpfCnpj;
   }

   public void setCpfCnpj(String cpfCnpj) {
      this.cpfCnpj = cpfCnpj;
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

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   public String getTelefone() {
      return telefone;
   }

   public void setTelefone(String telefone) {
      this.telefone = telefone;
   }

   public Veiculo getVeiculo() {
      return veiculo;
   }

   public void setVeiculo(Veiculo veiculo) {
      this.veiculo = veiculo;
   }
}