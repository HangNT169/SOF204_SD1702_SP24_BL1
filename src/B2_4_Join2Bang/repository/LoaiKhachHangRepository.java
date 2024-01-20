/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_4_Join2Bang.repository;

import B2_4_Join2Bang.entity.LoaiKhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class LoaiKhachHangRepository {

    // Get all du lieu trong loai khach hang 
    public List<LoaiKhachHang> getAll() {
        // Tự viết coi như đã có dữ liệu
        // Giống J3
        List<LoaiKhachHang> lists = new ArrayList<>();
        String sql = """
                    SELECT
                    id, ten
                    FROM LoaiKH
                    """;
        try (Connection con = DBConnect.getConnection();
                PreparedStatement pr = con.prepareCall(sql)) {
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                LoaiKhachHang lkh = new LoaiKhachHang();
                lkh.setID(rs.getInt(1));
                lkh.setTen(rs.getString(2));
                lists.add(lkh);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lists;
    }
}
