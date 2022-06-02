package academy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentReportNG
{

    static ExtentReports extent;
    static public ExtentReports getReportObject()
    {
        String path = System.getProperty("user.dir") + "\\reports\\index.html";
        ExtentSparkReporter report=new ExtentSparkReporter(path);
        report.config().setReportName("Web Automation");
        report.config().setDocumentTitle("Test reuslts");

        extent=new ExtentReports();
        extent.attachReporter(report);
        extent.setSystemInfo("Tester","Ravikant");
        return extent;
    }
}
