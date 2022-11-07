package testcase;

import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo {
    @Test
    public void test01(){
        Assert.assertEquals(1,1);
    }
    @Test(description ="TestPass")
    @Feature("MyTest")
    public void test02(){
        Assert.assertEquals(1,1);
    }
    @Test(description ="TestFila Test03")
    public void test03(){
        Assert.assertEquals(1,3);
    }
}

