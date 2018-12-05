package frameworkTests;

import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
	features={"src//test//resources//features"}
	,glue={"stepDefinitions","utility"}
	,plugin = {"pretty", "html:target/cucumber"}
	, tags ={"@demo1"}
//	, tags = {"~@unit"}
)


@Test
public class RunTest extends AbstractTestNGCucumberTests
{

}