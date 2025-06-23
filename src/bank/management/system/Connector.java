package bank.management.system;

import java.sql.*;
public class Connector {
    Connection connection;
    Statement statement;

    public Connector(){
           try{
               connection  = DriverManager.getConnection("jdbc:mysql://localhost:3307/BankSystem","root","12345678");
               statement = connection.createStatement();
           }catch (Exception e){
                e.printStackTrace();

        }

         }














    public static void main(String[] arg){

    }
}
