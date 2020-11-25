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
    private String destination_to;

    public RequestBody(String destination_to) {
        this.destination_to = destination_to;    
    }

    public RequestBody() {
    }
    

    public String getDestination_to() {
        return destination_to;
    }

    public void setDestination_to(String destination_to) {
        this.destination_to = destination_to;
    } 

    @Override
    public String toString() {
        return "RequestBody{" + "destination_to=" + destination_to + '}';
    }
}
