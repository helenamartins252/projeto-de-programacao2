public class Quartos {
    private int numero;
    private String tipo;
    private double valorDiaria;
    private boolean disponivel;
    private int capacidade;

    public Quartos(int numero, String tipo, double valorDiaria, boolean disponivel, int capacidade){
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.disponivel = disponivel;
        this.capacidade = capacidade;
}

public int getNumero(){
    return numero;
}

public void setNumero(int numero){
    this.numero = numero;
}
public String geTipo() {
        return tipo;
}

    public void setTipo(String tipo) {
        this.tipo = tipo;
}


    public double getValorDiaria() {
        return valorDiaria;
}

    public void setValorDiaria(double valorDiaria) {
        this.valorDiaria = valorDiaria;
}


    public boolean isDisponivel() {
        return disponivel;
}

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
}


    public int getCapacidade() {
        return capacidade;
}

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
}


// METODOS

    public void cadastrarQuarto() {
        System.out.println("Quarto cadastrado com sucesso!!");
}


    public void alterarDisponibilidade(boolean status) {
        this.disponivel = status;
}


    public void consultarQuarto() {

        System.out.println("Número: " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor da diária: " + valorDiaria);
        System.out.println("Disponível: " + disponivel);
        System.out.println("Capacidade: " + capacidade);
    }


    public double calcularDiaria(int dias) {
        return valorDiaria * dias;
    }
}
