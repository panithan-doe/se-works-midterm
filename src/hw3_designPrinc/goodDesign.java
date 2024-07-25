/**
 * @author  6510450569 Panithan Champahom
 */

package hw3_designPrinc;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class goodDesign {
    public boolean register(User user) {
        isNameValid(user.getName());
        isEmailValid(user.getEmail());
        isAgeValid(user.getAge());

        return true;
    }


    // method เช็คความถูกต้องของชื่อ
    public boolean isNameValid(String name) {
        if (isEmptyString(name)) {
            throw new IllegalArgumentException("Name should not empty");
        }

        if ( !name.matches("[a-zA-Z]+")){
            throw new IllegalArgumentException("Name is wrong format");
        }


        return true;
    }

    // method เช็คความถูกต้องของ email
    public boolean isEmailValid(String email) {
        String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A- Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        if (isEmptyString(email)) {
            throw new IllegalArgumentException("Email should not empty");
        }

        Pattern validEmailPattern = Pattern.compile(EMAIL_PATTERN);
        if( !validEmailPattern.matcher(email).matches() ) {
            throw new IllegalArgumentException("Email is wrong format");
        }

        if (!isAllowDomain(email)) {
            throw new IllegalArgumentException("Domain Email is not allow");
        }

        return true;
    }

    // method เช็คความถูกต้องของอายุ
    public boolean isAgeValid(int age) {
        if( age < 20 ) {
            throw new IllegalArgumentException("Age should more than 20 years");
        }
        return true;
    }

    // method เช็ค string ว่าง
    public boolean isEmptyString(String string) {
        if (string == null || string.trim().equals("")) {
            return true;
        }
        return false;

    }

    // method เช็ค email domain
    public boolean isAllowDomain(String email) {
        List<String> notAllowDomains = Arrays.asList("dom1.cc","dom2.cc", "dom3.cc");
        if(notAllowDomains.contains(email.split("@")[1])) {
            return false;
        }
        return true;

    }

}
