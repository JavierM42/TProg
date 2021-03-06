
package servidor;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "TransicionSuscripcionInvalidaException", targetNamespace = "http://servidor/")
public class TransicionSuscripcionInvalidaException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private TransicionSuscripcionInvalidaException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public TransicionSuscripcionInvalidaException_Exception(String message, TransicionSuscripcionInvalidaException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public TransicionSuscripcionInvalidaException_Exception(String message, TransicionSuscripcionInvalidaException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: servidor.TransicionSuscripcionInvalidaException
     */
    public TransicionSuscripcionInvalidaException getFaultInfo() {
        return faultInfo;
    }

}
