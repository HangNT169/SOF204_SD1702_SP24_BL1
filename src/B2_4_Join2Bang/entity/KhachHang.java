/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_4_Join2Bang.entity;

/**
 *
 * @author ASUS
 */
public class KhachHang {

    private String maKH;
    private String tenKH;
    private int tuoi;
    private boolean gioiTinh;
    private int loaiKHID;

    public KhachHang() {
    }

    public KhachHang(String maKH, String tenKH, int tuoi, boolean gioiTinh, int loaiKHID) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.loaiKHID = loaiKHID;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getLoaiKHID() {
        return loaiKHID;
    }

    public void setLoaiKHID(int loaiKHID) {
        this.loaiKHID = loaiKHID;
    }

}
