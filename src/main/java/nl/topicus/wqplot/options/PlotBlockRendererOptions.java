package nl.topicus.wqplot.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotBlockRendererOptions extends PlotSeriesRendererOptions
{
	private static final long serialVersionUID = 1L;

	/**
	 * css styles that will be applied to all data blocks.
	 */
	private String css;

	/**
	 * true to escape html in the box label.
	 */
	private Boolean escapeHtml;

	/**
	 * true to turn spaces in data block label into html breaks <br />
	 *
	 */
	private Boolean insertBreaks;

	/**
	 * true to vary the color of each block in this series according to the seriesColors
	 * array.
	 */
	private Boolean varyBlockColors;

	public PlotBlockRendererOptions()
	{
	}

	public String getCss()
	{
		return css;
	}

	public PlotBlockRendererOptions setCss(String css)
	{
		this.css = css;
		return this;
	}

	public Boolean getEscapeHtml()
	{
		return escapeHtml;
	}

	public PlotBlockRendererOptions setEscapeHtml(Boolean escapeHtml)
	{
		this.escapeHtml = escapeHtml;
		return this;
	}

	public Boolean getInsertBreaks()
	{
		return insertBreaks;
	}

	public PlotBlockRendererOptions setInsertBreaks(Boolean insertBreaks)
	{
		this.insertBreaks = insertBreaks;
		return this;
	}

	public Boolean getVaryBlockColors()
	{
		return varyBlockColors;
	}

	public PlotBlockRendererOptions setVaryBlockColors(Boolean varyBlockColors)
	{
		this.varyBlockColors = varyBlockColors;
		return this;
	}
}
