
package conexion;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author GynRaider
 */
public class conexion {
    
    static String bd = "libreria";   
    static String login = "root"; 
    static String password = "lomito";
    static String url = "jdbc:mysql://localhost/"+bd;
    static Connection conn = null;
    static Statement st=null;
    
    public static Connection conectar() {
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            conn = DriverManager.getConnection(url, login, password);
        }catch(SQLException ex) {
            System.out.println("Rayos!!! Hubo un problema al conectar con la base "+url);
        }catch(ClassNotFoundException ex) {
            System.out.println(ex);
        }
         return conn;
    }
}
