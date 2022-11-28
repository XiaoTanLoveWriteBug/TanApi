import java.util.List;
import org.testng.TestNG;
import com.google.common.collect.Lists;


//启动测试
public class StartAllured {
    public static void main(String[] args) {
        TestNG tng = new TestNG();
        List<String> suites = Lists.newArrayList();
        //添加要执行的testng.xml文件
        suites.add("WebUiTest/src/main/resources/testng.xml");
        tng.setTestSuites(suites);
        tng.run();
    }
}
