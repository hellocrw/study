package com.example.study.calendar.quartz;

import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

public class QuartzTest {
    public static void main(String[] args) throws SchedulerException {
        // 创建工作
        JobDetail jobDetail = JobBuilder.newJob(MyJob.class)
                .withDescription("工作描述")
                .withIdentity("工作的名称", "工作的组")
                .build();
        // 创建触发器
        Trigger trigger = TriggerBuilder.newTrigger()
                .withDescription("触发器的描述")
                .withIdentity("触发器的名称", "触发器的组")
                //"0/5 11 * ? * *"表达式
                .withSchedule(CronScheduleBuilder.cronSchedule("0/5 11 * ? * *"))
                .startAt(new Date())
                .build();
        // 创建调度器，粘合工作和触发器
        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.scheduleJob(jobDetail, trigger);

        // 启动调度器
        scheduler.start();
    }
}
