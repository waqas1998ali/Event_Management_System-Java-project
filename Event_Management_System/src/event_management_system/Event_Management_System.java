
package event_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.xml.transform.Result;

public class Event_Management_System {

   
    public static void main(String[] args) {
        
SimpleDateFormat sdf = new SimpleDateFormat("M/dd/yy");
Date date=new Date();
String curdate=sdf.format(date);
        System.out.println(curdate);
Calendar c = Calendar.getInstance();
c.setTime(new Date()); // Now use today date.
c.add(Calendar.DATE, 7); // Adding 5 days
String output = sdf.format(c.getTime());
System.out.println(output);
       

         try
         {
         Connection con = DriverManager.getConnection("jdbc:odbc:bridge1","sa","123");
         Statement st=con.createStatement();
         ResultSet rs= st.executeQuery("select top(3)* from Events where Ev_Date between '"+curdate+"' and '"+output+"'");
         
         while(rs.next())
         {
             String a = rs.getString(2).toString();
             System.out.println(" geting :  "+a);
         
         }
             
             
        }
        catch(Exception e)
        {
        System.out.println(""+e);
        }


// TODO code application logic here
    }
}
