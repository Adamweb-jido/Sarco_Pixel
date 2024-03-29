package com.adamweb.sarcopixel;

public class AlbumItem {
    String albumName, date;
    int image1, image2, image3;

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getImage1() {
        return image1;
    }

    public void setImage1(int image1) {
        this.image1 = image1;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public int getImage3() {
        return image3;
    }

    public void setImage3(int image3) {
        this.image3 = image3;
    }

    public AlbumItem(String albumName, String date, int image1, int image2, int image3) {
        this.albumName = albumName;
        this.date = date;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
    }
}
