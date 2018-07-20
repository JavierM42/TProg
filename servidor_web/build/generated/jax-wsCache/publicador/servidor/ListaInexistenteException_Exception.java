
package servidor;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "ListaInexistenteException", targetNamespace = "http://servidor/")
public class ListaInexistenteException_Exception
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ListaInexistenteException faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public ListaInexistenteException_Exception(String message, ListaInexistenteException faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public ListaInexistenteException_Exception(String message, ListaInexistenteException faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: servidor.ListaInexistenteException
     */
    public ListaInexistenteException getFaultInfo() {
        return faultInfo;
    }

}