/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import classe.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban Bv
 */
public class modelbase {

    dbdate dbdate;  

    public modelbase() {
        this.dbdate = new dbdate(); // va al  metodo que se encarga de tener la información para hacer la conexion con la base de datos
    }
// a este metodo se le envio un parametro para hacer filtro en la base de datos por la regiones que conincidan con esas letreas
    public LinkedList<classess> Listust(String letras) {  // se crea una linkedlist que almacena objetos de la clase Classess

        LinkedList<classess> list = new LinkedList<>(); // se inicializa una linkedlist vacia 

        try ( Connection conn = DriverManager.getConnection(dbdate.getUrl(), dbdate.getUser(), dbdate.getPassword())) {// se hace la conexión
            String query = " SELECT * FROM tb_people  WHERE region  LIKE CONCAT('%', ?, '%')"; //  se prepara la consulta para filtrar a partir de las letras enviadas desde la vista
            PreparedStatement statemenprov = conn.prepareStatement(query);
            statemenprov.setString(1, letras);  
            ResultSet result = statemenprov.executeQuery(); // se ejecuta la consulta
            while (result.next()) {  

                int id = result.getInt(1);
                String named = result.getString(2);
                String postalZip = result.getString(3);
                String phone= result.getString(4);
                String address= result.getString(5);
                String country= result.getString(6);
                String currency= result.getString(7);
                String alphanumeric= result.getString(8);
                int numberrange = result.getInt(9);
                String region= result.getString(10);
                String text= result.getString(11);
                String email= result.getString(12);
                String listt= result.getString(13);
                  // se crea un objeto de tipo Classess y se almacena en la linkedList
               classess user = new classess(id, named, postalZip, phone, address,country,currency,alphanumeric,numberrange,region,text,email,listt);
            list.add(user);
            }
           // conn.close();
            //return list;
        } catch (Exception e) {
            System.out.println("error"+e);
             //JOptionPane.showMessageDialog(null, e);

        }return list; // se retorna la linkedlist

    } 

}


