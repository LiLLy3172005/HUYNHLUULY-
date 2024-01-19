package com.example.qlnn1;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import com.microsoft.sqlserver.jdbc.SQLServerException;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.*;
public class LUULY1 {
  //  public static void main(String[] args) {

    public LUULY1() {
    }

       public static Connection getConnection() {
        Connection databaselink = null;
           String databaseName = "master";
           String databaseUser = "sa";
           String databasePassword = "123";
           String ulr = "jdbc:sqlserver://localhost:1433;databaseName=master;user=sa;password=123;encrypt=false";
           setEncrypt(false);
           try {
               Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
              databaselink = DriverManager.getConnection(ulr,databaseUser,databasePassword);
               System.out.println("1");
           } catch (Exception e) {
               e.printStackTrace();
           }
return databaselink;

  /*    SQLServerDataSource ds = new SQLServerDataSource();
        ds.setUser("sa");
        ds.setPassword("123");
        ds.setServerName("LAPTOP-DLG6S5IB\\LUULY");
        ds.setPortNumber(1433);
        ds.setDatabaseName("master");
        ds.setEncrypt(false);

//String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=QLDDH_TenSinhVien31;" + "encrypt= true;"
//                + "trustServerCertificate= true";
        // String User = "sa";
        //String PASSWORD = "123456789";

        ///connection = DriverManager.getConnection(DB_URL, USER, PASSWORD); //Tạo kết nối


        try(Connection conn = ds.getConnection()){
            System.out.println("Thanh Cong");
            System.out.println(conn.getMetaData());

        }catch (SQLServerException throwables) {
            throwables.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();;
        }



*/

       }

    private static void setEncrypt(boolean b) {
    }


}

