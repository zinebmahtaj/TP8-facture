package cigma.pfe.Dao;

import cigma.pfe.models.Facture;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class FactureDaoImpl implements FactureDao{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("unit_factures");
    EntityManager em=emf.createEntityManager();

    @Override
    public Facture Create(Facture f) {
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Facture Read() {
        return null;
    }

    @Override
    public Facture Delete(long id) {
        em.getTransaction().begin();
        Facture FactureInDataBase = em.find(Facture.class,id);
        em.remove(FactureInDataBase);
        em.getTransaction().commit();
        return null;
    }

    @Override
    public Facture Update(Facture f) {
        em.getTransaction().begin();
        Facture currentFacture = em.find(Facture.class,new Facture().getId());
        currentFacture.setDate(new Facture().getDate());
        currentFacture.setAmount(new Facture().getAmount());
        em.persist(currentFacture);
        em.getTransaction().commit();
        return null;
    }
}