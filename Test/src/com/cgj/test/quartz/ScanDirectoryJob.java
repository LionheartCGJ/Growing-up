package com.cgj.test.quartz;

import java.io.File;
import java.io.FileFilter;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A simple Quartz job that, once configured, will scan a directory and print
 * out details about the files found in the directory.
 */
public class ScanDirectoryJob implements Job {
    private final static Logger logger = LoggerFactory.getLogger(ScanDirectoryJob.class);

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        // Every job has its own job detail
        JobDetail jobDetail = context.getJobDetail();

        // Get job description
        String jobDesc = jobDetail.getDescription();
        logger.info(jobDesc + " fired at " + new Date());

        // The directory to scan is stored in the job data map
        JobDataMap dataMap = jobDetail.getJobDataMap();
        String dirName = dataMap.getString("SCAN_DIR");

        // Validate the required input
        if (null == dirName) {
            throw new JobExecutionException("Directory not configured");
        }

        // Make sure the directory exists
        File dir = new File(dirName);
        if (!dir.exists()) {
            throw new JobExecutionException("Invalid Dir " + dirName);
        }

        // Use FileFilter to get only target files
        final String extension = dataMap.getString("FILE_EXTENSION");
        FileFilter filter = new FileExtensionFileFilter(extension);

        File[] files = dir.listFiles(filter);

        if (null == files || files.length <= 0) {
            logger.info("NO extension files found in" + dir);
        }
        for (File file : files) {
            String message = file.getName() + " - Size: " + file.length();
            logger.info(message);
        }
    }

}
