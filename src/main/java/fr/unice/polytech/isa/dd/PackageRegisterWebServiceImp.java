package fr.unice.polytech.isa.dd;

import fr.unice.polytech.isa.dd.entities.Package;
import fr.unice.polytech.isa.dd.PackageFinder;
import fr.unice.polytech.isa.dd.PackageRegistration;
import fr.unice.polytech.isa.dd.entities.Provider;
import org.joda.time.DateTime;
import utils.MyDate;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.unice.fr/si/4a/isa/dd/packageService")
@Stateless(name = "PackageWS")
public class PackageRegisterWebServiceImp implements PackageRegisterWebService {

    @EJB
    private PackageFinder finder;
    @EJB
    private PackageRegistration registry;
    @EJB private ProviderFinder finderP;


    @Override
    public Boolean register(String id, Double w, String dt, Provider pro) {
        return registry.register(id, w, dt, pro);
    }

    @Override
    public Package findPackage(String id) {
        return finder.findById(id);
    }

    @Override
    public Provider findProvider(String name){
        System.out.println("findProvider");
        return finderP.findByName(name);
    }



}
