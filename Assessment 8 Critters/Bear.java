import java.util.*;
import java.awt.*;

public class Bear extends Critter {
   
   private boolean polar;
   private int steps;
   
   //Constructor for bear
   public Bear(boolean bear) {
      boolean polar = true;
      steps = 0;
   }
   
   //Colors the bear White
   public Color getColor() {
      if (polar = true) {
         return Color.WHITE;
      } else {
         return Color.BLACK;
      }
   }
   
   //Bear appears as / and \
   public String toString() {
      steps++;
      
      if (steps % 2 == 0) {
         return "/";
      } else {
         return "\\";
      }
   }
   
   //Method explaisn the porcess of infection
   public Action getMove(CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      } else {
         return Action.LEFT;
      }
   }
}