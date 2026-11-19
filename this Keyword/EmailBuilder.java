import java.util.ArrayList;
import java.util.List;

public class EmailBuilder{
    private String to;
    private String subject;
    private  String body;
    private final List<String> ccList = new ArrayList<>();

    public EmailBuilder to(String to){

        if(to == null || !to.contains("@")){
            throw new IllegalArgumentException("Invalid email address");
        }
        this.to = to;
        return this;
    }


}
//this exersize requires the ArrayList consepts which we will learn further