package QLSV;

import java.util.Scanner;

public class SinhVien {
    private int maSV;
    private String tenSV;
    private float diemToan;
    private float diemHoa;
    private float diemLy;

    private float diemTB = 0;

    private String xepLoai = "Chưa xếp loại";

    public int getMaSV() { return maSV; }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public float getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }

    public float getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    public float getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }

    public float getDiemTB() { return diemTB; }

    public void setDiemTB(float diemTB) { this.diemTB = diemTB; }

    public String getXepLoai() {
        return xepLoai;
    }

    public void setXepLoai(String xepLoai) {
        this.xepLoai = xepLoai;
    }

    public SinhVien() {};

    public SinhVien(int maSV, String tenSV, float diemHoa, float diemLy, float diemToan, float diemTB, String xepLoai) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
        this.diemTB = diemTB;
        this.xepLoai = xepLoai;
    };

    public void nhapSinhVien() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào mã sinh viên: ");
        this.maSV = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào tên sinh viên: ");
        this.tenSV = scanner.nextLine();
        this.diemToan = kiemtraHopLeDiem("toán");
        this.diemLy = kiemtraHopLeDiem("lý");
        this.diemHoa = kiemtraHopLeDiem("hoá");
    }

    public void tinhDiemTB() {
        this.diemTB = (this.diemToan + this.diemHoa + this.diemLy)/3;
    }

    public void xepLoaiSV() {
        if (this.diemTB <= 10 && this.diemTB >= 9) {
           this.xepLoai = "Loại A+";
        } else if (this.diemTB < 9 && this.diemTB >= 8) {
            this.xepLoai = "Loại A";
        } else if (this.diemTB < 8 && this.diemTB >= 7) {
            this.xepLoai = "Loại B";
        } else if (this.diemTB < 7 && this.diemTB >= 5) {
            this.xepLoai = "Loại C";
        } else {
            this.xepLoai = "Loại D";
        }
    }

    public float kiemtraHopLeDiem(String monHoc) {
        Scanner scanner = new Scanner(System.in);
        float diem;
        do{
            System.out.print("Nhập điểm " + monHoc + " từ 0 - 10: ");
            diem = Integer.parseInt(scanner.nextLine());
        }while (diem > 10 || diem < 0);
        return diem;
    }

    public void xuatSinhVien(int stt) {
        DanhSachSV dssv = new DanhSachSV();
        System.out.print(stt + " \t|");
        System.out.print(this.maSV + " \t\t\t|");
        System.out.print(this.tenSV + "\t\t|");
        System.out.print(this.diemToan + "\t\t|");
        System.out.print(this.diemHoa + "\t\t|");
        System.out.print(this.diemLy + "\t\t|");
        System.out.print(this.diemTB + "\t\t\t|");
        System.out.print(this.xepLoai + "\t\t\t|");
        dssv.footer();
    }
}
