public class HinhTamGiac {
    private float ma;
    private float mb;
    private float mc;

    public HinhTamGiac(){}

    public HinhTamGiac(float ma, float mb, float mc) {
        if (ma > 0 && mb >0 && mc >0)
            if (ma<mb+mc && mb<ma+mc && mc<ma+mb) {
                this.ma = ma;
                this.mb = mb;
                this.mc = mc;
            }
        else
            System.out.println("day k phai hinh tam giac");
    }

    public void setMa(float ma) {
        this.ma = ma;
    }

    public void setMb(float mb) {
        this.mb = mb;
    }

    public void setMc(float mc) {
        this.mc = mc;
    }

    public float getMa() {
        return ma;
    }

    public float getMb() {
        return mb;
    }

    public float getMc() {
        return mc;
    }

    public float tinhChuVi(){
        return this.ma + this.mb + this.mc;
    }



    public double tinhDienTich(){
        float p=(this.ma+this.mb+this.mc)/2;
        return Math.sqrt(p);
    }

    public String toString() {
        return "canh a:" + ma+ "\n"
                +"canh b:" + getMb()+ "\n"
                +"canh c:" + mc+ "\n"
                +"chu vi: " + tinhChuVi() + "\n"
                +"dien tich: "+ tinhDienTich()+"\n";
    }
}
