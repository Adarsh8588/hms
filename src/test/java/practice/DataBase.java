package practice;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.testng.annotations.Test;

import com.mysql.jdbc.Driver;


public class DataBase { 
  @Test
public void opendb() throws SQLException
{    // Driver dbd=new Driver();
    DriverManager.registerDriver((java.sql.Driver) new Driver());
    
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employe", "root", "root");

System.out.println("connection established");
  Statement s=con.createStatement();
  Scanner sc=new Scanner(System.in);
  String data = sc.next();
//  try
//  {
//  s.executeUpdate("create table Employee(EmployeeName varchar(20);");
//  }catch (Exception e) {
//    
//  }
  System.out.println("Enter the Name");
  System.out.println("PASS");
//  try {
//  int val = s.executeUpdate("insert into Employee values('"+data+"');");
//  }
//catch (Exception e) {
//    
//  }
  
  ResultSet value = s.executeQuery("select EmployeeName from Employee where EmployeeName= '"+data+"';");
  //ResultSet value = s.executeQuery("Select EmployeeName from Employee");
  List< String > arr=new ArrayList<String>();
  try {
  while(value.next())
      {
    arr.add(value.getString("EmployeeName"));
      }
  }
  catch (SQLException e) {
        e.printStackTrace();
        
      }    
  boolean flag=false;
  for(String str:arr)
  {
    if(str.equalsIgnoreCase(data));
    {
      flag=true;
      break; 
    }
  }
  
  if(flag==true)
  {
    System.out.println(data);
  }
  else
  {
    int st1 = s.executeUpdate("insert int Employee values('"+data+");");
    if(st1==1)
    {
    System.out.println(data+"IS UPADTED");
  }}
  con.close();
}  
}