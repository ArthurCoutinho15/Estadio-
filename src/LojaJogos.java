import javax.swing.JOptionPane;
import java.sql.SQLOutput;

public class LojaJogos{
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Ingresso i = new Ingresso();
        Pedido p = new Pedido();
        String nome = JOptionPane.showInputDialog("Nome do cliente: ");
        c.setNome(nome);
        String nomeJogo = JOptionPane.showInputDialog("Nome do jogo: ");
         i.setNomeJogo(nomeJogo);
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor: "));
        double val = p.calcValor(valor);
        double qtd = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de ingressos: "))  ;
        p.setQtd(qtd);

        System.out.println("Pedido feito para " + nome +  " Ingressos: " + qtd +", Valor: " + val );



    }
}
