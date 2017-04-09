package JavaCollections;

/**
 * Created by Pawl on 4/5/2017.
 */
public class City {

    private String name;

    public City(){}

    public City (String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    @Override
   public String toString(){
        return "City["+"name= "+name+" ]";
    }
}
