package PresentationLayer;

import DBAccess.UserList;
import FunctionLayer.LoginSampleException;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class Command {

    private static HashMap<String, Command> commands;

    private static void initCommands() {
        commands = new HashMap<>();
        commands.put( "login", new Login() );
        commands.put( "register", new Register() );
        commands.put("oversigt", new UserList());
        commands.put("RegisterEmp", new RegisterEmp());
        commands.put("DeleteUser", new DeleteUser());
        commands.put("ChangePassword", new ChangePassword());
    }

    static Command from( HttpServletRequest request ) {
        String TagetName = request.getParameter( "taget" );
        if ( commands == null ) {
            initCommands();
        }
        return commands.getOrDefault(TagetName, new UnknownCommand() );   // unknowncommand er default.
    }

    public abstract String execute(HttpServletRequest request, HttpServletResponse response)
            throws LoginSampleException;

}
