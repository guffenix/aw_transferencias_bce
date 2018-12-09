
package ec.edu.espe.arqui.aw_transferencias_bce.ws;

import ec.edu.espe.arqui.aw_transferencias_bce.generic.GenericoInstitucion;
import ec.edu.espe.arqui.aw_transferencias_bce.generic.RespuestaTransaccion;
import ec.edu.espe.arqui.aw_transferencias_bce.respuesta.Respuesta;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author guffenix
 */
@WebService(serviceName = "WSTransferencia")
public class WSTransferencia {

    @EJB
    private Respuesta ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "obtenerInstituciones")
    public List<GenericoInstitucion> obtenerInstituciones(@WebParam(name = "estado") boolean estado) {
        return ejbRef.obtenerInstituciones(estado);
    }

    @WebMethod(operationName = "depositar")
    public RespuestaTransaccion depositar(@WebParam(name = "cuentaOrigen") String cuentaOrigen, @WebParam(name = "cuentaDestino") String cuentaDestino, @WebParam(name = "monto") Double monto) {
        return ejbRef.depositar(cuentaOrigen, cuentaDestino, monto);
    }

    @WebMethod(operationName = "retirar")
    public RespuestaTransaccion retirar(@WebParam(name = "cuentaOrigen") String cuentaOrigen, @WebParam(name = "cuentaDestino") String cuentaDestino, @WebParam(name = "monto") Double monto) {
        return ejbRef.retirar(cuentaOrigen, cuentaDestino, monto);
    }

    @WebMethod(operationName = "revertir")
    public RespuestaTransaccion revertir(@WebParam(name = "cuentaOrigen") String cuentaOrigen, @WebParam(name = "cuentaDestino") String cuentaDestino, @WebParam(name = "monto") Double monto, @WebParam(name = "tipoTransaccion") String tipoTransaccion) {
        return ejbRef.revertir(cuentaOrigen, cuentaDestino, monto, tipoTransaccion);
    }
    
}
