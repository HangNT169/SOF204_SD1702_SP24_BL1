/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_4_Join2Bang.entity;

/**
 *
 * @author ASUS
 */
public class LoaiKhachHang {

    private int ID;
    private String ten;

    public LoaiKhachHang() {
    }

    public LoaiKhachHang(int ID, String ten) {
        this.ID = ID;
        this.ten = ten;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

}
