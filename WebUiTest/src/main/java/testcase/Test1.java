package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class Test1 {

     @Test
    public  void testUI() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\jiangtan\\Desktop\\kaijie\\until\\chromeDriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //窗口最大化
        driver.manage().window().maximize();
        driver.get("http://www.baidu.com");
        //隐形等待
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //显式等待

        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
//         查找id为“kw"的元素是否加载出来了（已经在页面DOM中存在）
       // wait.until(ExpectedConditions.presenceOfElementLocated(By.id("kw")));
//         在设定时间内找到后就返回，超时直接抛异常
        driver.findElement(By.id("kw")).sendKeys("selenium");
        // 4.获取“百度一下”按钮，进行搜索
        driver.findElement(By.id("su")).click();
        //执行错误报错截图
        //driver.navigate().wait(1);
        // 5.退出浏览器
        driver.quit();

    }

    @Test
    public void test01(){
        Assert.assertEquals(1,1);
    }



}
