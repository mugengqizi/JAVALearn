import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Function {
    static Scanner sc = new Scanner(System.in);
    //定义一个设备数组
    static Device[] devices = new Device[100];
    //定义一个设备数组下表
    static private int DeviceIndex = 0;
    //定义一个借用设备数组
    static Device[] borrowedDevices = new Device[100];
    //定义一个借用设备数组下表
    static private int borrowedDeviceIndex = 0;
    //定义一个维修设备数组
    static Device[] repairDevices = new Device[100];
    //定义一个维修设备数组下表
    static private int repairDeviceIndex = 0;
    //定义一个借用设备信息数组
    static BorrowInfo[] borInfos = new BorrowInfo[100];
    //定义一个借用设备信息数组下标
    static private int borInfoIndex = 0;

    //添加设备
    static public void addDevice() {
        //判断设备数组是否已满并且给借用设备数组留出空间
        if (DeviceIndex >= devices.length && DeviceIndex >= devices.length - borrowedDeviceIndex) {
            System.out.println("设备数组已满!");
            return;
        }
        Device device = new Device();
        System.out.print("请输入添加设备的数目:");
        int num  ;
        while (true) {
            try {
                num = sc.nextInt();
            }catch (Exception e) {
                sc.nextLine();
                System.out.print("输入有误，请重新输入:");
                continue;
            }
            break;
        }
        device.setDeviceNumber(num);
        System.out.print("请输入设备名称:");
        device.setDeviceName(sc.next());
        System.out.print("请输入设备型号:");
        device.setDeviceType(sc.next());
        devices[DeviceIndex] = device;
        DeviceIndex++;
        System.out.println("添加设备成功!");
    }

    //借用设备
    static public void borrowDevice() {
        System.out.print("请输入借用人姓名:");
        String borrower = sc.next();
        System.out.print("请输入借用设备的名称:");
        String name = sc.next();
        System.out.print("请输入借用设备的型号:");
        String type = sc.next();
        System.out.print("请输入借用设备的数目:");
        int num;
        while (true) {
            try{
                num = sc.nextInt();
            } catch (Exception e) {
                sc.nextLine();
                System.out.print("输入有误，请重新输入:");
                continue;
            }
            break;
        }
        //记录借用设备的数量
        int num2=num;
        //判断设备是否足够
        if (num > repairDevice(name, type)){
            System.out.println("设备数量不足!");
        }else {
            //设备足够,开始借用
            //得到设备下标
            int[] index = findDeviceAll(name, type);
            for (int i = 0; i < index.length; i++) {
                //判断当前设备下表的设备数目是否满足要求
                if (devices[index[i]].getDeviceNumber() >= num) {
                    devices[index[i]].setDeviceNumber(devices[index[i]].getDeviceNumber() - num);
                    num = 0;
                }else {
                    //设备数目不足,查找下一个设备库存
                    num -= devices[index[i]].getDeviceNumber();
                    devices[index[i]].setDeviceNumber(0);
                }
                //借用全部设备,退出循环
                if (num == 0) {
                    break;
                }
            }
            //添加借用信息
            BorrowInfo borInfo = new BorrowInfo(name,borrower,num2);
            borInfos[borInfoIndex] = borInfo;
            borInfo.setBorrowTime(new Date());
            borInfoIndex++;
            //添加借用设备到借用设备数组
            borrowedDevices[borrowedDeviceIndex] = new Device(name, type, num2);
            borrowedDevices[borrowedDeviceIndex].setDeviceStatus(DeviceStatus.UNAVAILABLE);
            borrowedDeviceIndex++;
        }
    }
    //查询设备
    static public void queryDevice() {
        while(true) {
            //    1 查询目前具有的设备，包括设备名称和设备库存。
            //    2 根据设备名称，查询当前设备对应的库存
            //    3 查询指定设备名称下面所有的设备详情信息
            System.out.println("1. 查询目前具有的设备，包括设备名称和设备库存。");
            System.out.println("2. 根据设备名称，查询当前设备对应的库存。");
            System.out.println("3. 查询指定设备名称下面所有的设备详情信息。");
            System.out.println("4. 退出查询。");
            System.out.print("请输入选项：");
            int choice;
            while (true) {
                try {
                    choice = sc.nextInt();
                } catch (Exception e) {
                    sc.nextLine();
                    System.out.print("输入有误，请重新输入:");
                    continue;
                }
                break;
            }
            switch (choice){
                case 1:
                    //查询目前具有的设备，包括设备名称和设备库存。
                    System.out.println("目前具有的设备:");
                    //遍历打印设备数组
                    for (int i = 0; i < DeviceIndex; i++) {
                        System.out.println(devices[i]);
                    }
                    //遍历打印维修数组
                    for (int i = 0; i < repairDeviceIndex; i++) {
                        System.out.println(repairDevices[i]);
                    }
                    break;
                case 2: {
                    //根据设备名称，查询当前设备对应的库存
                    System.out.print("请输入设备名称:");
                    String name = sc.next();
                    int[] index = findDeviceAll(name);
                    if (index.length == 0) {
                        System.out.println("没有找到该设备!");
                    } else {
                        System.out.println("该设备的库存:");
                        for (int i = 0; i < index.length; i++) {
                            System.out.println(devices[index[i]]);
                        }
                    }
                    break;
                }
                case 3:
                    //查询指定设备名称下面所有的设备详情信息
                    System.out.print("请输入设备名称:");
                    System.out.print("请输入设备名称:");
                    String name = sc.next();
                    System.out.print("请输入设备型号:");
                    String type = sc.next();
                    int[] index = findDeviceAll(name , type);
                    System.out.println("该设备的详情信息:");
                    if (index.length == 0) {
                        System.out.println("没有找到该设备!");
                    } else {
                        System.out.println("该设备的库存:");
                        for (int i = 0; i < index.length; i++) {
                            System.out.println(devices[index[i]]);
                        }
                    }
                    break;
                case 4:
                    //退出查询
                    return;
            }
        }
    }
    //删除设备
    static public void deleteDevice() {
        //自动删除库存为0的设备
        for (int i = 0; i < DeviceIndex; i++) {
            if (devices[i].getDeviceNumber() == 0) {
                //删除设备
                devices[i] = null;
                //数组元素前移
                for (int j = i; j < DeviceIndex - 1; j++) {
                    devices[j] = devices[j + 1];
                }
                //更新设备数组下标
                DeviceIndex--;
            }
        }
        //    1 删除指定设备
        //    2 删除所有设备
        System.out.println("1. 删除指定设备。");
        System.out.println("2. 删除所有设备。");
        System.out.println("3. 退出删除。");
        System.out.print("请输入选项：");
        int choice;
        while (true){
            while (true) {
                try {
                    choice = sc.nextInt();
                } catch (Exception e) {
                    sc.nextLine();
                    System.out.print("输入有误，请重新输入:");
                    continue;
                }
                break;
            }
            switch (choice){
                case 1:
                    //删除指定设备
                    System.out.print("请输入设备名称:");
                    String name = sc.next();
                    System.out.print("请输入设备型号:");
                    String type = sc.next();
                    int[] index = findDeviceAll(name, type);
                    if (index.length == 0) {
                        System.out.println("没有找到该设备!");
                    } else {
                        for (int i = 0; i < index.length; i++) {
                            //删除设备
                            devices[index[i]] = null;
                            //数组元素前移
                            for (int j = index[i]; j < DeviceIndex - 1; j++) {
                                devices[j] = devices[j + 1];
                            }
                        }
                        //更新设备数组下标
                        DeviceIndex -= index.length;
                        System.out.println("删除设备成功!");
                    }
                    break;
                case 2:
                    //删除所有设备
                    System.out.println("确认删除所有设备? (y/n)");
                    String confirm = sc.next();
                    if (!confirm.equals("y")) {
                        System.out.println("取消删除!");
                        return;
                    }
                    for (int i = 0; i < DeviceIndex; i++) {
                        devices[i] = null;
                    }
                    DeviceIndex = 0;
                    System.out.println("删除所有设备成功!");
                    break;
                case 3:
                    //退出删除
                    return;
            }
        }

    }
    //维修设备
    static public void repairDevice() {
        if (repairDeviceIndex == 0){
            System.out.println("没有需要维修的设备!");
            return;
        }
        System.out.println("需要维修的设备:");
        //遍历打印维修数组
        for (int i = 0; i < repairDeviceIndex; i++) {
            System.out.println(repairDevices[i]);
        }
        //    1 维修指定设备
        //    2 维修所有设备
        System.out.println("1. 维修指定设备。");
        System.out.println("2. 退出维修。");
        System.out.print("请输入选项：");
        int choice;
        while (true) {
            while (true) {
                try {
                    choice = sc.nextInt();
                } catch (Exception e) {
                    sc.nextLine();
                    System.out.print("输入有误，请重新输入:");
                    continue;
                }
                break;
            }
            switch (choice) {
                case 1:
                    //维修指定设备
                    System.out.print("请输入设备名称:");
                    String name = sc.next();
                    System.out.print("请输入设备型号:");
                    String type = sc.next();
                    for (int i = 0; i < repairDeviceIndex; i++) {
                        if (repairDevices[i].getDeviceName().equals(name) && repairDevices[i].getDeviceType().equals(type)) {
                            //添加维修设备到设备数组
                            devices[DeviceIndex+1] = new Device(name, type, repairDevices[i].getDeviceNumber());
                            DeviceIndex++;
                            System.out.println("维修设备成功!");
                            //删除维修设备
                            repairDevices[i] = null;
                            //数组元素前移
                            for (int j = i; j < repairDeviceIndex - 1; j++) {
                                repairDevices[j] = repairDevices[j + 1];
                            }
                            //更新维修设备数组下标
                            repairDeviceIndex--;
                            break;
                        }
                    }
                case 2:
                    //退出维修
                    return;
            }
        }
    }

    //查询借用信息
    static public void queryBorrowInfo() {
        //查询所有借用信息
        System.out.println("借用信息:");
        for (int i = 0; i < borInfoIndex; i++) {
            System.out.println(borInfos[i]);
        }
    }
    //查询借用设备
    static public void queryBorrowedDevice() {
        //查询所有借用设备
        System.out.println("借用设备:");
        for (int i = 0; i < borrowedDeviceIndex; i++) {
            System.out.println(borrowedDevices[i]);
        }
    }

    //归还设备
    static public void returnDevice() {
        //根据名字,和型号查询借用设备
        System.out.print("请输入设备名称:");
        String name = sc.next();
        System.out.print("请输入设备型号:");
        String type = sc.next();
        //遍历借用设备数组
        for (int i = 0; i < borrowedDeviceIndex; i++) {
            if (borrowedDevices[i].getDeviceName().equals(name) && borrowedDevices[i].getDeviceType().equals(type)) {
                //询问设备状态
                System.out.println("请问设备是否需要维修? (y/n)");
                String confirm = sc.next();
                if (confirm.equals("y")) {
                    //设备需要维修,添加到维修设备数组
                    repairDevices[repairDeviceIndex] = new Device(name, type, borrowedDevices[i].getDeviceNumber());
                    repairDevices[repairDeviceIndex].setDeviceStatus(DeviceStatus.RUNNING);
                    repairDeviceIndex++;
                }else {
                    //归还设备
                    //更新设备库存
                    for (int j = 0; j < DeviceIndex; j++) {
                        //设备库存有该设备
                        //更新设备库存
                        if (devices[j].getDeviceName().equals(name) && devices[j].getDeviceType().equals(type)) {
                            devices[j].setDeviceNumber(devices[j].getDeviceNumber() + borrowedDevices[i].getDeviceNumber());
                            devices[j].setDeviceStatus(DeviceStatus.AVAILABLE);
                            break;
                        }
                        if (j == DeviceIndex - 1) {
                            //设备库存没有该设备,直接添加设备到设备数组
                            devices[DeviceIndex] = new Device(name, type, borrowedDevices[i].getDeviceNumber());
                            DeviceIndex++;
                        }
                    }
                }
                //更新借用设备状态
                borrowedDevices[i].setDeviceStatus(DeviceStatus.AVAILABLE);
                //删除借用设备
                borrowedDevices[i] = null;
                //数组元素前移
                for (int j = i; j < borrowedDeviceIndex - 1; j++) {
                    borrowedDevices[j] = borrowedDevices[j + 1];
                }
                //更新借用设备数组下标
                borrowedDeviceIndex--;
                System.out.println("归还设备成功!");
                return;
            }
        }
        System.out.println("没有找到该设备!");
    }

    //根据设备名称和型号查询设备,返回设备数目,0表示没有找到设备
    static public int repairDevice(String name, String type) {
        //设备数目
        int num = 0;
        for (int i = 0; i < DeviceIndex; i++) {
            if (devices[i].getDeviceName().equals(name) && devices[i].getDeviceType().equals(type)) {
                num += devices[i].getDeviceNumber();
            }
        }
        return num;
    }
    //根据设备名称和型号查询设备,返回设备下标,null表示没有找到设备
    static public int[] findDeviceAll(String name, String type) {
        //设备下表
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < DeviceIndex; i++) {
            if (devices[i].getDeviceName().equals(name) && devices[i].getDeviceType().equals(type)) {
                list.add(i);
            }
        }
        //集合转数组
        int[] index = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            index[i] = list.get(i);
        }
        return index;
    }
    //根据设备名称查询设备,返回设备下标,null表示没有找到设备
    static public int[] findDeviceAll(String name) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < DeviceIndex; i++) {
            if (devices[i].getDeviceName().equals(name)) {
                list.add(i);
            }
        }
        //集合转数组
        int[] index = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            index[i] = list.get(i);
        }
        return index;
    }
}
