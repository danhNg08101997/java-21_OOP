package QLSV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DanhSachSV dssv = new DanhSachSV();
        danhSachChon();
        xuLyLuaChon(dssv);
    }
    public static void danhSachChon() {
        System.out.println("\n----------Vui lòng chọn tính năng----------");
        System.out.println("1. Nhập vào sinh viên");
        System.out.println("2. Xuất sinh viên");
        System.out.println("3. Sinh viên có điểm trung bình cao nhất");
        System.out.println("4. In ra tất cả sinh viên yếu");
        System.out.println("5. Tìm sinh viên theo tên");
        System.out.println("6. Tìm sinh viên theo mã");
        System.out.println("7. Xoá một sinh viên");
        System.out.println("0. Thoát chương trình.");
    }
    public static void xuLyLuaChon(DanhSachSV dssv) {
        Scanner scanner = new Scanner(System.in);
        int soChon;
        //nhập lựa chọn
        do {
            System.out.print("\nNhập vào sự lựa chọn (từ 0 -> 10): ");
            soChon = scanner.nextInt();
            if (soChon < 0 || soChon > 10) {
                System.out.println("Vui lòng nhập các số từ 0 đến 10");
            } else {
                switch (soChon) {
                    // Nhập vào sinh viên
                    case 1:
                        SinhVien sv = new SinhVien();
                        sv.nhapSinhVien();
                        dssv.themSinhVien(sv);
                        sv.tinhDiemTB();
                        sv.xepLoaiSV();
                        break;
                    // Xuất sinh viên
                    case 2:
                        dssv.xuatTatCaSinhVien();
                        break;
                    // Sinh viên có điểm trung bình cao nhất
                    case 3:
                        dssv.svDiemTBCaoNhat().xuatSinhVien(1);
                        break;
                    // In ra tất cả sinh viên yếu
                    case 4:
                        dssv.tatCaSinhVienYeu();
                        break;
                    // Tìm sinh viên theo tên
                    case 5:
                        break;
                    // Tìm sinh viên theo mã
                    case 6:
                        break;
                    // Xoá một sinh viên
                    case 7:
                        break;
                    default: System.exit(0);
                }
            }
        } while (true);

    }
}
