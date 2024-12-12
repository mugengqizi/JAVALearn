import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //打印操作页面
        while(true){
            System.out.println("===欢迎来到华蓝EMS操作页面===");
            System.out.println("1. 添加设备");
            System.out.println("2. 借用设备");
            System.out.println("3. 查询设备");
            System.out.println("4. 删除设备");
            System.out.println("5. 查看设备借用记录");
            System.out.println("6. 归还设备");
            System.out.println("7. 维修设备");
            System.out.println("8. 查寻借用设备");
            System.out.println("9. 退出系统");
            System.out.print("请选择操作：");
            int choice;
            try{
                choice = sc.nextInt();
            }catch (Exception e){
                sc.nextLine();
                System.out.println("输入错误，请重新输入！");
                continue;
            }
            switch (choice){
                case 1:
                    Function.addDevice();
                    break;
                case 2:
                    Function.borrowDevice();
                    break;
                case 3:
                    Function.queryDevice();
                    break;
                case 4:
                    Function.deleteDevice();
                    break;
                case 5:
                    Function.queryBorrowInfo();
                    break;
                case 6:
                    Function.returnDevice();
                    break;
                case 7:
                    Function.repairDevice();
                    break;
                case 8:
                    Function.queryBorrowedDevice();
                    break;
                case 9:
                    System.out.println("欢迎下次使用！");
                    System.exit(0);
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        }
    }
}
