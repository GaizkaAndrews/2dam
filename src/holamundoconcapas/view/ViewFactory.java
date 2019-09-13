/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundoconcapas.view;

/**
 *
 * @author Gaizka
 */
public class ViewFactory {
    
    public View getView(){
        return new Viewimplementation();
    }
}
