package fr.unice.polytech.isa.dd;

//import fr.unice.polytech.isa.dd

import fr.unice.polytech.isa.dd.entities.Provider;
import fr.unice.polytech.isa.dd.entities.Package;

import org.joda.time.DateTime;
import utils.MyDate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/packageService")
public interface PackageRegisterWebService {

    @WebMethod
    Boolean register(@WebParam(name="id") String nb,
                  @WebParam(name="w") Double w,
                  @WebParam(name="dateTime") String dt,
                  @WebParam(name="provider") Provider pro);

    @WebMethod
    @WebResult(name = "provider_find")
    Provider findProvider(@WebParam(name="provider_name") String name);

    @WebMethod
    @WebResult(name = "package")
    Package findPackage(@WebParam(name="id") String nb);
}
