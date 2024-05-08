import java.util.Scanner;

public class kiemTra7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhập số bất kì");
        int kiemTra=scanner.nextInt();
        switch(kiemTra){
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10:
                System.out.println("Điểm: " + kiemTra);
                break;
            default:
                System.out.println("Lỗi");
                break;
        }


    }
}
