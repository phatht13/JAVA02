import javax.swing.*;
import java.awt.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("bai 1");
        ToaDo toaDo = new ToaDo();
        toaDo.setX(10);
        toaDo.setY(10);
        toaDo.setName("B");
        System.out.println(toaDo);

        ToaDo toaDo1 = new ToaDo(10,20,"A");
        System.out.println(toaDo1);


        System.out.println("bai 2");
        SinhVien sv = new SinhVien(10,"phat",8, 5);
        System.out.println(sv);

        System.out.println("bai 3");
        HinhTamGiac tg = new HinhTamGiac(10, 12, 14);
        System.out.println(tg);


    }
}