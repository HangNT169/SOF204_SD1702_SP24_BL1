/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SOF204_SD1702_SP24_BL1.service;

import SOF204_SD1702_SP24_BL1.repository.KhachHangRepository;
import SOF204_SD1702_SP24_BL1.viewmodel.KhachHangViewModel;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class KhachHangService {
    private KhachHangRepository repo = new KhachHangRepository();
    public List<KhachHangViewModel>getAll(){
        return repo.getAll();
    }
}
