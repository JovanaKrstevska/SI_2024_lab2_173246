package mk.ukim.finki;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    SILab2 si_Lab2 = new SILab2();

    @Test
    public void CantBeNullTesting() {
        RuntimeException ex = assertThrows(RuntimeException.class, () -> si_Lab2.checkCart(null, 1));
        assertTrue(ex.getMessage().contains("can't be null!"));
    }
    @Test
    public void NoBarcodeTesting() {
        RuntimeException ex;
        List<Item> items1 = new ArrayList<>();
        items1.add(new Item("",null,30,0));
        ex =  assertThrows(RuntimeException.class,()->si_Lab2.checkCart(items1,1));
        assertTrue(ex.getMessage().contains("No barcode!"));
    }
    @Test
    public void InvalidCharacterTesting() {
        RuntimeException ex;
        List<Item> items2 = new ArrayList<>();
        items2.add(new Item("valid","12A3",300,0));
        ex =  assertThrows(RuntimeException.class,()->si_Lab2.checkCart(items2,1000));
        assertTrue(ex.getMessage().contains("Invalid character"));
    }
}