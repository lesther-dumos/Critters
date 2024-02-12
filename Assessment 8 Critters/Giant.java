import java.util.*;
import java.awt.*;

public class Giant extends Critter {
   private int steps;
   
   //Contructor for Giant
   public Giant(){
      this.steps = 0;
   }
   
   //Giant is colored Gray
   public Color getColor() {
      return Color.GRAY;
   }
   
   //Giant changes every 6 steps
   public String toString() {
      this.steps = this.steps;
      steps++;
      if (this.steps % 24 < 6) {
         return "fee";
      } else if (this.steps % 24 < 12) {
         return "fie";
      } else if (this.steps % 24 < 18) {
         return "foe";
      } else {
         return "fum";
      }
   }
   
   //Process of infection
   public Action getMove(CritterInfo info) {
      if (info.getFront() == Neighbor.OTHER) {
         return Action.INFECT;
      } else if (info.getFront() == Neighbor.EMPTY) {
         return Action.HOP;
      } else {
         return Action.RIGHT;
      }
   }
}