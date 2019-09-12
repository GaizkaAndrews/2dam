/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.controller;

import holamundoconcapas.model.Modelinterface;
import holamundoconcapas.view.ViewInterface;
/**
 *
 * @author 2dam
 */
public class Controller {
    
    public void run(ViewInterface view, Modelinterface model){
            view.showGreeting(model.getGreeting());
    }
}
