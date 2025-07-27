package TestRunner;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.cucumber.listener.Reporter;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.AfterClass;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import service.ExtentReportService;


public class Runner extends AbstractTestNGCucumberTests {

    public static ExtentReports extent;
    public static ExtentTest test;
    public static final String TEST_ENVIRONMENT =  ((ExtentReportService)new ClassPathXmlApplicationContext("src/test/resources/factorybean-spring-ctx.xml").getBean("extentReportService")).getTestEnvironment();

    public static final Map<String, String> SCENARION_TARGET_PATH_REGISTRY_MAP = new HashMap<>();
    @AfterClass
    public static void teardown(){
        Reporter.loadXMLConfig("src/test/resources/extent-config.xml");
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows 10 Enterprise");
        Reporter.setSystemInfo("environment", TEST_ENVIRONMENT);

    }
    public static String getExecutionDateTimeString(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH;mm;ss"));
    }

}
