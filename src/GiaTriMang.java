import java.util.Scanner;

public class GiaTriMang {
    public static void main(String[] args) {
        String[] hocsinh = {"A", "B", "C", "D", "E", "G"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Student name:");
        String ten = scanner.nextLine();

        boolean tontai = false;
        for (int i = 0; i < hocsinh.length; i++) {
            if (hocsinh[i].equals(ten)) {
                System.out.println("danh sách sinh viên" + "\t"+ ten +"\t"+ "là" + "\t" + (i + 1));
                tontai = true;
                break;
            }
        }
        if (!tontai) {
            System.out.println("không tìm thấy" + "\t" + ten + "\t" + "trong danh sách");
        }

    }
}
