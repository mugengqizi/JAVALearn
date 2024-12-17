package com.hualan.main;


import com.hualan.runnable.runnable;

/*某某市动物园因疫情防控原因，每日只能接待1000名游客(即每天只有1000张票)，有3个售票窗口进行售票。窗口卖出去一张票之后，要打印"窗口X卖出一张票，当前剩余xxx张票"，其中"窗口X"是每个窗口的名称(即:线程名)。

   > 3个窗口的名字分别是 窗口A, 窗口B, 窗口C

   (1) 在com.hualan.main包里创建一个SellTicketTest类，在类的main方法中完成售票功能

   (2) 通过Thread子类的方式实现一遍售票功能，Thread子类创建在com.hualan.task包里

   (3) 通过Runnable实现类的方式实现一遍, Runnable子类创建在com.hualan.runnable包里

 */
public class SellTicketTest {
    public static void main(String[] args) {
//        第二问
//        Task task = new Task();
//        Thread t1 = new Thread(task, "窗口A");
//        Thread t2 = new Thread(task, "窗口B");
//        Thread t3 = new Thread(task, "窗口C");
//        t1.start();
//        t2.start();
//        t3.start();

        //第三问
        runnable runA = new runnable();
        Thread tA = new Thread(runA, "窗口A");
        Thread tB = new Thread(runA, "窗口B");
        Thread tC = new Thread(runA, "窗口C");
        tA.start();
        tB.start();
        tC.start();
    }
}
