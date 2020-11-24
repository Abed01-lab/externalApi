package facades;

import DTO.FlightDTO;
import entities.Flight;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import utils.RequestBody;

/**
 *
 * Rename Class to a relevant name Add add relevant facade methods
 */
public class FligtFacade {

    private static FligtFacade instance;
    private static EntityManagerFactory emf;
    
    //Private Constructor to ensure Singleton
    private FligtFacade() {}
    
    
    /**
     * 
     * @param _emf
     * @return an instance of this facade class.
     */
    public static FligtFacade getFlightFacade(EntityManagerFactory _emf) {
        if (instance == null) {
            emf = _emf;
            instance = new FligtFacade();
        }
        return instance;
    }

    private EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
    
    public List<Flight> getAllFlights(){
        EntityManager em = getEntityManager();
        TypedQuery<Flight> query = em.createQuery("SELECT f FROM Flight f" , Flight.class);
        return query.getResultList();
    }
    
    public List<FlightDTO> getFlightWithRequest(RequestBody rb) {
        EntityManager em = getEntityManager();
        TypedQuery<Flight> query = em.createQuery("SELECT f FROM Flight f WHERE f.destination_to =: destination" , Flight.class);
        query.setParameter("destination", rb.getDestination_to());
        List<FlightDTO> flights = new ArrayList();
        for (Flight flight : query.getResultList()){
            flights.add(new FlightDTO(flight, rb));
        }
        return flights;
    }

}
