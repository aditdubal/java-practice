public class gymMembership{
    
    String memberName;
    String plan;
    int monthsRemaining;
    int totalFeePaid;
    int renewals;

    public gymMembership(String memberName, String plan){
        //memberName validation
        if(memberName == null || memberName.trim().isBlank()){
            throw new IllegalArgumentException("Invalide Member Name");
        }else{
            this.memberName = memberName;
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
}

public class GymMembership{
    public static void main(String[] args){
        gymMembership m1 = new gymMembership("ADI", "MONTHLY");
        System.out.println(m1.memberName);
        System.out.println(m1.totalFeePaid);
    }
}