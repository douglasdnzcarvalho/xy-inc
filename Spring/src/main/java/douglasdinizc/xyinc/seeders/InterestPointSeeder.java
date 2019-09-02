package douglasdinizc.xyinc.seeders;

import douglasdinizc.xyinc.models.InterestPoint;
import douglasdinizc.xyinc.repositories.InterestPointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class InterestPointSeeder {

    @Autowired
    private InterestPointRepository IPR;

    @EventListener
    public void seed(ContextRefreshedEvent event) {
        System.out.println("Inserindo pontos de interesses iniciais...");

        ArrayList<InterestPoint> data = new ArrayList<InterestPoint>();

        data.add( new InterestPoint("Lanchonete", 27, 12) );
        data.add( new InterestPoint("Posto", 31, 18) );
        data.add( new InterestPoint("Joalheria", 15, 12) );
        data.add( new InterestPoint("Floricultura", 19, 21) );
        data.add( new InterestPoint("Pub", 12, 8) );
        data.add( new InterestPoint("Supermercado", 23, 6) );
        data.add( new InterestPoint("Churrascaria", 28, 2) );

        IPR.saveAll(data);

        System.out.println("Pontos de Interesse inseridos com sucesso!");
    }
}
