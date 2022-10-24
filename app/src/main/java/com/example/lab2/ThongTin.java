package com.example.lab2;

public class ThongTin {
    private String Ten;
    private String Giamoi;
    private String Giacu;
    private int Hinh;
    private int Rating;
    private int icon;

    public ThongTin(String ten, String giamoi, String giacu, int hinh, int rating, int icon) {
        Ten = ten;
        Giamoi = giamoi;
        Giacu = giacu;
        Hinh = hinh;
        Rating = rating;
        this.icon = icon;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGiamoi() {
        return Giamoi;
    }

    public void setGiamoi(String giamoi) {
        Giamoi = giamoi;
    }

    public String getGiacu() {
        return Giacu;
    }

    public void setGiacu(String giacu) {
        Giacu = giacu;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public int getRating() {
        return Rating;
    }

    public void setRating(int rating) {
        Rating = rating;
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
