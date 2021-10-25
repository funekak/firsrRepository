package listners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners implements ITestListener {

	@Override
	public void onFinish(ITestContext context) {
		
		
		// TODO Auto-generated method stub
	//	ITestListener.super.onFinish(context);
	}

	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("This is from the listner on start test " + context);
		// TODO Auto-generated method stub
	//	ITestListener.super.onStart(context);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println("This is from the listner on fail test " + result.getName());
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestFailure(result);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
	System.out.println("This is from the listner on success test " + result.getName());
		// TODO Auto-generated method stub
	//	ITestListener.super.onTestSuccess(result);
	}

	
}
