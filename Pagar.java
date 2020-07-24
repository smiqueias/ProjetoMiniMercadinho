package MiniProjetoMercadinho;

public class Pagar {
    //ATRIBUTOS
    private float pagamentoDoCliente;
    private float valorProduto;
    private boolean troco =false;

    //MÉTODOS ESPECIAIS

    public float getPagamentoDoCliente() {
        return pagamentoDoCliente;
    }

    public void setPagamentoDoCliente(float pagamentoDoCliente) {
        this.pagamentoDoCliente = pagamentoDoCliente;
    }

    public float getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(float valorProduto) {
        this.valorProduto = valorProduto;
    }

    public boolean isTroco() {
        return troco;
    }

    public void setTroco(boolean troco) {
        this.troco = troco;
    }

    // MÉTODOS
    public Pagar(float pagamentoDoCliente, float valorProduto) {
        this.pagamentoDoCliente = pagamentoDoCliente;
        this.valorProduto = valorProduto;
    }

    public void pagamento(Caixa i){
        System.out.println("Valor do produto | "+this.getValorProduto());
        System.out.println("Valor dado pelo cliente | "+this.getPagamentoDoCliente());

        if(this.getValorProduto() == this.getPagamentoDoCliente()) {
            System.out.println("Obrigado pela compra e volte sempre");
            double valorProduto = this.getPagamentoDoCliente();

            i.setTotalDinheiro(i.getTotalDinheiro() + (int) valorProduto);
            i.setTotalCompras(i.getTotalCompras()+1);
        }
        else if(this.getValorProduto() > this.getPagamentoDoCliente()) {
            System.out.println("Está faltando dinheiro!");
        }
        else if(this.getValorProduto() < this.getPagamentoDoCliente()) {
            this.setTroco(true);
            System.out.println("Troco | "+ (this.getPagamentoDoCliente() - this.getValorProduto()));
            System.out.println("Obrigado pela compra e volte sempre");
            i.setTotalDinheiro(i.getTotalDinheiro() + (int) valorProduto);
            i.setTotalCompras(i.getTotalCompras()+1);
        }




    }

}
