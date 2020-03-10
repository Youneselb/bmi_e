package PresentationLayer;

import DBAccess.Connector;
import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static DBAccess.Connector.connection;

public class ChangePassword extends Command {



    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String email = request.getParameter("null");
        String password = request.getParameter("password1");
        try {
            Connection con = Connector.connection();
            connection();
            String SQL = "Update users Set password="+"'"+password+"'"+" WHERE email="+"'"+email+"'";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return "employeepage";





    }
}
