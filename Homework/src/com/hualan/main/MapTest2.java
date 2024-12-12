package com.hualan.main;

import com.hualan.bean.RaceInfo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

/*1. 已知历届世界杯信息如下:

        | 届数       | 举办年份 | 举办地点 | 冠军   |
        | ---------- | -------- | -------- | ------ |
        | 第一届     | 1930     | 乌拉圭   | 乌拉圭 |
        | 第二届     | 1934     | 意大利   | 意大利 |
        | 第三届     | 1938     | 法国     | 意大利 |
        | 第四届     | 1950     | 巴西     | 乌拉圭 |
        | 第五届     | 1954     | 瑞士     | 西德   |
        | 第六届     | 1958     | 瑞典     | 巴西   |
        | 第七届     | 1962     | 智利     | 巴西   |
        | 第八届     | 1966     | 英格兰   | 英格兰 |
        | 第九届     | 1970     | 墨西哥   | 巴西   |
        | 第十届     | 1974     | 前西德   | 西德   |
        | 第十一届   | 1978     | 阿根廷   | 阿根廷 |
        | 第十二届   | 1982     | 西班牙   | 意大利 |
        | 第十三届   | 1986     | 墨西哥   | 阿根廷 |
        | 第十四届   | 1990     | 意大利   | 西德   |
        | 第十五届   | 1994     | 美国     | 巴西   |
        | 第十六届   | 1998     | 法国     | 法国   |
        | 第十七届   | 2002     | 韩日     | 巴西   |
        | 第十八届   | 2006     | 德国     | 意大利 |
        | 第十九届   | 2010     | 南非     | 西班牙 |
        | 第二十届   | 2014     | 巴西     | 德国   |
        | 第二十一届 | 2018     | 俄罗斯   | 法国   |

        (1) 在上面的模块里，在com.hualan.bean包里创建一个RaceInfo类保存比赛信息，包含届数raceNumber， 年份year，地点place， 冠军winner属性。

        (2) 在com.hualan.main包里创建一个MapTest2类，在类的main方法里完成下面功能：
*/

public class MapTest2 {
    public static void main(String[] args) {
        Map<Integer, RaceInfo> map = new HashMap<>();
        map.put(1930, new RaceInfo("第一届", 1930, "乌拉圭", "乌拉圭"));
        map.put(1934, new RaceInfo("第二届", 1934, "意大利", "意大利"));
        map.put(1938, new RaceInfo("第三届", 1938, "法国", "意大利"));
        map.put(1950, new RaceInfo("第四届", 1950, "巴西", "乌拉圭"));
        map.put(1954, new RaceInfo("第五届", 1954, "瑞士", "西德"));
        map.put(1958, new RaceInfo("第六届", 1958, "瑞典", "巴西"));
        map.put(1962, new RaceInfo("第七届", 1962, "智利", "巴西"));
        map.put(1966, new RaceInfo("第八届", 1966, "英格兰", "英格兰"));
        map.put(1970, new RaceInfo("第九届", 1970, "墨西哥", "巴西"));
        map.put(1974, new RaceInfo("第十届", 1974, "前西德", "西德"));
        map.put(1978, new RaceInfo("第十一届", 1978, "阿根廷", "阿根廷"));
        map.put(1982, new RaceInfo("第十二届", 1982, "西班牙", "意大利"));
        map.put(1986, new RaceInfo("第十三届", 1986, "墨西哥", "阿根廷"));
        map.put(1990, new RaceInfo("第十四届", 1990, "意大利", "西德"));
        map.put(1994, new RaceInfo("第十五届", 1994, "美国", "巴西"));
        map.put(1998, new RaceInfo("第十六届", 1998, "法国", "法国"));
        map.put(2002, new RaceInfo("第十七届", 2002, "韩日", "巴西"));
        map.put(2006, new RaceInfo("第十八届", 2006, "德国", "意大利"));
        map.put(2010, new RaceInfo("第十九届", 2010, "南非", "西班牙"));
        map.put(2014, new RaceInfo("第二十届", 2014, "巴西", "德国"));
        map.put(2018, new RaceInfo("第二十一届", 2018, "俄罗斯", "法国"));
        /*(3) 从控制台接收一个代表年份的字符串，输出该年的世界杯冠军是哪支球队。如果该年没有举办世界杯，则输出：没有举办世界杯。
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入年份:");
        int year = sc.nextInt();
        if (map.containsKey(year)) {
            System.out.println("这一年的冠军是" + map.get(year).getWinner());
        } else {
            System.out.println("没有举办世界杯");
        }
        System.out.println("====================================");
        /*
        (4) 从控制台接收一个代表球队名的字符串，输出该球队夺冠的年份列表。 例如，读入"巴西"，应当输出 1958 1962 1970 1994 2002 读入"荷兰"，应当输出"没有获得过世界杯冠军"

                > 可以把年份作为key，把RaceInfo对象作为value。

        */
        System.out.print("请输入需要查询的球队：");
        String winner = sc.next();
        AtomicBoolean flag = new AtomicBoolean(false);

//        Set<Integer> set = map.keySet();
//        for (Integer inter : set) {
//            if (map.get(inter).getWinner().equals(winner)) {
//                System.out.print(inter + " ");
//                flag = true;
//            }
//        }

//        Set<Map.Entry<Integer, RaceInfo>> set3 = map.entrySet();
//        for (Map.Entry<Integer, RaceInfo> race : set3) {
//            if (race.getValue().getWinner().equals(winner)) {
//                System.out.print(race.getKey() + " ");
//                flag = true;
//            }
//        }
        map.forEach((k, v) -> {
            if (v.getWinner().equals(winner)) {
                System.out.print(k + " ");
                flag.set(true);
            }
        });
        if (!flag.get()) {
            System.out.println("没有获得过世界杯冠军");
        }


    }
}
