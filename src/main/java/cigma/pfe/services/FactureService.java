package cigma.pfe.services;

import cigma.pfe.models.Facture;

import java.util.Date;

public interface FactureService {

    Facture Create(Facture f);
    Facture Read();
    Facture Remove(long id);
    Facture Update(Facture f);


}