package programs;

import java.sql.Connection;

import db.DB;

public class DBProgram {
  public static void main(String[] args) {
    Connection connection = DB.getConnection();
    System.out.println(connection);
    DB.closeConnection();
    System.out.println("Funcionou!");
  }
}
