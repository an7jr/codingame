import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position        
        
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            
            if(lightX < initialTx && lightY < initialTy){
                System.out.println("NW");
                initialTx --;
                initialTy --;
            } 
            else if(lightX == initialTx && lightY < initialTy){
                System.out.println("N");                
                initialTy --; 
            }
            else if(lightX > initialTx && lightY < initialTy){
                System.out.println("NE");                
                initialTx ++;
                initialTy --;
            }
            else if(lightX > initialTx && lightY == initialTy){
                System.out.println("E");                
                initialTx ++;                
            }            
            else if(lightX > initialTx && lightY > initialTy){
                System.out.println("SE");                
                initialTx ++;
                initialTy ++;
            }
            else if(lightX == initialTx && lightY > initialTy){
                System.out.println("S"); 
                initialTy ++;
            }
            else if(lightX < initialTx && lightY > initialTy){
                System.out.println("SW"); 
                initialTx --;
                initialTy ++;
            }
            else if(lightX < initialTx && lightY == initialTy){
                System.out.println("W"); 
                initialTx --;                
            }
            
        }
    }