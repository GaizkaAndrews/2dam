/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.controller;

import holamundoconcapas.view.View;
import holamundoconcapas.model.Model;
/**
 *
 * @author Gaizka
 */
public class Controller {
    
    public void run(View view, Model model){
            view.showGreeting(model.getGreeting());
    }
}
