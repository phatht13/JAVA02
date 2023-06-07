import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class HangThucPham {
    private String maHang;
    private String tenHang = "xxx";
    private double donGia;
    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;

    public void setMaHang(String maHang) throws Exception {
        if(!maHang.trim().equals("")){
            this.maHang=maHang;
        }
        else
            throw new Exception("lỗi: Mã Hàng rỗng!");
    }

    public void setTenHang(String tenHang) {
        if(!tenHang.trim().equals("")){
            this.tenHang = tenHang;
        }
        else
            this.tenHang = tenHang;
    }

    public void setDonGia(double donGia) {
        if (donGia >=0 )
            this.donGia = donGia;
    }

    public void setNgaySanXuat(LocalDate ngaySanXuat) {
        LocalDate now = LocalDate.now();
        if (ngaySanXuat.isBefore(now))
            this.ngaySanXuat = ngaySanXuat;
        else
            this.ngaySanXuat = now;
    }
    public void setNgayHetHan(LocalDate ngayHetHan) {

        if (ngayHetHan.isAfter(ngaySanXuat))
            this.ngayHetHan = ngayHetHan;
        else
            this.ngayHetHan = this.ngaySanXuat;
    }

    public String getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return "HangThucPham{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", donGia=" + donGia +
                ", ngaySanXuat=" + ngaySanXuat +
                ", ngayHetHan=" + ngayHetHan +


                '}';
    }
}
