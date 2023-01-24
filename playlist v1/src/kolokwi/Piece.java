package kolokwi;

public class Piece {
    
   public Piece() {}
    private String artist;
    private String title;
    private int length;
   
    public Piece(String artist, String title, int length){
        this.artist = artist;
        this.title = title;
        this.length=length;
    }
    
    public int lenghtTime() {
        return length;
    }
    
    
    @Override 
    public String toString(){
        return this.artist+" "+this.title+" "+this.length;
    }
}

