public class Pagamento {
    
    private int idPagamento;
    private double valor;
    private String formaPagamento;
    private String dataPagamento;
    private boolean pagamentoConfirmado;
    
    
    public Pagamento(int idPagamento,
                      double valor,
                      String formaPagamento,
                      String dataPagamento,
                      boolean pagamentoConfirmado) {

        this.idPagamento = idPagamento;
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.dataPagamento = dataPagamento;
        this.pagamentoConfirmado = pagamentoConfirmado;
    }


    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }


    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }


    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }


    public boolean isPagamentoConfirmado() {
        return pagamentoConfirmado;
    }

    public void setPagamentoConfirmado(boolean pagamentoConfirmado) {
        this.pagamentoConfirmado = pagamentoConfirmado;
    }


    public void realizarPagamento() {

        System.out.println("Pagamento realizado!");
    }


    public void emitirRecibo() {

        System.out.println("Recibo emitido!");
    }


    public void confirmarPagamento() {

        pagamentoConfirmado = true;

        System.out.println("Pagamento confirmado!");
    }


    public double calcularValorTotal(int diasHospedagem) {

        return valor * diasHospedagem;
    }


    public void visualizarPagamento() {

        System.out.println("ID Pagamento: " + idPagamento);
        System.out.println("Valor: " + valor);
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Data: " + dataPagamento);
        System.out.println("Pagamento confirmado: " + pagamentoConfirmado);
    }
}

