public class Quarto {

    private int numero;
    private String tipo;
    private double valorDiaria;
    private boolean disponivel;

    public Quarto(int numero, String tipo, double valorDiaria) {
        this.numero = numero;
        this.tipo = tipo;
        this.valorDiaria = valorDiaria;
        this.disponivel = true;
    }

    public int getNumero() {
        return numero;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void reservar() {
        this.disponivel = false;
    }

    public void liberar() {
        this.disponivel = true;
    }

    public void exibir() {
        System.out.println("Quarto: " + numero +
                " | Tipo: " + tipo +
                " | Valor: " + valorDiaria +
                " | Disponível: " + disponivel);
    }
}
    

