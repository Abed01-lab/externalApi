/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author abed
 */
public class RequestBody {
    private String destination_from;
    private String destination_to;
    private String departure_time;
    private String arrivel_time;
    private String price;

    public RequestBody(String destination_from, String destination_to, String departure_time, String arrivel_time, String price) {
        this.destination_from = destination_from;
        this.destination_to = destination_to;
        this.departure_time = departure_time;
        this.arrivel_time = arrivel_time;
        this.price = price;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    } 
}
