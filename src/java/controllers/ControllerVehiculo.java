/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author User
 */
@Named(value = "controllerVehiculo")
@SessionScoped
public class ControllerVehiculo implements Serializable {

    /**
     * Creates a new instance of ControllerVehiculo
     */
    public ControllerVehiculo() {
    }
    
}
