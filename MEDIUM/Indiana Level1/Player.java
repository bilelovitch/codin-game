import java.util.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // number of columns.
        int H = in.nextInt(); // number of rows.
        System.err.println("NB colonne : "+W + " NB lignes : "+H);
        in.nextLine();
        String[][] matrice = new String[H][W];
        
        for (int i = 0; i < H; i++) {
            String LINE = in.nextLine(); // represents a line in the grid and contains W integers. Each integer represents one room of a given type.
            matrice[i] = LINE.split(" ");    
            System.err.println(i+" LINE " + LINE);
        }
        
        int EX = in.nextInt(); // the coordinate along the X axis of the exit (not useful for this first mission, but must be read).
        System.err.println("EXit EX :"+EX);        
        in.nextLine();

        // game loop
        while (true) {
            int XI = in.nextInt();
            int YI = in.nextInt();
            String POS = in.next();
            in.nextLine();
            System.err.println("XI : "+XI +" YI : "+YI+" POS : " +POS);
            
            getSortie(Integer.valueOf(matrice[YI][XI]),XI,YI,POS);
        }
        
        
        
    }

    static void getSortie(int typePiece,int posX,int posY,String entree){
       Integer out[] = new Integer[2];
       switch(typePiece){
            case 0 :
                out[0] = null;
                out[1] = null;
                //pblm Indy ne peut pas la traverser.
               break;
            case 1 :
            case 3 :
            case 7 :
            case 8 :
            case 9 :
            case 12 :
            case 13 :
                out[0] = posX;
                out[1] = posY+1;
               break;
            case 2 :
            case 6:
                if("LEFT".equals(entree)){
                    out[0] = posX+1;
                    out[1] = posY;
                } else if("RIGHT".equals(entree)){
                    out[0] = posX-1;
                    out[1] = posY;
                }
                //top
                //pblm Indy ne peut pas la traverser.
               break;
            case 4 :
                if("TOP".equals(entree)){
                    out[0] = posX-1;
                    out[1] = posY;
                    //pblm Indy ne peut pas la traverser.
                } else if("RIGHT".equals(entree)){
                    out[0] = posX;
                    out[1] = posY+1;
                }
               break;   
            case 5 :
                if("TOP".equals(entree)){
                    out[0] = posX+1;
                    out[1] = posY;
                    //pblm Indy ne peut pas la traverser.
                } else if("LEFT".equals(entree)){
                    out[0] = posX;
                    out[1] = posY+1;
                }
               break; 
            case 10 :
                out[0] = posX-1;
                out[1] = posY;
                //pblm Indy ne peut pas la traverser.
               break;
            case 11 :
                out[0] = posX+1;
                out[1] = posY;
                //pblm Indy ne peut pas la traverser.
               break;
       }
       
       System.out.println(out[0] + " "+out[1]);
    }
    
}
