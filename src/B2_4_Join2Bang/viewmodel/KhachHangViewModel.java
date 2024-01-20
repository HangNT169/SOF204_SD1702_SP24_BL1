/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_4_Join2Bang.viewmodel;

/**
 *
 * @author ASUS
 */
    //chứa các class
    //thuộc tính của class là dữ liệu trả ra trên table
public class KhachHangViewModel {
    //maKH,tenKH,tuoi,gtinh,tenloaiKH
    private String maKH;
    private String tenKH;
    private int tuoi;
    private boolean gioiTinh;
    private String tenLoaiKH;

    public KhachHangViewModel() {
    }

    public KhachHangViewModel(String maKH, String tenKH, int tuoi, boolean gioiTinh, String tenLoaiKH) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.tenLoaiKH = tenLoaiKH;
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

    public String getTenLoaiKH() {
        return tenLoaiKH;
    }

    public void setTenLoaiKH(String tenLoaiKH) {
        this.tenLoaiKH = tenLoaiKH;
    }
    
    
    
}
