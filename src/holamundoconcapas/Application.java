/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas;

import holamundoconcapas.controller.Controller;
import holamundoconcapas.model.ModelFactory;
import holamundoconcapas.view.ViewFactory;
/**
 *
 * @author Gaizka
 */
public class Application {
    public static void main(String[] args){
        ModelFactory modelFactoria = new ModelFactory();
        ViewFactory viewFactoria = new ViewFactory();
        Controller control= new Controller();
        
        control.run(viewFactoria.getView(), modelFactoria.getModel());
        //new Controller().run(ViewFactory.getView(),ModelFactory.getModel());
    }
}
