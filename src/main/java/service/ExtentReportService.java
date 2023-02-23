package service;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExtentReportService {
    public static final String REPORT_EXECUTION_DATE = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH;mm;ss"));
    public String testEnvironment;
    public String getTestEnvironment(){
        return testEnvironment;
    }

    public void setTestEnvironment(String testEnvironment) {
        this.testEnvironment = testEnvironment;
    }
}
