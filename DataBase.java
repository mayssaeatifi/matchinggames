/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.SQLException;
import javax.swing.JOptionPane ;
/**
 *
 * @author mayssae
 */
public class DataBase {
    public static Connection getConnection(){
        Connection conec = null ;
        try {
            //'users' must be the name of the database
            conec = DriverManager.getConnection("jdbc:mysql://localhost:3306/users","root","wahb1234");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "failed");
           
        }
        return conec ;
    }
    
}
