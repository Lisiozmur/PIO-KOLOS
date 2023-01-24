package kolokwi;

public class Kolokwi {

    public static void main(String[] args) {
      System.out.println("Spotyfiu");
      
      Playlist playlist = new Playlist();
      
      Piece piece1 = new Piece("Marie","Zero kaloryczne ciasteczka",1);
      Piece piece2 = new Piece("Marie","Anon69",1);
      Piece piece3 = new Piece("Marie","Haribo",1);
      
      playlist.addPiece(piece1);
      playlist.addPiece(piece2);
      playlist.addPiece(piece3);
      
      playlist.list();
     
    }
    
}
