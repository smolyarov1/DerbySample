/*import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;*/
import java.sql.*;

public class DerbySimpleCode {
    //public static String driver = "org.apache.derby.jdbc.ClientDriver";
    public static String driver = "org.apache.derby.jdbc.EmbeddedDriver";
    public static String protocol = "jdbc:derby:/home/aleksey/HIT/Java/DerbySample/MyDB;create=true";
    private static Connection connection;

    public static void main(String[] args) {

        /*View demo = new View();
        demo.go();*/

        Statement statement = null;
        ResultSet rs = null;

        try
        {

            startDatabase();
            initDatabase();

//            statement = connection.createStatement();
//
//            rs = statement.executeQuery("select sum(SALARY) from SALARIES where EMPLOYEE_ID = 128950903 ");
//            while(rs.next())
//            {
//                System.out.println("Sum of salary for employee ID " + rs.getString(1));
//                        /*+ " Salary Date = " + rs.getString("Date"));
//                        + "City = " + rs.getString("city")
//                        + "Address = " + rs.getString("address")
//                        + "Email = " + rs.getString("email"));*/
//            }
            //statement.execute("Drop Table inventory");
        }
        catch (Exception e) {e.printStackTrace();}
        finally {
            if(statement!=null) try {statement.close(); } catch(Exception e) {}
            if(connection!=null) try {connection.close(); } catch(Exception e) {}
            if(rs!=null) try {rs.close(); } catch(Exception e) {}
        }

    }

    private static void initDatabase() {
        try {
            Statement statement = connection.createStatement();

            ResultSet rs = null;

            //rs = statement.executeQuery("select * from EMPLOYESS");

            rs = statement.executeQuery("select * from EMPLOYEES");
            while(rs.next())
            {
                System.out.println("Employee ID = " +rs.getInt("employee_id")
                        + " First Name = " + rs.getString("first_name")
                        + " Last Name = " + rs.getString("last_name")
                        + "City = " + rs.getString("city")
                        + "Address = " + rs.getString("address")
                        + "Email = " + rs.getString("email"));
            }
            rs = statement.executeQuery("select * from SALARIES");
            while(rs.next())
            {
                System.out.println("Employee ID = " +rs.getInt("employee_id")
                        + " Salary = " + rs.getString("SALARY")
                        + " Salary Date = " + rs.getString("Date"));
            }

            //statement.execute(("CREATE TABLE Employees(employee_id int PRIMARY KEY,first_name varchar(20) NOT NULL,last_name varchar(20) NOT NULL,city varchar(20) NOT NULL,address varchar(30),email varchar (30))"));
            //System.out.println("Alexxxxxxey b ks");
//            statement.execute(("CREATE TABLE Salaries(employee_id int(9),salary int(8),date date,);"));
//            statement.execute(("insert into Employees (employee_id,first_name,last_name,city,address,email) VALUES(307429680,'alex','smoly','Tel Aviv', 'Ziatli 24', 'amigo123@yahoo.com');"));
//            statement.execute(("insert into Employees (employee_id,first_name,last_name,city,address,email) VALUES(200144938,'maayan','partner','Holon', 'HIT 1', 'familio@gmail.com');"));

            /*statement.execute(("CREATE TABLE Employees(employee_id int PRIMARY KEY,first_name varchar, last_name varchar, city varchar,address varchar,email varchar );"));
            statement.execute(("CREATE TABLE Salaries(employee_id int(9),salary int(8),date date,);"));
            statement.execute(("insert into Employees (employee_id,first_name,last_name,city,address,email) VALUES(307429680,'alex','smoly','Tel Aviv', 'Ziatli 24', 'amigo123@yahoo.com');"));
            statement.execute(("insert into Employees (employee_id,first_name,last_name,city,address,email) VALUES(200144938,'maayan','partner','Holon', 'HIT 1', 'familio@gmail.com');"));
*/
            /*statement.execute(("create table inventory(id int, fee double)"));
            statement.execute(("insert into inventory values (100212, 2.5)"));
            statement.execute(("insert into inventory values (100213, 1.2)"));
            statement.execute(("insert into inventory values (100214, 24.2)"));*/

/*            rs = statement.executeQuery("select * from EMPLOYEES");
            while(rs.next())
            {
                System.out.println("Employee ID = " +rs.getInt("employee_id")
                        + " First Name = " + rs.getString("first_name")
                        + " Last Name = " + rs.getString("last_name")
                        + "City = " + rs.getString("city")
                        + "Address = " + rs.getString("address")
                        + "Email = " + rs.getString("email"));
            }*/

            /*rs = statement.executeQuery("select * from SALARIES");
            while(rs.next())
            {
                System.out.println("Employee ID = " +rs.getInt("employee_id")
                        + " Salary = " + rs.getString("SALARY")
                        + " Salary Date = " + rs.getString("Date"));*//*
                        + "City = " + rs.getString("city")
                        + "Address = " + rs.getString("address")
                        + "Email = " + rs.getString("email"));*//*
            }*/
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void startDatabase() {
        //Instantiating the driver class will indirectly register this driver as an available driver for DriverManager
        connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(protocol);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        // Getting a connection by calling getConnection
    }
}
