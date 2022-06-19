package com.company;

public class Employee extends person{

           private  int age;
           private int salary;

     public void setEmployee(String name, String lastName, String date, String gender , int age, int salary) {
         super.getPerson(name, lastName, gender, date);

         this.age = age;
         this.salary = salary;
    }

        public String getEmployee() {
            return name + " = name " + lastName + " = lastName " +  gender
                    + " = gender " +  " = date " +  age + " = age " + salary + " = salary ";
        }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
