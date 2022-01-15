package cigma.pfe.controllers;

import cigma.pfe.models.Facture;
import cigma.pfe.services.FactureServiceImpl;
import cigma.pfe.services.IFactureService;

public class FactureController {
    private IFactureService iFactureService;

    public void setiFactureService(IFactureService iFactureService) {
        this.iFactureService = iFactureService;

    }

    public IFactureService getiFactureService() {
        return iFactureService;
    }
    public void updateService(Facture f){iFactureService.Update(f);}
    public void createService(Facture f){iFactureService.Create(f);}
    public void deleteService(long id){iFactureService.Remove(id);}
    public void readSercive(){iFactureService.Read();}
}