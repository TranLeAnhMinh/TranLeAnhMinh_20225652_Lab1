package hust.soict.dsai.aims.media;
public class DigitalVideoDisc extends Disc implements Playable{
    public DigitalVideoDisc(int id, String title, String category, float cost , String director, float length){
        super(id, title, category, cost, director, length);
    }

    public DigitalVideoDisc(int id, String title, String category, float cost){
        super(id, title, category, cost);
    }

    public void play(){
        System.out.println("Playing Digital Video Disc: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}