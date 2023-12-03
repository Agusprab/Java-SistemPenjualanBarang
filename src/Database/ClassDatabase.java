package Database;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
/**
 *
 * @author AP
 */
public class ClassDatabase {
    public static String PathReport=System.getProperty("user.dir") + "/src/Laporan";
    private static Connection koneksi;
    public static Connection getkoneksi(){
        if(koneksi == null){
            try{
                String url = new String();
                String user = new String();
                String password = new String();
                url = "jdbc:mysql://localhost:3306/05tplp004";
                user = "root";
                password = "";
//                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                
                koneksi = DriverManager.getConnection(url,user,password);
                System.out.println("Koneksi berhasil");
            }catch(SQLException e){
                System.out.println("Error membuat koneksi");
            }
          
        }
          return koneksi;
    }
}
