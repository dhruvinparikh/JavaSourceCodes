/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week11;

/**
 *
 * @author imsil
 */
public class Media{
    protected String artist;
    protected String title;
    protected double price; 

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Media(String artist, String title, double price) {
        this.artist = artist;
        this.title = title;
        this.price = price;
    }
}
