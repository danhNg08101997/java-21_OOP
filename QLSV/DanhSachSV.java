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

    public SinhVien svDiemTBCaoNhat() {
        SinhVien kq = this.danhSachSinhVien.get(0);
        header();
        for(SinhVien sv : this.danhSachSinhVien) {
            if (sv.getDiemTB() > kq.getDiemTB()) {
                kq = sv;
            }
        }
        return kq;
    }

    public void tatCaSinhVienYeu() {
        int stt = 0;
        header();
        for (SinhVien sv : this.danhSachSinhVien) {
            if (sv.getDiemTB() < 5) {
                stt++;
                sv.xuatSinhVien(stt);
            }
        }
        if (stt == 0) {
            System.out.println("\t\t\t Không có sinh viên loại D");
        }
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
        System.out.println("---------------------------------THÔNG TIN SINH VIÊN-------------------------------------");
        System.out.print("STT" + "\t|");
        System.out.print("Mã sinh viên" + "\t|");
        System.out.print("Tên sinh viên" + "\t\t|");
        System.out.print("Điểm Toán" + "\t|");
        System.out.print("Điểm Hoá" + "\t|");
        System.out.print("Điểm Lý" + "\t|");
        System.out.print("Điểm trung bình" + "\t|");
        System.out.print("Xếp loại" + "\t|");
        footer();
    }
    public void footer() {
        System.out.println("\n---------------------------------------------------------------------------------------");
    }
}
