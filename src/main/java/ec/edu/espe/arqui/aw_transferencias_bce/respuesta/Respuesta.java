package ec.edu.espe.arqui.aw_transferencias_bce.respuesta;

import ec.edu.espe.arqui.aw_transferencias_bce.generic.GenericoInstitucion;
import ec.edu.espe.arqui.aw_transferencias_bce.generic.RespuestaTransaccion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import javax.ejb.Stateless;

/**
 *
 * @author guffenix
 */
@Stateless
public class Respuesta {

    public List<GenericoInstitucion> obtenerInstituciones(boolean estado) {

        List<GenericoInstitucion> list = new ArrayList<>();
        List<GenericoInstitucion> temp = new ArrayList<>();

        GenericoInstitucion result = new GenericoInstitucion();
        result.setCodigo("1718161514001");
        result.setDireccion("Av. Siempre viva");
        result.setEstado(Boolean.FALSE);
        result.setFechaRegistro(new Date());
        result.setNombre("Institucion 1");
        result.setTelefono("0987654321");
        result.setTipo("Banco");

        GenericoInstitucion result1 = new GenericoInstitucion();
        result1.setCodigo("1718161514002");
        result1.setDireccion("Av. Siempre viva");
        result1.setEstado(Boolean.TRUE);
        result1.setFechaRegistro(new Date());
        result1.setNombre("Institucion 1");
        result1.setTelefono("0987654321");
        result1.setTipo("Cooperativa");

        GenericoInstitucion result2 = new GenericoInstitucion();
        result2.setCodigo("1718161514003");
        result2.setDireccion("Av. Siempre viva");
        result2.setEstado(Boolean.FALSE);
        result2.setFechaRegistro(new Date());
        result2.setNombre("Institucion 1");
        result2.setTelefono("0987654321");
        result2.setTipo("Banco");

        GenericoInstitucion result3 = new GenericoInstitucion();
        result3.setCodigo("1718161514004");
        result3.setDireccion("Av. Siempre viva");
        result3.setEstado(Boolean.TRUE);
        result3.setFechaRegistro(new Date());
        result3.setNombre("Institucion 1");
        result3.setTelefono("0987654321");
        result3.setTipo("Cooperativa");

        GenericoInstitucion result4 = new GenericoInstitucion();
        result4.setCodigo("1718161514005");
        result4.setDireccion("Av. Siempre viva");
        result4.setEstado(Boolean.FALSE);
        result4.setFechaRegistro(new Date());
        result4.setNombre("Institucion 1");
        result4.setTelefono("0987654321");
        result4.setTipo("Banco");

        GenericoInstitucion result5 = new GenericoInstitucion();
        result5.setCodigo("1718161514006");
        result5.setDireccion("Av. Siempre viva");
        result5.setEstado(Boolean.FALSE);
        result5.setFechaRegistro(new Date());
        result5.setNombre("Institucion 1");
        result5.setTelefono("0987654321");
        result5.setTipo("Banco");

        list.add(result);
        list.add(result1);
        list.add(result2);
        list.add(result3);
        list.add(result4);
        list.add(result5);

        temp = list.stream().filter(r -> r.getEstado() == estado)
                .collect(Collectors.toList());

        return temp;
    }

    public RespuestaTransaccion depositar(String cuentaOrigen, String cuentaDestino, Double monto) {

        RespuestaTransaccion resTrans = new RespuestaTransaccion();

        if (monto <= 0) {
            resTrans.setCodigo(-1);
            resTrans.setEstado(Boolean.FALSE);
            resTrans.setMensaje("Deposito Fallido");
            resTrans.setTipoTransaccion("deposito");

        } else {
            resTrans.setCodigo(1);
            resTrans.setEstado(Boolean.TRUE);
            resTrans.setMensaje("Deposito Exitoso");
            resTrans.setTipoTransaccion("deposito");
        }

        return resTrans;

    }

    public RespuestaTransaccion retirar(String cuentaOrigen, String cuentaDestino, Double monto) {

        RespuestaTransaccion resTrans = new RespuestaTransaccion();

        if (monto <= 0) {
            resTrans.setCodigo(-1);
            resTrans.setEstado(Boolean.FALSE);
            resTrans.setMensaje("Retiro Fallido");
            resTrans.setTipoTransaccion("retiro");

        } else {
            resTrans.setCodigo(1);
            resTrans.setEstado(Boolean.TRUE);
            resTrans.setMensaje("Retiro Exitoso");
            resTrans.setTipoTransaccion("retiro");
        }

        return resTrans;

    }

    public RespuestaTransaccion revertir(String cuentaOrigen, String cuentaDestino, Double monto, String tipoTransaccion) {

        RespuestaTransaccion resTrans = new RespuestaTransaccion();

        if (tipoTransaccion.equals("retiro")) {
            if (monto <= 0) {
                resTrans.setCodigo(-1);
                resTrans.setEstado(Boolean.FALSE);
                resTrans.setMensaje("Retiro no ha sido revertido");

            } else {
                resTrans.setCodigo(1);
                resTrans.setEstado(Boolean.TRUE);
                resTrans.setMensaje("Retiro revertido exitosamente");
            }
        }

        return resTrans;

    }

   
}
