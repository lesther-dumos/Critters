import java.util.*;
import java.awt.*;

public class Lion extends Critter {
   
   private int steps;
   private Color color;
   private Random r = new Random ();
   
   //Constructor for lion
   public Lion() {
      this.steps = 0;
   }
   
   //Lion is radnomly colored and *suppose* to stay for 3 moves
   public Color getColor() {
      double generator = Math.floor(Math.random() * 3);
      generator++;
      if(generator == 1 && this.steps % 9 < 3) {
         return Color.RED;
      } else if (generator == 2 && this.steps % 9 < 6) {
         return Color.GREEN;
      } else {
         return Color.BLUE;
      }
   }
   
   //Lion appears as L
   public String toString() {
      return "L";
   }
   
   //Process of infection
   public Action getMove(CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
         return Action.LEFT;
      } else if (info.getFront() == Neighbor.SAME) {
         return Action.RIGHT;
      } else {
         return Action.HOP;
      }
   }
}