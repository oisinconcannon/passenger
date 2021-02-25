package ie.gmit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {


    private Passenger p1;

    @BeforeEach
    void init(){p1=new Passenger("Mr","Oisin",1234567890,"086 123 4567",22);}

    @Test
    void testConstructorTitleFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Master","Oisin",1234567890,"086 123 4567",22));
        assertEquals("Invalid Title",e.getMessage());
    }

    @Test
    void testConstructorNameFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr","O",1234567890,"086 123 4567",22));
        assertEquals("Invalid Name",e.getMessage());
    }

    @Test
    void testConstructorIDFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr","Oisin",12345,"086 123 4567",22));
        assertEquals("Invalid ID",e.getMessage());
    }

    @Test
    void testConstructorPhoneFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr","Oisin",1234567890,"086 123",22));
        assertEquals("Invalid Phone Number",e.getMessage());
    }

    @Test
    void testConstructorAgeFail(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> new Passenger("Mr","Oisin",1234567890,"086 123 4567",14));
        assertEquals("Invalid Age",e.getMessage());
    }

}
