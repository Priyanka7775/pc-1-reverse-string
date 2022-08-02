package com.jap;

public class ReverseStringDemo {
    public static void main(String[] args) {

        //Create a String object.
        String string="Programming";

        //Create an object of the class ReverseStringDemo
        ReverseStringDemo r=new ReverseStringDemo();

        //Call the method getReverseString() and pass the parameter
        r.getReverseString(string);


    }
//Write the logic to reverse the String  inside the below method and return the reverse String.
public String getReverseString(String string){

        char ch[]=string.toCharArray();
        String rev="";
        for(int i=ch.length-1;i>=0;i--){
            rev+=ch[i];

        }
        System.out.println("Reverse string is :" +rev);
        return rev;
    }
}
