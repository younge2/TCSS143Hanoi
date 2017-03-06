/**
 * 	Disk class that is placed on rods in the Hanoi game
 * @version 3/3/17
 * @author Ethan Young
 */
import java.util.*;

public class Disk {
   private int size;
   
   /**
    * Creates a disk with size, width
    * @param width
    */
   public Disk(int width){
   this.size = width;
   }
   
   /**
    * returns size of the disk
    * @return size
    */
   public int getSize(){
      return this.size;
   }
   
   /**
    * sets the size of the disk
    * @param width
    */
   public void setSize(int width){
      this.size = width;
   }

}