package com.hualan.main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class BarbecueTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService pool = Executors.newCachedThreadPool();
        Future<Boolean> zs = pool.submit(() -> {
            System.out.println("张三到达农贸市场");
            sleep(1000);
            System.out.println("张三正在挑选烧烤炉");
            sleep(3000);
            System.out.println("张三正在购买烧烤木炭");
            sleep(1000);
            System.out.println("张三正在返回教室");
            sleep(2000);
            System.out.println("张三到达教室");
            return true;
        });
        Future<Boolean> ls = pool.submit(() -> {
            System.out.println("李四到达农贸市场");
            sleep(1000);
            System.out.println("李四正在挑选烧烤食材");
            sleep(2000);
            System.out.println("李四正在返回教室");
            sleep(2000);
            System.out.println("李四到达教室");
            return true;
        });
        Future<Boolean> ww = pool.submit(() -> {
            System.out.println("王五到达超市");
            sleep(2000);
            System.out.println("王五正在挑选零食和饮料");
            sleep(2000);
            System.out.println("王五正在返回教室");
            sleep(1000);
            System.out.println("王五到达教室");
            return true;
        });
        Future<Boolean> zl = pool.submit(() -> {
            System.out.println("赵六到达超市");
            sleep(2000);
            System.out.println("赵六正在购买棋牌");
            sleep(1000);
            System.out.println("赵六正在返回教室");
            sleep(1000);
            System.out.println("赵六到达教室");
            return true;
        });
        Future<Boolean> tq = pool.submit(() -> {
            System.out.println("田七正在选择外出活动地点");
            sleep(3000);
            System.out.println("田七统计外出人员名单");
            sleep(1000);
            System.out.println("田七正在联系大巴车");
            return true;
        });
        if (zs.get() && ls.get() && ww.get() && zl.get() && tq.get()) {
            System.out.println("班级同学兴高采烈的外出游玩了");
        }
        pool.shutdown();
    }

    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
