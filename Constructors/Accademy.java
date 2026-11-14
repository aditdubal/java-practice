public class StudentAdmission{
    String name;
    String course;
    int age;
    int fee;
    int rollNumber;

    public StudentAdmission(){
        this.name = "guest";
        this.course = "Java basics";
        this.age = 18;
        this.fee = 4999;
    }

    public StudentAdmission(String name, String course, int age){

        //Validate Name 
        if(name == null || name.trim().isBlank()){
            throw new IllegalArgumentException("Invalid name");
        }

        //Validate course
        if(course == null || course.trim().isBlank()){
            throw new IllegalArgumentException("Invalid course");
        }

        //Validate Age
        if(age<16 || age>60){
            throw new IllegalArgumentException("Invalid age");
        }
        this.name = name.trim();
        this.course = course.trim();
        this.age = age;

        if(age<18){
            this.fee = 2999;
        }
        else{
            this.fee = 4999;
        }
    }

    public boolean assignRollNumber(int num){
        if(num<=0){
            return false;
        }
        else if(rollNumber != 0){
            return false;
        }
        else{
            this.rollNumber = num;
            return true;
        }
    }

    public String summary(){
        return "#" + rollNumber +" "+ name + " | "+ course + " | Age " + age + " | Fee Rs. " + fee;
    }


}