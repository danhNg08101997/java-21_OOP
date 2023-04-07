package QLSV;

import java.util.Scanner;

public class SinhVien {
    private int maSV;
    private String tenSV;
    private float diemToan;
    private float diemHoa;
    private float diemLy;

    public int getMaSV() {
        return maSV;
    }

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

    public SinhVien() {};

    public SinhVien(int maSV, String tenSV, float diemHoa, float diemLy, float diemToan) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    };

    public void nhapSinhVien() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập vào mã sinh viên: ");
//        this.maSV = Integer.parseInt(scanner.nextLine());
        this.maSV = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập vào tên sinh viên: ");
        this.tenSV = scanner.nextLine();
        System.out.print("Nhập vào điểm toán: ");
        this.diemToan = scanner.nextFloat();
        System.out.print("Nhập vào điểm lý: ");
        this.diemLy = scanner.nextFloat();
        System.out.print("Nhập vào điểm hoá: ");
        this.diemHoa = scanner.nextFloat();
    }

    public void xuatSinhVien(int stt) {
        DanhSachSV dssv = new DanhSachSV();
        dssv.footer();
        System.out.print(stt + " \t|");
        System.out.print(this.maSV + " \t|");
        System.out.print(this.tenSV + "\t\t|");
        System.out.print(this.diemToan + "\t\t|");
        System.out.print(this.diemHoa + "\t\t|");
        System.out.print(this.diemLy + "\t\t|\n");

    }
}
