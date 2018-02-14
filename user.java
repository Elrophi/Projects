import java.sql.*;

class user{
   

  public static void main(String[] args) {
      users use= new users();
      use.setVisible(true);
    
      entry enter=new entry();
      enter.setVisible(true);
      
try{
    

    //Class.forName("com.mysql.jdbc.Drivers");
    
   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/entitydb", "root", "");
   System.out.print("connected");
    
    Statement st= con.createStatement();
    
    ResultSet rs=st.executeQuery("");
    rs.next();
    
    //while (rs.next()){
      //  String name=rs.getString("Username");
        // String pass=rs.getString("Password");
         
         //System.out.print("Name"+ name +"Pass" +pass);
    //}
    
  
    
    con.close();
    
}
catch (SQLException e)  {
            System.out.print("Error");
           }
    
}
}