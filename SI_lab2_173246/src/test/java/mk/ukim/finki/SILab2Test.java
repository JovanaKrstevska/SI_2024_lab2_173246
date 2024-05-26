package mk.ukim.finki;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    SILab2 si_Lab2 = new SILab2();

    @Test
    public void everyBranchTesting(){
        RuntimeException ex =  assertThrows(RuntimeException.class,()->si_Lab2.checkCart(null,1));
        assertTrue(ex.getMessage().contains("can't be null!"));

        List<Item> items1 = new ArrayList<>();
        items1.add(new Item("",null,30,0));
        ex =  assertThrows(RuntimeException.class,()->si_Lab2.checkCart(items1,1));
        assertTrue(ex.getMessage().contains("No barcode!"));

        List<Item> items2 = new ArrayList<>();
        items2.add(new Item("valid","1lol",300,0));
        ex =  assertThrows(RuntimeException.class,()->si_Lab2.checkCart(items2,1000));
        assertTrue(ex.getMessage().contains("Invalid character"));

        List<Item> items3 = new ArrayList<>();
        items3.add(new Item("valid","023",300,0.1f));
        items3.add(new Item("valid","123",200,0));
        assertTrue(si_Lab2.checkCart(items3, 1000));


        List<Item> items4 = new ArrayList<>();
        items4.add(new Item("valid","023",100,0.1f));
        items4.add(new Item("valid","123",100,0));
        assertFalse(si_Lab2.checkCart(items4,100));
    }

    @Test
    public void MultipleConditionTesting() {
        Item item1 = new Item("item1", "023456", 350, 0.1f);
        Item item2 = new Item("item2", "123456", 250, 0.2f);
        Item item3 = new Item("item3", "023368", 550, 0.1f);
        Item item4 = new Item("item4", "158967", 350, 0.1f);

        List<Item> itemList = Arrays.asList(item1);
        assertTrue(SILab2.checkCart(itemList, 200));

        itemList = Arrays.asList(item2);
        assertTrue(SILab2.checkCart(itemList, 200));

        item1.setDiscount(0);
        itemList = Arrays.asList(item3);
        assertFalse(SILab2.checkCart(itemList, 200));

        item1.setDiscount(0.1f);
        item1.setBarcode("123456789");
        itemList = Arrays.asList(item4);
        assertFalse(SILab2.checkCart(itemList, 200));
    }
}