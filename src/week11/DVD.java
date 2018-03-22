/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author venkatsa
 */
public class DVD extends Media{

    public DVD(String artist, String title, double price, int numAudioTracks, int numVideoTracks) {
        super(artist,title,price);
        this.numAudioTracks = numAudioTracks;
        this.numVideoTracks = numVideoTracks;
    }
    
    private int numAudioTracks;
    private int numVideoTracks;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumAudioTracks() {
        return numAudioTracks;
    }

    public void setNumAudioTracks(int numAudioTracks) {
        this.numAudioTracks = numAudioTracks;
    }

    public int getNumVideoTracks() {
        return numVideoTracks;
    }

    public void setNumVideoTracks(int numVideoTracks) {
        this.numVideoTracks = numVideoTracks;
    }
}
