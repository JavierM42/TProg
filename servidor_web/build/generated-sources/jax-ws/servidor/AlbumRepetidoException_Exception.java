
package servidor;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "AlbumRepetidoException", targetNamespace = "http://servidor/")
public class AlbumRepetidoException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private AlbumRepetidoException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public AlbumRepetidoException_Exception(String message, AlbumRepetidoException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public AlbumRepetidoException_Exception(String message, AlbumRepetidoException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: servidor.AlbumRepetidoException
     */
    public AlbumRepetidoException getFaultInfo() {
        return faultInfo;
    }

}
