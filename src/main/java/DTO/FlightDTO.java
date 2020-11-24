/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import entities.Flight;
import utils.RequestBody;

/**
 *
 * @author abed
 */
public class FlightDTO {
    private String destination_from;
    private String destination_to;
    private String departure_time;
    private String arrivel_time;
    private String price;

    public FlightDTO(Flight flight, RequestBody rb) {
        this.destination_from = flight.getDestination_from();
        this.destination_to = flight.getDestination_to();
        this.departure_time = departureDatoAndTime(flight.getDeparture_time());
        this.arrivel_time = arrivelDatoAndTime(rb.getArrivel_time());
        this.price = flight.getPrice();
    }
    
    private String departureDatoAndTime(String departure_time){
        //Her vil jeg tilføje en departure_time_data
        return "";
    }
    private String arrivelDatoAndTime(String arrivel_time){
        //Her vil jeg tilføje en arrivel_time_data
        return "";
    }
}
