package tests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstTest extends BaseTest{

    @Test
    public void test(){
        searchPage.openSearch();
        searchPage.search("Погода Пенза");
        Assert.assertTrue(resultPage.getLinkText().contains("Погода"));

    }
}
