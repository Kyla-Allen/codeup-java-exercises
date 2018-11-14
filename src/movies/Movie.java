package movies;

public class Movie {

    private String name;
    private String category;

    //constructor
    public Movie (String name, String category){
        this.name = name;
        this.category = category;
    }

    //setters
    public void setName (String name){
        this.name = name;
    }
    public void setCategory (String category){
        this.category = category;
    }

    //getters
    public String getName (){
        return this.name;
    }
    public String getCategory (){
        return this.category;
    }
}
