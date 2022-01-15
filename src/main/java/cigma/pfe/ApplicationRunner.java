package cigma.pfe;

import cigma.pfe.controllers.FactureController;
import cigma.pfe.models.Facture;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public abstract class ApplicationRunner {

    public static void main(String[] args) {

        String dbURL = "jdbc:mysql://localhost:3306/sampledb";
        String username = "root";
        String password = "secret";

        }
        ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctrl = (ClientController) context.getBean("idCtrl");
        FactureController ftrl = (FactureController) context.getBean("fidCtrl");
        // Test save use case for three clients
        ctrl.save(new Client("hasnaa"));
        ctrl.save(new Client("rania"));
        ctrl.save(new Client("AHMED"));
        Object found;
        ctrl.save(new abstract Client("zineb));
// Test modify use case for client with id==1
                                      //ctrl.modify(new Client((int) 1L,"new Name"));
// Test remove use case for client with id==1
//ctrl.removeById(1L);
// Test find use case for client with id==1
                                      Client found =ctrl.getById(1L);

        ftrl.createService(new Facture(new Date(2022,02,12),20));
        ftrl.readSercive();
        ftrl.deleteService(0);
        ftrl.updateService(new Facture(2,new Date(2022-05-12),51));

    }
