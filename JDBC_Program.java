package dsjavatraining;
import java.sql.*;
public class JDBC_Program {
    public static void main(String[] args) throws SQLException
    {
        jdbc();
    }

    private static void jdbc() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/expensedb";
        Connection conn = DriverManager.getConnection(url,"root","");
        String expensetype = " Burger";
        int expenseamount = 40;
     //   int rn = 12;
      //  String pno = "1234567890";

        String sql = "INSERT INTO expensetb(expensetype,expenseamount)" + "values('" + expensetype +"' ,"+ expenseamount+")";


        try{
            conn = DriverManager.getConnection(url,"root","");
            Statement st = conn.createStatement();
            int m = st.executeUpdate(sql);
            if(m == 1){
                System.out.println("Inserted Successfully:" + sql);
            } else {
                System.out.println("Insertion failed");

            }
        } catch (Exception ex){
            System.out.println(ex);
        }finally {
            conn.close();
        }
    }
}
