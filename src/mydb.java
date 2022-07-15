
import java.io.File;
import java.io.PrintWriter;
import java.sql.*;
import java.util.*;

public class mydb {

  /**
   * @param args
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub

    System.out.println("dattu");

    try {
      System.out.println("dattu1");
      File file = new File("dattu.pdf");
      java.io.PrintWriter out = new PrintWriter(file);
      out.write("dattu is a good boy");

      String url = "jdbc:mysql://localhost:3306/mydb";
      String username = "root";
      String password = "passwd";
      Class.forName("com.mysql.jdbc.Driver");
      System.out.println("Connecting database...");
      try (Connection con = DriverManager.getConnection(url, username, password)) {

        System.out.println("Database connected!");
        Statement stmt = con.createStatement();
        System.out.println("statement created");
        ResultSet rs = stmt.executeQuery("select * from emp");
        System.out.println("result set");

        while (rs.next()) {
          System.out.println(rs.getString(1));
          out.write(rs.getString(1));
          out.flush();
        }
        out.close();
        con.close();
      } catch (SQLException e) {
        e.printStackTrace();
        throw new IllegalStateException("Cannot connect the database!", e);
      }
    } catch (Exception e) {
      System.out.println(e);
    }
  }

}
