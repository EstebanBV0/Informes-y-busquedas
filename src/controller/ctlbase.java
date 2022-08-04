/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import classe.*;
import java.sql.SQLException;
import java.util.LinkedList;
import model.*;
/**
 *
 * @author Esteban Bv
 */
public class ctlbase {
    
    private modelbase modelbase;
    
      public ctlbase() {
        this.modelbase = new modelbase(); // se instancia la dependencia del modelo
    }
    
    
     // se crea un metodo tipo lista el cual va tener dentro de la lista objetos de tipo classess
    public LinkedList<classess> Listust(String letras) { // esta lista se retorna del modela con la interacción con la base de datos
        
        LinkedList<classess> usuariolist = null;
        usuariolist = this.modelbase.Listust(letras);
    
    return usuariolist;
    }
    
}
