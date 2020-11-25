package entities;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@Entity
@Table(name = "flight")
public class Flight implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flight_id")
    private Integer id;
    @Column(name = "destination_from")
    private String destination_from;
    @Column(name = "destination_to")
    private String destination_to;
    @Column(name = "departure_time")
    private String departure_time;
    @Column(name = "arrival_time")
    private String arrivel_time;
    @Column(name = "price")
    private int price;
    
    public Flight() {
    }

    public Flight(String destination_from, String destination_to, String departure_time, String arrivel_time, int price) {
        this.destination_from = destination_from;
        this.destination_to = destination_to;
        this.departure_time = departure_time;
        this.arrivel_time = arrivel_time;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDestination_from() {
        return destination_from;
    }

    public void setDestination_from(String destination_from) {
        this.destination_from = destination_from;
    }

    public String getDestination_to() {
        return destination_to;
    }

    public void setDestination_to(String destination_to) {
        this.destination_to = destination_to;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public void setDeparture_time(String departure_time) {
        this.departure_time = departure_time;
    }

    public String getArrivel_time() {
        return arrivel_time;
    }

    public void setArrivel_time(String arrivel_time) {
        this.arrivel_time = arrivel_time;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}