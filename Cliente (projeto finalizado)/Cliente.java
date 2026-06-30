
    public class Cliente extends Pessoa {

    private String telefone;

    public Cliente(String nome, String cpf, int idade, String telefone) {
        super(nome, cpf, idade);
        this.telefone = telefone;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("Telefone: " + telefone);
        System.out.println("Tipo: Cliente");
    }
}

