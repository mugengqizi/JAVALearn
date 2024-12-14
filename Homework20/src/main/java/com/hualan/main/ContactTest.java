package com.hualan.main;

import com.hualan.bean.AddressBook;
import com.hualan.bean.Contact;

import java.util.Scanner;

public class ContactTest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        while (true) {
            System.out.println("=======通讯录系统=======");
            System.out.println("1. 添加联系人");
            System.out.println("2. 查看全部联系人");
            System.out.println("3. 根据分组查看联系人");
            System.out.println("4. 根据姓名关键字查看联系人");
            System.out.println("5. 根据手机号关键字查看联系人");
            System.out.println("6. 修改联系人");
            System.out.println("7. 删除联系人");
            System.out.println("8. 根据关键字查找联系人");
            System.out.println("9. 退出系统");
            System.out.print("请输入您的选择(1-9)：");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.print("请输入联系人的姓名：");
                    String name1 = sc.next();
                    System.out.print("请输入联系人的手机号：");
                    String phone1 = sc.next();
                    if (addressBook.isExist(name1, phone1)) {
                        System.out.println("联系人已存在");
                        break;
                    }
                    addressBook.addContact(new Contact(name1, phone1));
                    System.out.println("添加成功");
                }
                case 2 -> addressBook.showAllContacts();
                case 3 -> addressBook.showContactsByGroupName();
                case 4 -> addressBook.showContactsByName();
                case 5 -> addressBook.showContactsByPhone();
                case 6 -> addressBook.modifyContact();
                case 7 -> addressBook.deleteContactByName();
                case 8 -> addressBook.showContactsByKeyword();
                case 9 -> {
                    System.out.println("您确认要退出吗?（Y/N）");
                    String confirm = sc.next();
                    if (confirm.equals("Y")) {
                        System.exit(0);
                    } else {
                        System.out.println("退出失败，请重新选择");
                    }
                }
                default -> System.out.println("输入错误，请重新输入");
            }

        }
    }
}
