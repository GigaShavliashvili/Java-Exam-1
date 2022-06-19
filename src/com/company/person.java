package com.company;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class person {

    protected String name;
    protected String lastName;
    protected String date;
    protected String gender;


   // SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    //String strDate = String.valueOf(formatter.parse(date));

    public void getPerson(String name, String lastName, String gender, String date) {
        this.name = name;
        this.lastName = lastName;
        this.date = date;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //  public  String getData(){
  //      return strDate;
   // }
}
