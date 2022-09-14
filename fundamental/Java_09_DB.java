package javasql;

 import java.sql.*;
// Clase para conectar  a DATABASE
public class JavaSQL {

    public static void main(String[] args) {
        try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog","root","");
            Statement stmt = cn.createStatement();  
            ResultSet rs = stmt.executeQuery("select * from users");
            System.out.println("Connected");  
            while(rs.next()){
                System.out.println(rs.getInt("id"));
                System.out.println(rs.getString("name"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("password"));

            }
            cn.close();
            
        }catch(ClassNotFoundException | SQLException e){
            System.out.print("Error" + e);
        }
    }
}
