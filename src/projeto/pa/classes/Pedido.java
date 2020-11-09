package projeto.pa.classes;

import java.util.Date;

/**
 *
 * @author Haniel Amorim
 */
public class Pedido {
    
    private int idPedido;
    private Garcom idGarcom;
    private int idMesa;
    private double valorTotal;
    private Produto item;
    private Date dataPedido;
    private int horaPeriodo;

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Garcom getIdGarçom() {
        return idGarcom;
    }

    public void setIdGarçom(Garcom idGarcom) {
        this.idGarcom = idGarcom;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Produto getItem() {
        return item;
    }

    public void setItem(Produto item) {
        this.item = item;
    }

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getHoraPeriodo() {
        return horaPeriodo;
    }

    public void setHoraPeriodo(int horaPeriodo) {
        this.horaPeriodo = horaPeriodo;
    }
    
    
    
}
