package DBAccess;

import FunctionLayer.LoginSampleException;
import FunctionLayer.User;
import PresentationLayer.Command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserList extends Command {

     ArrayList<String> UserList;

    private void initArray(){
        UserList = new ArrayList<>();
        Connection con = null;
        try {
            con = Connector.connection();
            String SQL = "SELECT email FROM useradmin.users WHERE role = 'customer';";
            PreparedStatement ps = con.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                UserList.add(rs.getString("email"));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {

       // if(UserList == null) {
            initArray();
        //}
        request.setAttribute("UserList",UserList);
        return "oversigt";
    }
}