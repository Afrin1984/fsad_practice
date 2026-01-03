package sms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCCurd {
	public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "root";
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");

            
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to Database!");

            
            Statement st = con.createStatement();

            
            String createDept = "CREATE TABLE IF NOT EXISTS dept1 (" +
                                "dept_id INT PRIMARY KEY, " +
                                "dept_name VARCHAR(50))";
            st.executeUpdate(createDept);
            System.out.println("Dept table created.");

            
            String createEmp = "CREATE TABLE IF NOT EXISTS employee1 (" +
                               "emp_id INT PRIMARY KEY, " +
                               "emp_name VARCHAR(50), " +
                               "salary DOUBLE, " +
                               "dept_id INT, " +
                               "FOREIGN KEY (dept_id) REFERENCES dept1(dept_id))";
            st.executeUpdate(createEmp);
            System.out.println("Employee table created.");

            
            

            st.executeUpdate("INSERT INTO employee1 VALUES (102, 'Bob', 60000, 2)");
            st.executeUpdate("INSERT INTO employee1 VALUES (103, 'Charlie', 70000, 3)");
            System.out.println("Employee values inserted.");

            
            con.close();
            System.out.println("Done and Connection Closed.");

        } catch (Exception e) {
            e.printStackTrace();
        }

        
}

}
