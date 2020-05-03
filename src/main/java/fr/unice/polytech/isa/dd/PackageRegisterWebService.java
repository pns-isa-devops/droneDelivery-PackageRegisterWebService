package fr.unice.polytech.isa.dd;

//import fr.unice.polytech.isa.dd

import fr.unice.polytech.isa.dd.entities.Provider;
import fr.unice.polytech.isa.dd.entities.Package;

import fr.unice.polytech.isa.dd.exceptions.AlreadyExistingPackageException;
import fr.unice.polytech.isa.dd.exceptions.UnknownPackageException;
import org.joda.time.DateTime;
import utils.MyDate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/packageService")
public interface PackageRegisterWebService {

    @WebMethod
    Boolean registerPackage(@WebParam(name="secretNumber") String secretNumber,
                  @WebParam(name="weight") Double weight,
                  @WebParam(name="dateTime") String deliveryDate,
                  @WebParam(name="providerName") String providerName) throws AlreadyExistingPackageException;

    @WebMethod
    @WebResult(name = "provider_found")
    Provider findProvider(@WebParam(name="provider_name") String provider_name);

    @WebMethod
    @WebResult(name = "package_found")
    Package findPackage(@WebParam(name="secretNumber") String secretNumber) throws UnknownPackageException;
}
