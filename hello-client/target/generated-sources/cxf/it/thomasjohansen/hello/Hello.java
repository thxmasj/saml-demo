package it.thomasjohansen.hello;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.0.2
 * 2014-10-19T23:46:47.922+02:00
 * Generated source version: 3.0.2
 * 
 */
@WebService(targetNamespace = "http://thomasjohansen.it/hello", name = "Hello")
@XmlSeeAlso({it.thomasjohansen.hello.types.ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface Hello {

    @WebMethod
    @WebResult(name = "helloResponse", targetNamespace = "http://thomasjohansen.it/hello/types", partName = "response")
    public it.thomasjohansen.hello.types.HelloResponse sayHello(
        @WebParam(partName = "request", name = "helloRequest", targetNamespace = "http://thomasjohansen.it/hello/types")
        it.thomasjohansen.hello.types.HelloRequest request
    );
}
