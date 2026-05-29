public class Reservas {


    private int idReserva;
    private String dataEntrada;
    private String dataSaida;
    private int quantidadeHospedes;
    private String statusReserva;



public Reservas(int idReserva, 
    String dataEntrada,
    String dataSaida,
    int quantidadeHospedes,
    String statusReserva) {

        this.idReserva = idReserva;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quantidadeHospedes = quantidadeHospedes;
        this.statusReserva = statusReserva;
    }


    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }


    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }


    public String getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(String dataSaida) {
        this.dataSaida = dataSaida;
    }


    public int getQuantidadeHospedes() {
        return quantidadeHospedes;
    }

    public void setQuantidadeHospedes(int quantidadeHospedes) {
        this.quantidadeHospedes = quantidadeHospedes;
    }


    public String getStatusReserva() {
        return statusReserva;
    }

    public void setStatusReserva(String statusReserva) {
        this.statusReserva = statusReserva;
    }



    public void criarReserva() {

        System.out.println("Reserva criada com sucesso!");
    }


    public void cancelarReserva() {

        statusReserva = "Cancelada";

        System.out.println("Reserva cancelada!");
    }


    public void verificarDisponibilidade() {

        System.out.println("Quarto disponível!");
    }


    public void realizarCheckIn() {

        System.out.println("Check-in realizado!");
    }


    public void realizarCheckOut() {

        System.out.println("Check-out realizado!");
    }


    public void visualizarReserva() {

        System.out.println("ID Reserva: " + idReserva);
        System.out.println("Entrada: " + dataEntrada);
        System.out.println("Saída: " + dataSaida);
        System.out.println("Quantidade de hóspedes: " + quantidadeHospedes);
        System.out.println("Status: " + statusReserva);
    }
}
    
