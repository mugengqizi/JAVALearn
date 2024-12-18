package com.hualan.bean;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AddressBook {
    Map<String, List<Contact>> map = new TreeMap<>();
    Scanner sc = new Scanner(System.in);

    public AddressBook() {
        addContact(new Contact("张三", "13812345678"));
        addContact(new Contact("李四", "13812345679"));
        addContact(new Contact("王五", "13812345680"));
        addContact(new Contact("赵六", "13812345681"));
        addContact(new Contact("林七", "13812345682"));
    }

    //添加联系人
    public void addContact(Contact c) {
        String name = c.getName();
        if (!isChinese(name)) {
            System.out.println("姓名输入错误！！！");
            return;
        }
        String phone = c.getPhone();
        if (!isValidPhoneNumber(phone)) {
            System.out.println("手机号输入错误！！！");
            return;
        }
        Contact contact = new Contact(name, phone);
        if (map.containsKey(contact.getGroupName())) {
            map.get(contact.getGroupName()).add(contact);
        } else {
            List<Contact> list = new ArrayList<>();
            list.add(contact);
            map.put(contact.getGroupName(), list);
        }
    }

    // 判断联系人是否存在
    public boolean isExist(String name1, String phone1) {
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Contact>> entry = (Map.Entry<String, List<Contact>>) iterator.next();
            List<Contact> contacts = entry.getValue();
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                if (contact.getName().equals(name1)) {
                    return true;
                }
            }
        }
        return false;
    }

    //查看所有联系人
    public void showAllContacts() {
        System.out.println("------所有联系人的信息为：------");
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String groupName = (String) iterator.next();
            System.out.println(groupName);
            List<Contact> contacts = map.get(groupName);
            for (Contact contact : contacts) {
                System.out.println("\t" + contact);
            }
        }
    }

    //根据分组查看联系人
    public void showContactsByGroupName() {
        System.out.print("请输入要查看的分组：");
        String groupName = sc.next();
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String groupName2 = (String) iterator.next();
            if (groupName2.equals(groupName)) {
                List<Contact> contacts = map.get(groupName);
                for (Contact contact : contacts) {
                    System.out.println("\t" + contact);
                }
            }
        }
    }

    //根据姓名找联系人
    public void showContactsByName() {
        System.out.print("请输入要查询的姓名关键字：");
        String nameKeyword = sc.next();
        System.out.println("-------------------");
        boolean flag = false;
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String groupName = (String) iterator.next();
            System.out.println(groupName);
            List<Contact> contacts = map.get(groupName);
            for (Contact contact : contacts) {
                if (contact.getName().contains(nameKeyword)) {
                    System.out.println("\t" + contact);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("没有找到符合的联系人！");
        }
    }

    //根据电话号找联系人
    public void showContactsByPhone() {
        System.out.print("请输入要查询的联系人的手机号关键字：");
        String phoneKeyword = sc.next();
        boolean flag = false;
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String groupName = (String) iterator.next();
            System.out.println(groupName);
            List<Contact> contacts = map.get(groupName);
            for (Contact contact : contacts) {
                if (contact.getPhone().contains(phoneKeyword)) {
                    System.out.println("\t" + contact);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("没有找到符合的联系人！");
        }
    }

    //修改联系人
    public void modifyContact() {
        System.out.print("请输入您要修改的联系人的姓名：");
        String name = sc.next();
        boolean flag = false;
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Contact>> entry = (Map.Entry<String, List<Contact>>) iterator.next();
            List<Contact> contacts = entry.getValue();
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                if (contact.getName().equals(name)) {
                    flag = true;
                    contacts.remove(i);
                    if (contacts.isEmpty()) {
                        iterator.remove();
                    }
                }
            }
        }
        if (!flag) {
            System.out.println("没有找到符合的联系人！");
            return;
        }
        System.out.print("请输入新的姓名：");
        String newName = sc.next();
        System.out.print("请输入新的电话：");
        String newPhone = sc.next();
        Contact newContact = new Contact(newName, newPhone);
        addContact(newContact);
        System.out.println("修改成功！");
    }

    //删除联系人
    public void deleteContactByName() {
        System.out.print("请输入想要删除的联系人的姓名(全名)：");
        String name = sc.next();
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, List<Contact>> entry = (Map.Entry<String, List<Contact>>) iterator.next();
            List<Contact> contacts = entry.getValue();
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                if (contact.getName().equals(name)) {
                    contacts.remove(i);
                    if (contacts.isEmpty()) {
                        iterator.remove();
                    }
                }
            }
        }
        System.out.println("\n删除成功！");
    }

    // 判断字符串是否为汉字
    public static boolean isChinese(String str) {
        String regex = "^[\u4e00-\u9fa5]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    // 判断手机号是否合法
    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "^1[3456789]\\d{9}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    //根据关键字查询联系人
    public void showContactsByKeyword() {
        System.out.println("请输入查找的关键字：");
        String keyword = sc.next();
        System.out.println("-------------------");
        boolean flag = false;
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String groupName = (String) iterator.next();
            System.out.println(groupName);
            List<Contact> contacts = map.get(groupName);
            for (Contact contact : contacts) {
                if (contact.getName().contains(keyword) || contact.getPhone().contains(keyword)) {
                    System.out.println("\t" + contact);
                    flag = true;
                }
            }
        }
        if (!flag) {
            System.out.println("没有找到符合的联系人！");
        }
    }

}