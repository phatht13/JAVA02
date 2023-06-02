public class SinhVien {
    private int mssv;
    private String hoTen;
    private float diemLT;
    private float diemHT;

//    private float TB;

    public SinhVien(int mssv, String hoTen, float diemLT, float diemHT) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.diemLT = diemLT;
        this.diemHT = diemHT;
    }
    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiemLT(float diemLT) {
        this.diemLT = diemLT;
    }

    public void setDiemHT(float diemHT) {
        this.diemHT = diemHT;
    }

    public int getMssv() {
        return mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public float getDiemLT() {
        return diemLT;
    }

    public float getDiemHT() {
        return diemHT;
    }

    public float TB(){
        return (diemHT+diemLT)/2;
    }

    public String toString() {
//        return "Ten Sinh Vien:" +
//                "mssv=" + mssv +
//                ", hoTen='" + hoTen + '\'' +
//                ", diemLT=" + diemLT +
//                ", diemHT=" + diemHT +
//                ", TB=" + TB +
//                '}';
        return "Ten sinh vien: " + getHoTen() + "\n"
                +"MSSV: "+ getMssv() + "\n"
                +"diemLT: " + getDiemLT() + ", diemTH: "+ getDiemHT()
                +", diem TB: " + TB() +"\n";
    }
}
