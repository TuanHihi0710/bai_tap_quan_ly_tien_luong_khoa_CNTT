public class Nguoi {
    private String hoVaTen;
    private int namSinh;
    private String queQuan;
    public Nguoi(){}
    public Nguoi(String inputHoVaTen, int inputNamSinh, String inputQueQuan){
        hoVaTen=inputHoVaTen;
        namSinh=inputNamSinh;
        queQuan=inputQueQuan;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String getQueQuan() {
        return queQuan;
    }
    public void setHoVaTen(String inputHoVaTen){
        hoVaTen=inputHoVaTen;
    }
    public void setNamSinh(int inputNamSinh){
        namSinh=inputNamSinh;
    }
    public void setQueQuan(String inputQueQuan){
        queQuan=inputQueQuan;
    }
}
