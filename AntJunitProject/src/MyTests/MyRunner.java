package MyTests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({
	ClickonLinkRandomTest.class,
	InvestmentTest.class
})
public class MyRunner {

}
