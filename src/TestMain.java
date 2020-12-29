import java.util.Scanner;

public class TestMain {
    static Scanner sc = new Scanner(System.in);
    static ManageHotel manageHotel = new ManageHotel();


    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. add hotel");
            System.out.println("2. hiện thị tất cả khách hàng");
            System.out.println("3. tính tiền khách trả phòng");
            System.out.println("0. thoát trương trình");
            choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("nhập số lượng khách hàng");
                    int number = sc.nextInt();
                    for (int i = 0; i < number; i++) {
                        addHotel();
                    }
                    break;
                case 2:
                    manageHotel.disPlayAll();
                    break;
                case 3:
                    totalMoney();
                    break;
                case 0:
                    System.err.println("bạn đã thoát trương trình");
                    System.exit(0);
                    break;
            }
        } while (choice != 0);
    }

    public static void addHotel() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("nhập tên");
        String name = sc1.nextLine();
        System.out.println("nhập ngày sinh");
        String birthday = sc.nextLine();
        System.out.println("nhập cmt");
        String idCard = sc1.nextLine();
        System.out.println("nhập số ngày thuê");
        int numberDay =Integer.parseInt(sc1.nextLine());
        System.out.println("nhập loại phòng ở (small,vip,super vip)");
        String kindOfRoom = sc.nextLine();
        People people = new People(name, birthday, idCard);
        Hotel hotel = new Hotel(people, numberDay, kindOfRoom);
        manageHotel.addPeople(idCard, hotel);
        System.out.println("_________________________");

    }

    public static void totalMoney() {
        System.out.println("nhập số cmt");
        String idCard = sc.nextLine();
        manageHotel.billPlease(idCard);
    }
}
