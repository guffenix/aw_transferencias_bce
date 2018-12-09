
package ec.edu.espe.arqui.aw_transferencias_bce.generic;

/**
 *
 * @author guffenix
 */
public class RespuestaTransaccion {
    
    private Boolean estado;
        private Integer codigo;
        private String mensaje;
        private String tipoTransaccion;

        public RespuestaTransaccion() {
        }

        public Boolean getEstado() {
            return estado;
        }

        public void setEstado(Boolean estado) {
            this.estado = estado;
        }

        public Integer getCodigo() {
            return codigo;
        }

        public void setCodigo(Integer codigo) {
            this.codigo = codigo;
        }

        public String getMensaje() {
            return mensaje;
        }

        public void setMensaje(String mensaje) {
            this.mensaje = mensaje;
        }

        public String getTipoTransaccion() {
            return tipoTransaccion;
        }

        public void setTipoTransaccion(String tipoTransaccion) {
            this.tipoTransaccion = tipoTransaccion;
        }

}
