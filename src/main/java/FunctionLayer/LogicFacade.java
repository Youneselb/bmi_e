package FunctionLayer;

import DBAccess.UserMapper;

/**
 * The purpose of LogicFacade is to...
 * @author kasper
 */
public class LogicFacade {

    public static User login( String email, String password ) throws LoginSampleException {
        return UserMapper.login( email, password );
    } 

    public static User createUser( String email, String password, Boolean Emp ) throws LoginSampleException {
        String role = "customer";

       if(Emp=true) {
           role = "employee";
        }

        User user = new User(email, password, role);
        UserMapper.createUser( user );
        return user;
    }

}
