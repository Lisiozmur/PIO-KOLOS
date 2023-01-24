package kolokwi;

import java.util.ArrayList;

public class Playlist {
        private ArrayList<Piece> pieces = new ArrayList<>();
        private int lengthtime;
        public void addPiece(Piece piece){
            pieces.add(piece);
        }
        
        public void list(){
            if(pieces!=null){
                          
                for(Piece p: pieces){
                    lengthtime+=p.lenghtTime();
                    System.out.println(p);
                }
            }
            System.out.println("Czas ogolny:"+lengthtime);
        }
       
}
