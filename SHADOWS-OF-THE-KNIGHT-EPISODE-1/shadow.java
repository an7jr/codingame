import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // width of the building.
        int H = in.nextInt(); // height of the building.
        int N = in.nextInt(); // maximum number of turns before game over.
        
        //start position
        int X0 = in.nextInt();
        int Y0 = in.nextInt();       

        int menorX = 0;
        int menorY = 0;
        int maiorX = W - 1;
        int maiorY = H - 1;

        // game loop
        while (true) {
            String bombDir = in.next(); // the direction of the bombs from batman's current location (U, UR, R, DR, D, DL, L or UL)

            if(bombDir.equalsIgnoreCase("U")){

               
                maiorY = Y0 - 1;                
                Y0 = (maiorY + menorY)/2;

                System.out.println(X0 + " " + Y0);

            }
            else if(bombDir.equalsIgnoreCase("UR")){

                menorX = X0 + 1;
                maiorY = Y0 - 1;

                X0 = (menorX + maiorX)/2;
                Y0 = (maiorY + menorY)/2;

                System.out.println(X0 + " " + Y0);
            }
            else if(bombDir.equalsIgnoreCase("R")){

                menorX = X0 + 1;         
                X0 = (menorX + maiorX)/2;               

                System.out.println(X0 + " " + Y0);

            }
            else if(bombDir.equalsIgnoreCase("DR")){

                menorX = X0 + 1;
                menorY = Y0 + 1;

                X0 = (menorX + maiorX)/2;
                Y0 = (maiorY + menorY)/2;

                System.out.println(X0 + " " + Y0);

            }
            else if(bombDir.equalsIgnoreCase("D")){
               
                menorY = Y0 + 1;                
                Y0 = (menorY + maiorY)/2;

                System.out.println(X0 + " " + Y0);

            }
            else if(bombDir.equalsIgnoreCase("DL")){

                maiorX = X0 - 1;
                menorY = Y0 + 1;

                X0 = (maiorX + menorX)/2;
                Y0 = (menorY + maiorY)/2;

                System.out.println(X0 + " " + Y0);

            }
            else if(bombDir.equalsIgnoreCase("L")){

                maiorX = X0 - 1;         
                X0 = (menorX + maiorX)/2;               

                System.out.println(X0 + " " + Y0);  

            }
            else if(bombDir.equalsIgnoreCase("UL")){

                maiorX = X0 - 1;
                maiorY = Y0 - 1;

                X0 = (menorX + maiorX)/2;
                Y0 = (maiorY + menorY)/2;

                System.out.println(X0 + " " + Y0);

            }
            

            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // the location of the next window Batman should jump to.
            
        }
    }
}