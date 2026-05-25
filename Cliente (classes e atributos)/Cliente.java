public class Cliente {
    private String nome;
    private String cpf;
    private int idade;
    private String telefone;


public Cliente(String nome, String cpf, int idade, String telefone){
    this.nome = nome;
    this.cpf = cpf;
    this.idade = idade;
    this.telefone = telefone;
}


public String getNome(){
    return nome;
}

public void setNome(String nome){
    this.nome = nome;
}

public void visualizarCliente(){
    System.out.println("Nome: " + nome);
    System.out.println("CPF: " + cpf);
    System.out.println("Idade: " + idade);
    System.out.println("Telefone: " + telefone);
}
}