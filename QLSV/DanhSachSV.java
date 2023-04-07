package QLSV;

import java.util.ArrayList;
import java.util.List;

public class DanhSachSV {
    private List<SinhVien> danhSachSinhVien;

    public DanhSachSV() {
    this.danhSachSinhVien  = new ArrayList<SinhVien>();
    }

    public void themSinhVien(SinhVien sv) {
        this.danhSachSinhVien.add(sv);
    }

    public void xuatTatCaSinhVien() {
        int stt = 0;
        header();
        for(SinhVien sv : this.danhSachSinhVien) {
            stt++;
            sv.xuatSinhVien(stt);
        }
        footer();
    }
    public void header() {
        System.out.println("--------------------------THÔNG TIN SINH VIÊN--------------------------");
        System.out.print("STT" + "\t|");
        System.out.print("Mã SV" + "\t|");
        System.out.print("Tên SV" + "\t\t\t|");
        System.out.print("Điểm Toán" + "\t|");
        System.out.print("Điểm Hoá" + "\t|");
        System.out.print("Điểm Lý" + "\t|\n");
    }
    public void footer() {
        System.out.print("-----------------------------------------------------------------------\n");
    }
}
