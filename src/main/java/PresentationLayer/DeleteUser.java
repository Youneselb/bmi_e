package PresentationLayer;

import DBAccess.Connector;
import FunctionLayer.LoginSampleException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static DBAccess.Connector.connection;

public class DeleteUser extends Command {


    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) throws LoginSampleException {
        String email = request.getParameter("email");
        try {
            Connection con = Connector.connection();
            connection();
            String SQL = "Delete FROM users Where email=" + "'" + email + "'";
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
