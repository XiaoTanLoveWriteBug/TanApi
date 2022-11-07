import org.testng.TestNG;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StartAllured {


    public static void main(String[] args) {
//        TestNG testNG = new TestNG();
//        List<String> suites = new ArrayList<String>();
//        suites.add(".\\WebUiTest\\src\\main\\resources\\testng.xml");
//        //suites.add(".\\test-output\\testng-failed.xml");
//        testNG.setTestSuites(suites);
//        testNG.run();

        execCommandAndGetOutput();
        System.out.println("allured");
    }

    public static void execCommandAndGetOutput() {
        try {
            Runtime runtime = Runtime.getRuntime();
            Process process = runtime.exec("cmd.exe / allure serve allure-results allure serve");
            // 输出结果，必须写在 waitFor 之前
            String outStr = getStreamStr(process.getInputStream());
            // 错误结果，必须写在 waitFor 之前
            String errStr = getStreamStr(process.getErrorStream());
            int exitValue = process.waitFor(); // 退出值 0 为正常，其他为异常
            System.out.println("exitValue: " + exitValue);
            System.out.println("outStr: " + outStr);
            System.out.println("errStr: " + errStr);
            process.destroy();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static String getStreamStr(InputStream is) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(is, "GBK"));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append("\n");
        }
        br.close();
        return sb.toString();
    }
}
