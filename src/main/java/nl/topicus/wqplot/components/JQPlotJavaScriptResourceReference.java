package nl.topicus.wqplot.components;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.Application;
import org.apache.wicket.markup.head.HeaderItem;
import org.apache.wicket.markup.head.JavaScriptHeaderItem;
import org.apache.wicket.request.resource.JavaScriptResourceReference;

public class JQPlotJavaScriptResourceReference extends JavaScriptResourceReference
{
	private static final long serialVersionUID = -4771815414204892357L;

	private static JQPlotJavaScriptResourceReference INSTANCE =
		new JQPlotJavaScriptResourceReference();

	private JQPlotJavaScriptResourceReference()
	{
		super(JQPlotJavaScriptResourceReference.class, "jquery.jqplot.js");
	}

	public static JQPlotJavaScriptResourceReference get()
	{
		return INSTANCE;
	}

	@Override
	public List<HeaderItem> getDependencies()
	{
		List<HeaderItem> dependencies = new ArrayList<HeaderItem>();
		for (HeaderItem headerItem : super.getDependencies())
		{
			dependencies.add(headerItem);
		}
		dependencies.add(JavaScriptHeaderItem
			.forReference(Application.get().getJavaScriptLibrarySettings().getJQueryReference()));
		return dependencies;
	}
}
