/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_4_Join2Bang.service;

import B2_4_Join2Bang.entity.KhachHang;
import B2_4_Join2Bang.repository.KhachHangRepository;
import B2_4_Join2Bang.viewmodel.KhachHangViewModel;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class KhachHangService {

    private KhachHangRepository repo = new KhachHangRepository();

    public List<KhachHangViewModel> getAll() {
        return repo.getAll();
    }

    public boolean add(KhachHang kh) {
        return repo.add(kh);
    }

    public boolean sua(KhachHang kh, int id) {
        return repo.sua(kh, id);
    }

    public boolean xoa(int id) {
        return repo.xoa(id);
    }
}
