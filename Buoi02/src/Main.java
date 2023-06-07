import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int chonBai;
        Scanner scan = new Scanner(System.in);
        System.out.println("chon bai: ");
        chonBai = scan.nextInt();

        switch (chonBai) {
            case 4:
                Vehicle xe1 = new Vehicle("Nguyen Van A", "Yamaha", 10, 80);
                System.out.println(xe1.toString());

                Vehicle xe2 = new Vehicle();
                xe2.setChuXe();
                xe2.setLoaiXe();
                xe2.setGiaTriXe();
                xe2.setDungTichXilanh();
                System.out.println(xe2.toString());
                break;
            case 5:
                HangThucPham hangThucPham1 = new HangThucPham("ABC", "banh mi", 5000, LocalDate.of(1995,3,13) , LocalDate.of(1995,03,14));
                break;
            case 6:
                Account acc1 = new Account(72354, "Ted Murphy", 102560);
                Account acc2 = new Account(69713,"Jane Smith", 40000);
                Account acc3 = new Account(93757,"Edward Demsey", 759320);

                System.out.println(acc1);
                System.out.println(acc2);
                System.out.println("Tiên lãi acc3: ");
                acc3.addInterest();
                System.out.println("--Tài khoản trước khi chuyển tiền--");

                acc1.deposit(25850);
                acc2.deposit(500000);
                acc2.withdraw(430750,1500);


                System.out.println(acc1);
                System.out.println(acc2);
                System.out.println(acc3);
                System.out.println("--Sau khi chuyển (100.000) từ acc 2 sang acc 1 --");
                acc2.transfer(acc1, 100000);
                System.out.println(acc1);
                System.out.println(acc2);
                break;
            case 7:
                ToaDo toaDo = new ToaDo("O",5,5);
                HinhTron hinhTron = new HinhTron(toaDo,10.5);
                System.out.println(hinhTron);
                break;
            case 8:

                CD cd1 = new CD(12345,"nhac tre",10,102000);
                CD cd2 = new CD(12346,"nhac tru trinh",20,202000);
//        CD[] list = {};
                CDList cdl = new CDList(2);
                cdl.setN(2);
                cdl.setCdList(list);*//*
                cdl.addCD(cd2);
                System.out.println(cdl.getCdList()[0].getMaCD());
                break;
        }
    }
}