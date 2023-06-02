import java.util.ArrayList;
import java.util.List;

public class QuanLyTienLuongCuaCBGV {
    private List<CBGV> danhSachCGGV;

    public QuanLyTienLuongCuaCBGV() {
        danhSachCGGV = new ArrayList<>();
    }

    public void ThemThongTinCanBoGiaoVien(String inputHoVaTen, int inputNamSinh, String inputQueQuan, int inputLuongCung, int inputThuong, int inputPhat) {
        CBGV cbgv = new CBGV(inputHoVaTen, inputNamSinh, inputQueQuan, inputLuongCung, inputThuong, inputPhat);
        danhSachCGGV.add(cbgv);
    }

    public void XuatThongTinCanBoGiaoVien() {
        for (int i = 0; i < danhSachCGGV.size(); i++) {
            danhSachCGGV.get(i).HienThiThongTinCBGV();
        }
    }

    public void TienLuongThucLinhCuaCanBoGiaoVien() {
        for (int i = 0; i < danhSachCGGV.size(); i++) {
            danhSachCGGV.get(i).setLuongThucLinh(danhSachCGGV.get(i).getLuongCung() + danhSachCGGV.get(i).getThuong() - danhSachCGGV.get(i).getPhat());
            danhSachCGGV.get(i).HienThiLuongThucLinhCBGV();
        }
    }
}
