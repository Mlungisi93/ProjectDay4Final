package com.expleo.project4;

import com.expleo.project4.Report;

import java.io.IOException;

public class Test {
    private static final String MAVENBATCH = "MavenCommand";
    private static final String STARTJSONFILE = "StartJsonServer";
    public static void main(String[] args) throws InterruptedException, IOException {
        Report.readAll(STARTJSONFILE);
        Report.processMavenBatFile();
        Report.writeToFile(STARTJSONFILE);
        Report.runBatchMavenFile(STARTJSONFILE);
  Thread.sleep(4000);
        Report.readAll(MAVENBATCH);
        Report.processMavenBatFile();
        Report.writeToFile(MAVENBATCH);
        Report.runBatchMavenFile(MAVENBATCH);
        Thread.sleep(40000);
        Report.runBatchCopyReport();
        Thread.sleep(4000);
        Runtime.getRuntime().exec("taskkill /f /im cmd.exe"); // to kill any cmd
        System.exit(0);


    }
}
