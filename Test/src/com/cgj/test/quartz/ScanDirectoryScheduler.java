package com.cgj.test.quartz;

import java.util.Date;

import org.quartz.DateBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class ScanDirectoryScheduler {

    public static void main(String args[]) {
        ScanDirectoryScheduler example = new ScanDirectoryScheduler();

        try {
            // Create a Scheduler and scheduler the job
            Scheduler scheduler = example.createScheduler();
            example.shedulerJob(scheduler);

            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    private Scheduler createScheduler() throws SchedulerException {
        return StdSchedulerFactory.getDefaultScheduler();
    }

    private void shedulerJob(Scheduler scheduler) throws SchedulerException {
        // Create a JobDetail for the Job
        JobDataMap dataMap = new JobDataMap();
        dataMap.put("SCAN_DIR", "F:\\Program Files\\CloudMusic");
        dataMap.put("FILE_EXTENSION", ".dll");
        JobDetail jobDetail = JobBuilder.newJob().withIdentity("ScanDirectory", Scheduler.DEFAULT_GROUP)
                .setJobData(dataMap).ofType(ScanDirectoryJob.class).requestRecovery(false)
                .withDescription("Scan direct job").build();
        // Create a trigger that fires every 25 seconds, forever
        Date runTime = DateBuilder.evenMinuteDate(new Date());
        Date endTime = DateBuilder.evenHourDate(new Date());
        Trigger trigger = TriggerBuilder.newTrigger().withIdentity("ScanDirectory", Scheduler.DEFAULT_GROUP)
                .startAt(runTime).endAt(endTime).build();

        scheduler.scheduleJob(jobDetail, trigger);
    }

}
