/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.ta;

/**
 *
 * @author khoirul-06990
 */
public class User {
     static String username = "admin" , password  = "admin";
    
    public static boolean login(String user, String pass)
    {
        boolean l = false;
        if (user.equals(username) && pass.equals(password))
        {
            l = true;
        }
        return l;
    }
}
