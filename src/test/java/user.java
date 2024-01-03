import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

//import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.example.email;
import com.example.firstName;
import com.example.lastName;
import com.example.mobile;
import com.example.password;
import com.example.InvalidDataException;

public class user {

    @ParameterizedTest
    @ValueSource(strings = { "Rajat", "Raj", "Aditya", "Sarthak" })
    public void correctFirstNameHappy(String name) throws InvalidDataException {
        firstName first = new firstName(name);
        assertTrue(first.is_valid());
    }

    @ParameterizedTest
    @ValueSource(strings = { "raja", "Ra", "tarun", "tanisha" })
    public void incorrectFirstNameSad(String name) throws InvalidDataException {
        try {
            firstName first = new firstName(name);
            assertFalse(first.is_valid());
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "Sharma", "SHAr", "Aditya", "Sarthak" })
    public void correctLastNameHappy(String name) throws InvalidDataException {
        try {
            lastName last = new lastName(name);
            assertTrue(last.is_valid());
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }

    }

    @ParameterizedTest
    @ValueSource(strings = { "sharma", "Sh", "kuar", "kumar" })
    public void incorrectLastNameSad(String name) throws InvalidDataException {
        try {
            lastName last = new lastName(name);
            assertFalse(last.is_valid());
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "abc@yahoo.com",
            "abc-100@yahoo.com",
            "abc.100@yahoo.co",
            "abc111@abc.com",
            "abc-100@abc.net",
            "abc@1.com",
            "abc@gmail.com.co",
            "abc+100@gmail.co",
    })
    public void correctemailHappy(String id) throws InvalidDataException {
        try {
            email e = new email(id);
            assertTrue(e.is_valid());
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "abc",
            "abc@.com.my",
            "abc123@gmail.a ",
            "abc123@.com ",
            "abc123@.com.com",
            ".abc@abc.com ",
            "abc()*@gmail.com ",
            "abc@%*.com ",
            "abc..2002@gmail.com ",
            "abc.@gmail.com ",
            "abc@abc@gmail.com",
            "abc@gmail.com.1a",
            "abc@gmail.com.aa.au", })
    public void incorrectemailSad(String id) throws InvalidDataException {
        try {
            email e = new email(id);
            assertFalse(e.is_valid());
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "+91 9027737639", "+12-3 9022892761", "+10 2888882929" })
    public void correctMobile(String id) throws InvalidDataException {
        try {
            mobile e = new mobile(id);
            assertTrue(e.is_valid());
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "+91 90737639", "+12-3 90261", "+10 282929" })
    public void incorrectMobile(String num) throws InvalidDataException {
        try {
            mobile e = new mobile(num);
            assertFalse(e.is_valid());
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "Rajat123#", "#89Qekjkkbdb", "123456A#" })
    public void correctPassword(String pass) throws InvalidDataException {
        try {
            password p = new password(pass);
            assertTrue(p.is_valid());
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }

    @ParameterizedTest
    @ValueSource(strings = { "Rajat123", "#89Q", "123456#" })
    public void incorrectPassword(String pass) throws InvalidDataException {
        try {
            password p = new password(pass);
            assertFalse(p.is_valid());
        } catch (InvalidDataException e) {
            System.out.println(e.getMessage());
        }
    }
}
