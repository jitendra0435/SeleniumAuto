package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import screenshot.Screenshots;

import java.io.IOException;

public class Listners extends Screenshots implements ITestListener {
    Screenshots sc=new Screenshots();

    @Override
    public void onTestStart(ITestResult result)
    {
        System.out.println("Test start");
        try {
            sc.screenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("Test which are passed ......." +
                ""+result.getName());
        try {
            sc.screenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestFailure(ITestResult result)
    {
        System.out.println("Test which are failure......." +
                ""+result.getName());
        try {
            sc.screenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult result)
    {
        System.out.println("Test which are Skipped......." +
                ""+result.getName());
        try {
            sc.screenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result)
    {

    }

    @Override
    public void onStart(ITestContext context)
    {

    }

    @Override
    public void onFinish(ITestContext context)
    {

    }

}
