package nl.topicus.wqplot.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotAxisRendererOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Boolean sortMergedLabels;

	public PlotAxisRendererOptions()
	{
	}

	public Boolean getSortMergedLabels()
	{
		return sortMergedLabels;
	}

	public PlotAxisRendererOptions setSortMergedLabels(Boolean sortMergedLabels)
	{
		this.sortMergedLabels = sortMergedLabels;
		return this;
	}
}
