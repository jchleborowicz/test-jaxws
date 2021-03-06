
package pl.jch.tests.jaxws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PersonService", targetNamespace = "http://server.jaxws.tests.jch.pl/")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PersonService {


    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.jaxws.tests.jch.pl/PersonService/addPersonRequest", output = "http://server.jaxws.tests.jch.pl/PersonService/addPersonResponse")
    public boolean addPerson(
        @WebParam(name = "arg0", partName = "arg0")
        Person arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.jaxws.tests.jch.pl/PersonService/deletePersonRequest", output = "http://server.jaxws.tests.jch.pl/PersonService/deletePersonResponse")
    public boolean deletePerson(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns pl.jch.tests.jaxws.server.Person
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.jaxws.tests.jch.pl/PersonService/getPersonRequest", output = "http://server.jaxws.tests.jch.pl/PersonService/getPersonResponse")
    public Person getPerson(
        @WebParam(name = "arg0", partName = "arg0")
        int arg0);

    /**
     * 
     * @return
     *     returns pl.jch.tests.jaxws.server.PersonArray
     */
    @WebMethod
    @WebResult(partName = "return")
    @Action(input = "http://server.jaxws.tests.jch.pl/PersonService/getAllPersonsRequest", output = "http://server.jaxws.tests.jch.pl/PersonService/getAllPersonsResponse")
    public PersonArray getAllPersons();

}
