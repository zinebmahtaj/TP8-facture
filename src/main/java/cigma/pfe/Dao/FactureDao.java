package cigma.pfe.Dao;

import cigma.pfe.models.Facture;

public interface FactureDao {
    Facture Create(Facture f);
    Facture Read();
    Facture Delete(long id);
    Facture Update(Facture f);
}