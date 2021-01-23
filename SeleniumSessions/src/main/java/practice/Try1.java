package practice;

import java.lang.reflect.Method;
import java.util.List;

import org.testng.IDataProviderListener;
import org.testng.IDataProviderMethod;
import org.testng.ITestContext;
import org.testng.ITestNGMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Try1 implements IDataProviderMethod{

	@Test
	public void Test1() {
		
	}
	
	@DataProvider
	public void getData() {
		
	}


	@Override
	public Object getInstance() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Method getMethod() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isParallel() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Integer> getIndices() {
		// TODO Auto-generated method stub
		return null;
	}
}
