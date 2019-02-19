package Stalls;

import Interfaces.ISecurity;
import Visitors.Visitor;

public  class Tobacco extends Stall implements ISecurity {


    public Tobacco(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() >= 18) {
            return true;
        }
        return false;
    }

}
