package com.practice.constructors;

public class gymMembership{
    
    String memberName;
    String plan;
    int monthsRemaining;
    int totalFeePaid;
    int renewals = 0;

    public gymMembership(String memberName, String plan){
        //memberName validation
        if(memberName == null || memberName.trim().isBlank()){
            throw new IllegalArgumentException("Invalide Member Name");
        }else{
            this.memberName = memberName.trim();
        }

        //plan validation
        if(plan == null || plan.trim().isBlank()){
            throw new IllegalArgumentException("Invalide Plan");
        }else if("MONTHLY".equalsIgnoreCase(plan)){
            this.plan = "MONTHLY";
            this.totalFeePaid = 1500;
            this.monthsRemaining = 1;
        }else if("QUARTERLY".equalsIgnoreCase(plan)){
            this.plan = "QUARTERLY";
            this.totalFeePaid = 4000;
            this.monthsRemaining = 3;
        }else if("YEARLY".equalsIgnoreCase(plan)){
            this.plan = "YEARLY";
            this.totalFeePaid = 12000;
            this.monthsRemaining = 12;
        }
        
        else{
            throw new IllegalArgumentException("Invalide Plan");
        }


    }

    public int renew(){
        int charge = 0;
        if("MONTHLY".equals(this.plan)){
            charge = 1500*90/100;
            this.monthsRemaining += 1;
        }else if("QUARTERLY".equals(this.plan)){
            charge = 4000* 90/100;
            this.monthsRemaining += 3;
        }else{
            charge = 12000* 90/100;
            this.monthsRemaining += 12;
        }
        this.totalFeePaid += charge;
        this.renewals += 1;
        return charge;

    }

    public boolean completeMonth(){
        if(monthsRemaining > 0){
            monthsRemaining -= 1;
            return true;
        }else{
            return false;
        }
    }

    public boolean isActive(){
        return monthsRemaining > 0;
    }

    public String describe(){
        return memberName + " | " + plan +" | Months left: " + monthsRemaining +" | Paid rs. " + totalFeePaid + " | Renewals: " + renewals;
    }
}

