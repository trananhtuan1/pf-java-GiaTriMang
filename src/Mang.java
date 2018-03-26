import java.util.Scanner;

public class Mang {
    public static void main(String[] args) {
//        Ứng dụng có sẵn một danh sách tên của sinh viên, cho phép người dùng nhập vào một tên sinh viên, sau đó hiển
//        thị vị trí của sinh viên đó trong danh sách (nếu tìm thấy)hoặc là thông báo không tìm thấy.

        String[] list = {"tuan", "hoa", "the", "hieu"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name :");
        String ten = scanner.nextLine();

        boolean a = false;
        for (int i = 0; i < list.length; i++) {
            if (list[i].equals(ten)) {
                System.out.println("location" + "\t" + ten + "\t" + "la" + "\t" + (i + 1));
                a = true;
                break;
            }
        }
        if (!a)
            System.out.println("error!");
    }
}

