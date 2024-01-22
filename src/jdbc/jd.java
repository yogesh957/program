package jdbc;

import java.sql.*;

public class jd {

    public static void main(String[]args) {
      student bc = new student();
      int rows = bc.addStudent(10,"madra",00);
      if(rows>0) {
          System.out.println("OFFO BHAI ADD KARDIYE BOLO");
      }

    }
}
