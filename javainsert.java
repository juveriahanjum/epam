import java.sql.*;
import java.util.*;
public class javainsert
{
	public static void main(String args[]) throws Exception
	{
Class.forName("Oracle.jdbc.driver.OracleDriver");
String url="jdbc:oracle:thin:@LocalHost:1521:XE";
Connection con=DriverManager.getConnection(url,"system","abc123");
Statement st=con.createStatement();
Scanner ob=new Scanner(System.in);
while(true)
{
System.out.println("enter coustomer name:");
String cn=ob.next();
System.out.println("enter city:");
String ct=ob.next();
String s="insert into coudtomer values('"+cn+"','"+ct+"')";
int n=st.executeUpdate(s);
System.out.println(n+"row inserted");
System.out.println("to countinue enter 1");
int n1=ob.nextInt();
if(n1!=1);
break;
}
con.close();
st.close();
}
}