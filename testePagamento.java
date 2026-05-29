public class testepagamento {

    public static void main(String[] args) {

        Pagamento pagamento = new Pagamento(
            1,
            150.00,
            "PIX",
            "28/05/2026",
            false
        );

        System.out.println("=== Dados Iniciais ===");
        pagamento.visualizarPagamento();

        System.out.println("\n=== Realizando Pagamento ===");
        pagamento.realizarPagamento();

        System.out.println("\n=== Confirmando Pagamento ===");
        pagamento.confirmarPagamento();

        System.out.println("\n=== Emitindo Recibo ===");
        pagamento.emitirRecibo();

        System.out.println("\n=== Dados Atualizados ===");
        pagamento.visualizarPagamento();

        System.out.println("\n=== Cálculo do Valor Total ===");
        double total = pagamento.calcularValorTotal(3);
        System.out.println("Valor total para 3 dias: R$ " + total);
    }
}



