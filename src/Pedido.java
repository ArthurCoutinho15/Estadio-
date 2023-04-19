import java.util.ArrayList;
import java.util.List;
public class Pedido {
    private Cliente cliente;
    public double qtd;

    public double calcValor(double valor){
         return valor * qtd;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getQtd () {
        return qtd;
    }

    public void setQtd(double qtd) {
        this.qtd = qtd;
    }
}
