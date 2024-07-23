
package data;

import java.sql.*;

/**
 *
 * @author ponth
 */
public class DATA {
    
    //String sql="INSERT INTO  ARTIST values("+id+","+name+","+country+","+style);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        
    String id="97008";
    String name="zafar";
    String country="kalank";
    String  style="rowdy";
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");  

            try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","120698")) {
                Statement stmt=con.createStatement();
                PreparedStatement prep=con.prepareStatement("insert  into artist values(?,?,?,?)");
                prep.setString(1,id);
                prep.setString(2,name);
                prep.setString(3,country);
                prep.setString(4,style);
                prep.addBatch();
                con.setAutoCommit(false);
                prep.executeBatch();
                con.setAutoCommit(true);
                ResultSet rs=stmt.executeQuery("Select * from artist");
                while(rs.next())
                {
                    System.out.println("name="+rs.getString("artist_name"));
                    System.out.println("country="+rs.getString("COUNTRY"));
                }
                rs.close();
            }
        }
        catch(Exception  e)
        {
            System.out.println(e);
        }
    }
    
}
