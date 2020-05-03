package fr.unice.polytech.isa.dd;

import fr.unice.polytech.isa.dd.entities.Package;
import fr.unice.polytech.isa.dd.PackageFinder;
import fr.unice.polytech.isa.dd.PackageRegistration;
import fr.unice.polytech.isa.dd.entities.Provider;
import fr.unice.polytech.isa.dd.exceptions.AlreadyExistingPackageException;
import fr.unice.polytech.isa.dd.exceptions.UnknownPackageException;
import org.joda.time.DateTime;
import utils.MyDate;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/packageService")
@Stateless(name = "PackageWS")
public class PackageRegisterWebServiceImp implements PackageRegisterWebService {

    @EJB
    private PackageFinder packageFinder;
    @EJB
    private PackageRegistration packageRegistration;
    @EJB private ProviderFinder providerFinder;


    @Override
    public Boolean registerPackage(String secretNumber, Double weight, String deliveryDate, String providerName) throws AlreadyExistingPackageException {
        return packageRegistration.register(secretNumber, weight, deliveryDate, providerName);
    }

    @Override
    public Package findPackage(String secretNumber) throws UnknownPackageException {
        return packageFinder.findPackageBySecretNumber(secretNumber);
    }

    @Override
    public Provider findProvider(String name){
        System.out.println("findProvider");
        return providerFinder.findByName(name);
    }



}
