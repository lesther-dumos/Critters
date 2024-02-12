import java.util.*;
import java.awt.*;

public class Husky extends Critter {
   private int steps;
   
   //Constructor for husky
   public Husky() {
     this.steps = 0;
   }

   //Husky is magenta color
   public Color getColor() {
      return Color.MAGENTA;
   }
   
   //Husky appears as Harry
   public String toString() {
      return "Harry";
   }
   
   //Process of infection
   public Action getMove(CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      } else if (info.getFront() == Neighbor.SAME) {
         return Action.LEFT;
      }else {
         return Action.RIGHT;
      }
   }
}