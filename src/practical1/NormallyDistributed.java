
package practical1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.7-b01
 * Generated source version: 2.2
 */
@WebService(name = "NormallyDistributed", targetNamespace = "http://lsvh.org/NormallyDistributed/")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@XmlSeeAlso({
        ObjectFactory.class
})
public interface NormallyDistributed {


    /**
     * @param parameters
     * @return returns practical1.Results
     */
    @WebMethod
    @WebResult(name = "results", targetNamespace = "http://lsvh.org/NormallyDistributed/Response/", partName = "parameters")
    public Results calculateNormalDistribution(
            @WebParam(name = "values", targetNamespace = "http://lsvh.org/NormallyDistributed/Request/", partName = "parameters")
                    Values parameters);

}
