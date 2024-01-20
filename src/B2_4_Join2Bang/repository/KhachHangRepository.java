/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_4_Join2Bang.repository;

import B2_4_Join2Bang.entity.KhachHang;
import B2_4_Join2Bang.viewmodel.KhachHangViewModel;
import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

/**
 *
 * @author ASUS
 */
public class KhachHangRepository {

    public List<KhachHangViewModel> getAll() {
        List<KhachHangViewModel> lists = new ArrayList<>();
        String sql = """
                   SELECT   dbo.KhachHang.ten, dbo.KhachHang.maKH, dbo.KhachHang.tuoi, dbo.KhachHang.gioi_tinh, dbo.LoaiKH.ten AS Expr1
                   FROM     dbo.KhachHang INNER JOIN
                            dbo.LoaiKH ON dbo.KhachHang.loaiKH_ID = dbo.LoaiKH.id
                   """;
        try (Connection con = DBConnect.getConnection(); PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                KhachHangViewModel kh = new KhachHangViewModel();
                kh.setMaKH(rs.getString(1));
                kh.setTenKH(rs.getString(2));
                kh.setTuoi(rs.getInt(3));
                kh.setGioiTinh(rs.getBoolean(4));
                kh.setTenLoaiKH(rs.getString(5));
                lists.add(kh);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }

    // Them, Sua, Xoa (GIONG Y NHU JAVA 3)
    public boolean sua(KhachHang kh, int id) {
        // Tu code 
        return true;
    }

    public boolean xoa(int id) {
        // Tu code 
        return true;
    }

    public boolean add(KhachHang kh) {
        // Tu code 
        return true;
    }
}
