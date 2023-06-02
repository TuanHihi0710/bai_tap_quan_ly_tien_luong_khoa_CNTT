import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLyTienLuongCuaCBGV quanLyTienLuongCuaCBGV = new QuanLyTienLuongCuaCBGV();
        int nhap = 0;
        do {
            try {
                System.out.println("=======MENU===========");
                System.out.println("Nhập vào một số từ 1 đến 4 để chọn Menu:");
                System.out.println("1: Nhập thông tin CBGV");
                System.out.println("2: Xuat thong tin CBGV");
                System.out.println("3: Tinh tien luong thuc linh cua CBGV");
                Scanner sc = new Scanner(System.in);
                nhap = sc.nextInt();
                if (nhap < 1 || nhap > 4) {
                    System.out.println("Nhap sai gia tri vui long nhap lai");
                } else if (nhap == 1) {
                    System.out.println("Nhap thong tin CBGV");
                    System.out.println("Nhap ho va ten");
                    Scanner scHoVaTen = new Scanner(System.in);
                    String inputHoVaTen = scHoVaTen.nextLine();
                    System.out.println("Nhap nam sinh");
                    Scanner scNamSinh = new Scanner(System.in);
                    int inputNamSinh = scNamSinh.nextInt();
                    System.out.println("Nhap que quan");
                    Scanner scQueQuan = new Scanner(System.in);
                    String inputQueQuan = scQueQuan.nextLine();
                    System.out.println("Nhap luong cung");
                    Scanner scLuongCung = new Scanner(System.in);
                    int inputLuongCung = scLuongCung.nextInt();
                    System.out.println("Nhap thuong");
                    Scanner scThuong = new Scanner(System.in);
                    int inputThuong = scThuong.nextInt();
                    System.out.println("Nhap phat");
                    Scanner scPhat = new Scanner(System.in);
                    int inputPhat = scPhat.nextInt();
                    quanLyTienLuongCuaCBGV.ThemThongTinCanBoGiaoVien(inputHoVaTen, inputNamSinh, inputQueQuan, inputLuongCung, inputThuong, inputPhat);
                } else if (nhap == 2) {
                    System.out.println("Xuat thong tin CBGV");
                    quanLyTienLuongCuaCBGV.XuatThongTinCanBoGiaoVien();
                } else if (nhap == 3) {
                    System.out.println("Tinh so tien luong thuc linh cua CBGV");
                    quanLyTienLuongCuaCBGV.TienLuongThucLinhCuaCanBoGiaoVien();
                }
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Số lượng phần tử đang lớn hơn số phần tử trong mảng");
            } catch (NullPointerException ex) {
                System.out.println("Lỗi tham chiếu null");
            } catch (InputMismatchException ex) {
                System.out.println("Loi sai dau vao");
            } catch (Exception ex) {
                System.out.println("Lỗi ngoại lệ trong");
            }
        } while (nhap != 4);
    }
}