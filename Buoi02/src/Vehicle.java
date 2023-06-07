import java.util.Scanner;

public class Vehicle {
    private String chuXe;
    private String loaiXe;
    private float giaTriXe;

    private int dungTichXilanh;

    private float thue;

    public Vehicle(){}
    public Vehicle(String chuXe, String loaiXe, float giaTriXe, int dungTichXilanh) {
        this.chuXe = chuXe;
        this.loaiXe = loaiXe;
        this.giaTriXe = giaTriXe;
        this.dungTichXilanh = dungTichXilanh;
    }
    Scanner scan = new Scanner(System.in);
    public void setChuXe() {
        System.out.println("nhap chu xe: ");
        this.chuXe = scan.nextLine();
    }

    public void setLoaiXe() {
        System.out.println("nhap loai xe: ");
        this.loaiXe = scan.nextLine();
    }

    public void setGiaTriXe() {
        System.out.println("nhap gia tri xe: ");
        this.giaTriXe = scan.nextFloat();
        if(giaTriXe>=0){
            this.giaTriXe = giaTriXe;
        }
        else {
            this.giaTriXe = 0;
        }
    }

    public void setDungTichXilanh() {
        System.out.println("nhap dung tich xe: ");
        this.dungTichXilanh = scan.nextInt();
        if(dungTichXilanh>=0) {
            this.dungTichXilanh = dungTichXilanh;
        }
        else{
            this.dungTichXilanh = 0;
        }
    }

    public String getChuXe() {
        return chuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public float getGiaTriXe() {
        return giaTriXe;
    }

    public int getDungTichXilanh() {
        return dungTichXilanh;
    }

    public float getThue(int dungTichXilanh, float giaTriXe) {
        if (dungTichXilanh<100){
            return thue = giaTriXe/100;
        }
        else if (dungTichXilanh<=200) {
            return thue=giaTriXe*3/100;
        }
        else
            return thue=giaTriXe*5/100;
    }

    public String toString() {
        return this.chuXe + "\t" + this.loaiXe + "\t" + this.giaTriXe + "\t" + this.dungTichXilanh + "cc " + "Thue: " + getThue(this.dungTichXilanh,this.giaTriXe)+"đ";
    }
}
