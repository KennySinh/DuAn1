package service;
import repositories.NhanVienDAO;
import viewmodel.NhanVienView;
import java.util.List;
/**
 *
 * @author s2ngo
 */
public class NhanVienService {
    NhanVienDAO nvDao = new NhanVienDAO();
    public String themNhanVien(NhanVienView nv){
        model.NhanVienEntity nv1 = new model.NhanVienEntity(nv.getMaNV(), nv.getTenNV(), 
                nv.getSDT(), nv.getChucVu(), nv.getEmail(), nv.getMatKhau(), nv.getDiaChi(), nv.isTrangThai());
        return nvDao.themNhanVien(nv1);
    }
    
}
