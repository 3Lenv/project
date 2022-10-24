package com.example.lab2;

public class ComTrua {

    private String Ten;

    private String SanPham;
    private String GiamGia;
    private int Hinh;
    private int icon1;
    private int icon2;
    private int icon3;

    public ComTrua(String ten, String giamGia, String sanPham, int hinh, int icon1, int icon2, int icon3) {
        Ten = ten;
        SanPham = sanPham;
        GiamGia = giamGia;
        Hinh = hinh;
        this.icon1 = icon1;
        this.icon2 = icon2;
        this.icon3 = icon3;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }

    public int getIcon1() {
        return icon1;
    }

    public void setIcon1(int icon1) {
        this.icon1 = icon1;
    }

    public int getIcon2() {
        return icon2;
    }

    public void setIcon2(int icon2) {
        this.icon2 = icon2;
    }

    public int getIcon3() {
        return icon3;
    }

    public void setIcon3(int icon3) {
        this.icon3 = icon3;
    }

    public ComTrua(String giamGia, String sanPham) {
        GiamGia = giamGia;
        SanPham = sanPham;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getGiamGia() {
        return GiamGia;
    }

    public void setGiamGia(String giamGia) {
        GiamGia = giamGia;
    }

    public String getSanPham() {
        return SanPham;
    }

    public void setSanPham(String sanPham) {
        SanPham = sanPham;
    }
}
