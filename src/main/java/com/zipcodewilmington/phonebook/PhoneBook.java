package com.zipcodewilmington.phonebook;


import java.sql.SQLOutput;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Pineapple McGee on 1/23/18.
 */

public class PhoneBook {
    private TreeMap<String, String> phoneBook = new TreeMap<>();

    public void add(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);


    }

    public void remove(String name) {
        phoneBook.remove(name);


    }

    public int size() {
        return phoneBook.size();
    }

    public Map<String, String> getPhoneBook() {
        return phoneBook;
    }

    public void setPhoneBook(TreeMap<String, String> phoneBook) {
        this.phoneBook = phoneBook;
    }

    public void get(String name) {
        phoneBook.get(name);
    }

    @SuppressWarnings("Duplicates")
    public String reverseLookup(String i) {

        String name = "" ;

        for (String key : this.phoneBook.keySet()) {
            if (this.phoneBook.get(key).contains(i)){
                name = key;

            }

        }
       return name;
    }

    @SuppressWarnings("Duplicates")
    public String listNamesAndNumbers() {
        String namesAndNumbers = "";

        String name = "";
        String number = "";


        for (String key : this.phoneBook.keySet()){
                name = key;
                number = phoneBook.get(key);
                namesAndNumbers += name + " " + number + "\n";
                }

        return namesAndNumbers;
    }
}








