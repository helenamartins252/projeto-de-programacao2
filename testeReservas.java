public class testereservas {

    public static void main(String[] args) {

        reservas reserva1 = new reservas (
            1,
            "01/06/2026",
            "05/06/2026",
            2,
            "Ativa"
        );

        reserva1.criarReserva();

        reserva1.visualizarReserva();

        reserva1.realizarCheckIn();

        reserva1.cancelarReserva();

        reserva1.visualizarReserva();
    }
}