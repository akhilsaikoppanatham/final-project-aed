/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author yojanitammineni
 */
public class RegularExpressionCheck {

    public static int c = 0;

    public static boolean findRE(String userName) {
        Pattern ptr = Pattern.compile("^([a-zA-Z\u0080-\u024F]+(?:. |-| |'))*[a-zA-Z\u0080-\u024F]*$", Pattern.CASE_INSENSITIVE);
        Matcher m = ptr.matcher(userName);
        //          if(m.find())
//            return true;
//          else 
//              return false;
        return true;
    }
}
