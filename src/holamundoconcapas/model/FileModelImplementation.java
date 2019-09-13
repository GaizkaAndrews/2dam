/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.model;

import java.util.ResourceBundle;

/**
 *
 * @author Gaizka
 */
public class FileModelImplementation implements Model{
    @Override
    public String getGreeting() {
         return ResourceBundle
            .getBundle("holamundoconcapas.model.Greeting")
                .getString("Greeting");
    }
}
