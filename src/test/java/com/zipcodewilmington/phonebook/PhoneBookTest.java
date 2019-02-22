package com.zipcodewilmington.phonebook;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Pineapple McGee on 1/23/18.
 */
public class PhoneBookTest {
    PhoneBook blackBook;

    @Before
    public void reset() {
        blackBook = new PhoneBook();
    }

    @Test
    public void testAdd() {

        //GIVEN


        //WHEN
        blackBook.add("Jenny Hook", "8675309");

        //THEN
        int actual = blackBook.size();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testRemove() {

        //GIVEN
        blackBook.add("Jenny Hook", "8675309");

        //WHEN
        blackBook.remove("Jenny Hook");

        //THEN
        int actual = blackBook.size();
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testReverseLookUp() {

        //GIVEN
        blackBook.add("Jenny Hook", "8675309");

        //WHEN
        String expected = blackBook.reverseLookup("8675309");


        //THEN
        String actual = "Jenny Hook";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testPrintListOfNames() {

        //GIVEN


        //WHEN
        blackBook.add("Jenny Hook", "8675309");
        blackBook.add("Michael Davenport", "4970356");
        blackBook.add("Justin Schitz", "7198760");

        //THEN
       String actual = "Jenny Hook " + "8675309" + "\n" + "Justin Schitz " + "7198760" + "\n" + "Michael Davenport " + "4970356" + "\n";
       String expected = blackBook.listNamesAndNumbers();
       Assert.assertEquals(expected, actual);
    }


}
