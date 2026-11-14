public class library{
    public static void main(String[] args){
        libraryBook book1 = new libraryBook();
        book1.title = "god of war";
        book1.author = "Aditya";
        book1.availableCopies = 3;
        book1.borrowedCount = 1;

       // book1.addCopies(0);
        book1.returnBook();



    }
}


public class libraryBook{
    String title;
    String author;
    int availableCopies;
    int borrowedCount;

    public void addCopies(int count){
        if(count<=0){
            System.out.println("invalid input");
            return;
        }

        this.availableCopies += count;
        System.out.println("Copies added : "+ count + " | Total available books :" + availableCopies);
    }

    public boolean borrow(){
        if(this.availableCopies <= 0){
            System.out.println("The book is not available");
            return false;
        }
        else{
            this.availableCopies -= 1;
            this.borrowedCount += 1;
            System.out.println("Available Books : " + this.availableCopies + " | Borrowed books : "+ this.borrowedCount);
            return true;

        }
    }

    public boolean returnBook(){
        if(this.borrowedCount <= 0){
            System.out.println("Not borrowed any Book");
            return false;
        }
        else{
            this.availableCopies += 1;
            this.borrowedCount -= 1;
            System.out.println("Available Books : " + this.availableCopies + " | Borrowed books : "+ this.borrowedCount);
            return true;

        }
    }

    public boolean isAvailable(){
        if(availableCopies>0){
            System.out.println("The book is available");
            return true;
        }
        else {
            System.out.println("The book is not available");
            return false;
        }
    }
}