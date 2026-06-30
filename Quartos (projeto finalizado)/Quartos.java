import java.util.ArrayList;

public class Quartos {

    private ArrayList<Quarto> lista = new ArrayList<>();

    public void adicionar(Quarto q) {
        lista.add(q);
    }

    public Quarto buscar(int numero) {
        for (Quarto q : lista) {
            if (q.getNumero() == numero) return q;
        }
        return null;
    }

    public void listar() {
        for (Quarto q : lista) {
            q.exibir();
        }
    }
}
    

