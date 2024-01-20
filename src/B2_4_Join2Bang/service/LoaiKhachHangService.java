/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_4_Join2Bang.service;

import B2_4_Join2Bang.entity.LoaiKhachHang;
import B2_4_Join2Bang.repository.LoaiKhachHangRepository;
import java.util.List;

/**
 *
 * @author hangnt
 */
public class LoaiKhachHangService {

    private LoaiKhachHangRepository repository = new LoaiKhachHangRepository();

    public List<LoaiKhachHang> getAll() {
        return repository.getAll();
    }
}
