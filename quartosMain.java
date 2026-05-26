import java.util.ArrayList;

public class quartosMain {

    public static void main(String[] args) {

        ArrayList<Quartos> quartos = new ArrayList<>();


        quartos.add(new Quartos(101, "Simples", 120.0, true, 2));
        quartos.add(new Quartos(102, "Simples", 120.0, true, 2));
        quartos.add(new Quartos(103, "Luxo", 250.0, true, 3));
        quartos.add(new Quartos(104, "Luxo", 250.0, false, 3));
        quartos.add(new Quartos(105, "Premium", 400.0, true, 4));
        quartos.add(new Quartos(106, "Premium", 400.0, false, 4));
        quartos.add(new Quartos(107, "Casal", 180.0, true, 2));
        quartos.add(new Quartos(108, "Casal", 180.0, true, 2));
        quartos.add(new Quartos(109, "Família", 300.0, false, 5));
        quartos.add(new Quartos(110, "Família", 300.0, true, 5));
        quartos.add(new Quartos(111, "Simples", 120.0, true, 1));
        quartos.add(new Quartos(112, "Luxo", 250.0, false, 2));
        quartos.add(new Quartos(113, "Premium", 400.0, true, 4));
        quartos.add(new Quartos(114, "Casal", 180.0, true, 2));
        quartos.add(new Quartos(115, "Família", 300.0, false, 5));
        quartos.add(new Quartos(116, "Simples", 120.0, true, 1));
        quartos.add(new Quartos(117, "Luxo", 250.0, true, 3));
        quartos.add(new Quartos(118, "Premium", 400.0, false, 4));
        quartos.add(new Quartos(119, "Casal", 180.0, true, 2));
        quartos.add(new Quartos(120, "Família", 300.0, true, 5));
        quartos.add(new Quartos(121, "Luxo", 270.0, true, 3));
        quartos.add(new Quartos(122, "Premium", 450.0, false, 4));
        quartos.add(new Quartos(123, "Simples", 130.0, true, 2));
        quartos.add(new Quartos(124, "Casal", 200.0, true, 2));
        quartos.add(new Quartos(125, "Simples", 130.0, true, 2));

        for (Quartos q : quartos) {

            q.consultarQuarto();

            System.out.println("-------------------------");
        }
    }
}

