package com.example.study.calendar.timer;

import lombok.Data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

@Data
public class MyTimerTask extends TimerTask {

    private String name;

    public MyTimerTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        String time = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        System.out.println(time + "current timer name = " + name);
    }
}
