package com.hualan.bean;

import net.sourceforge.pinyin4j.PinyinHelper;

public class Contact {
    private String name;
    private String phone;
    private String groupName;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
        this.groupName = convertToPinyin(name).substring(0, 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.groupName = convertToPinyin(name).substring(0, 1);
    }

    public String getPhone() {
        return phone;
    }


    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public String toString() {
        return name + "(" + phone + ")";
    }

    public static String convertToPinyin(String chineseName) {
        StringBuilder pinyin = new StringBuilder();

        // 遍历中文名中的每个字符
        for (char ch : chineseName.toCharArray()) {
            // 检查字符是否为汉字
            if (Character.toString(ch).matches("[\u4e00-\u9fa5]")) {
                String[] pinyinArray = PinyinHelper.toHanyuPinyinStringArray(ch);
                if (pinyinArray != null && pinyinArray.length > 0) {
                    // 取第一个拼音，转换为小写
                    pinyin.append(pinyinArray[0]).append(" ");
                }
            } else {
                // 对非汉字字符直接追加
                pinyin.append(ch).append(" ");
            }
        }
        return pinyin.toString().trim();
    }
}

