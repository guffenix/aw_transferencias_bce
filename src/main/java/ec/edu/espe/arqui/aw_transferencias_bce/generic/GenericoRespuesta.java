
package ec.edu.espe.arqui.aw_transferencias_bce.generic;

/**
 *
 * @author guffenix
 */
public class GenericoRespuesta {
    private Double monto;
    private String cuentaOrigen;
    private String cuentaDestino;

    public GenericoRespuesta() {
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }
    
}
