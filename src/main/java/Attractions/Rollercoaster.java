package Attractions;
import Interfaces.ISecurity;
import Visitors.Visitor;


public class Rollercoaster extends Attraction implements ISecurity {

    public Rollercoaster(String name) {
        super(name);
    }


    @Override
    public boolean isAllowedTo(Visitor visitor){
        if((visitor.getAge() >= 12) && (visitor.getHeight() >= 145)){
            return true;
        } else{
           return false;
        }
    }


}
