public class CBGV extends Nguoi{
    private int luongCung;
    private int thuong;
    private int phat;
    private int luongThucLinh;
    public CBGV(){}
    public CBGV(String inputHoVaTen, int inputNamSinh, String inputQueQuan, int inputLuongCung, int inputThuong, int inputPhat){
        super(inputHoVaTen,inputNamSinh,inputQueQuan);
        luongCung=inputLuongCung;
        thuong=inputThuong;
        phat=inputPhat;
    }

    public int getLuongCung() {
        return luongCung;
    }

    public int getThuong() {
        return thuong;
    }

    public int getPhat() {
        return phat;
    }

    public int getLuongThucLinh() {
        return luongThucLinh;
    }
    public void setLuongCung(int inputLuongCung){
        luongCung=inputLuongCung;
    }
    public void setThuong(int inputThuong){
        thuong=inputThuong;
    }
    public void setPhat(int inputPhat){
        phat=inputPhat;
    }
    public void setLuongThucLinh(int inputLuongThucLinh){
        luongThucLinh=inputLuongThucLinh;
    }
    public void HienThiLuongThucLinhCBGV(){
        System.out.println("Ho va ten: "+getHoVaTen());
        System.out.println("Nam sinh: "+getNamSinh());
        System.out.println("Que quan: "+getQueQuan());
        System.out.println("Luong cung: "+getLuongCung());
        System.out.println("Thuong: "+getThuong());
        System.out.println("Phat: "+getPhat());
        System.out.println("Luong thuc linh: "+getLuongThucLinh());
    }
    public void HienThiThongTinCBGV(){
        System.out.println("Ho va ten: "+getHoVaTen());
        System.out.println("Nam sinh: "+getNamSinh());
        System.out.println("Que quan: "+getQueQuan());
        System.out.println("Luong cung: "+getLuongCung());
        System.out.println("Thuong: "+getThuong());
        System.out.println("Phat: "+getPhat());
    }
}
