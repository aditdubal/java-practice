package com.practice.constructors;

public class GymMembership{
    public static void main(String[] args){
        gymMembership m1 = new gymMembership("ADI", "MONTHLY");
        System.out.println(m1.memberName);
        System.out.println(m1.totalFeePaid);
    }
}