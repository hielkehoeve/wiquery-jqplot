package nl.topicus.wqplot.web;

import nl.topicus.wqplot.web.pages.HomePage;

import org.apache.wicket.Application;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.util.time.Duration;

/**
 * Application object for your web application. If you want to run this application
 * without deploying, run the Start class.
 * 
 */
public class WicketApplication extends WebApplication
{
	@Override
	public Class<HomePage> getHomePage()
	{
		return HomePage.class;
	}

	@Override
	protected void init()
	{
		super.init();

		getMarkupSettings().setStripWicketTags(true);
		//getSharedResources().putClassAlias(Application.class, "application");
		
		getResourceSettings().setResourcePollFrequency(Duration.ONE_SECOND);

		getRequestLoggerSettings().setRequestLoggerEnabled(true);
		getRequestLoggerSettings().setRequestsWindowSize(200);
		getRequestLoggerSettings().setRecordSessionSize(true);
	}

	public static WicketApplication get()
	{
		return (WicketApplication) WebApplication.get();
	}

	public boolean isDevelopment()
	{
		return Application.CONFIGURATION.equals(getConfigurationType());
	}
}
