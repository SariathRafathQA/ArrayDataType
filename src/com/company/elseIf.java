package com.company;

public class elseIf {
    public static void main(String[] args){
        int user = 21;
        if (user <= 18) {
            System.out.println("User is 18 or younger");
        }

        else if (user>18 && user < 40) {
            System.out.println("User is between 19 and 39");
        }
        else {
            System.out.println("User is older than 40");
        }
    }
}

