package com.example.study.calendar.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * schedule：下一次的执行时间点=上一次程序执行完成的时间点+间隔时间。方法更注重保持间隔时间的稳定。
 * scheduleAtFixedRate：下一次的执行时间点=上一次程序开始执行的时间点+间隔时间;
 *                      并且因为前一个任务要执行6秒，而当前任务已经开始执行了，因此两个任务间存在重叠，需要考虑线程同步。方法更注重保持执行频率的稳定。
 */
public class MyTimer {
    public static void main(String[] args) {
        Timer timer = new Timer();
        MyTimerTask task = new MyTimerTask("NO.1");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String time = simpleDateFormat.format(new Date());
        System.out.println("current time = " + time);
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, -1);
        System.out.println(simpleDateFormat.format(calendar.getTime()));

        //time时间执行task一次
//        timer.schedule(task, new Date());

        //2s后执行一次，间隔3s执行多次task
//        timer.schedule(task, 2000L, 3000L);

        //从当前时间开始，3s后执行一次
//        timer.schedule(task, 3000L);

        //1.calendar.getTime()在当前时间之前，立即执行一次，然后每间隔3s执行一次
        //2.calendar.getTime()在当前时间之后，calendar.getTime()的时候执行一次，然后每间隔3s执行一次
//        timer.schedule(task, calendar.getTime(), 3000L);

//        timer.scheduleAtFixedRate(task, calendar.getTime() , 3000L);

        timer.scheduleAtFixedRate(task, 1000L, 3000L);

        // 终止此计时器，丢弃所有当前已安排的任务
//        timer.cancel();

        // 从此计时器的任务队列中移除所有已取消的任务。
        timer.purge();
    }
}
