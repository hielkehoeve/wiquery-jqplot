package nl.topicus.wqplot.options;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotPieRendererOptions extends PlotSeriesRendererOptions
{
	private static final long serialVersionUID = 1L;

	/**
	 * diameter of the pie, auto computed by default
	 */
	private Double diameter;

	/**
	 * padding between the pie and plot edges, legend, etc.
	 */
	private Double padding;

	/**
	 * pixels spacing between pie slices.
	 */
	private Double sliceMargin;

	/**
	 * true or false, wether to fil the slices.
	 */
	private Boolean fill;

	/**
	 * offset of the shadow from the slice and offset of each succesive stroke of the
	 * shadow from the last.
	 */
	private Double shadowOffset;

	/**
	 * transparency of the shadow (0 = transparent, 1 = opaque)
	 */
	private Double shadowAlpha;

	/**
	 * number of strokes to apply to the shadow, each stroke offset shadowOffset from the
	 * last.
	 */
	private Integer shadowDepth;

	private Boolean showDataLabels;

	private PlotDataLabels dataLabels;

	private Double lineWidth;

	public PlotPieRendererOptions()
	{
	}

	public Double getDiameter()
	{
		return diameter;
	}

	public PlotPieRendererOptions setDiameter(Double diameter)
	{
		this.diameter = diameter;
		return this;
	}

	public Double getPadding()
	{
		return padding;
	}

	public PlotPieRendererOptions setPadding(Double padding)
	{
		this.padding = padding;
		return this;
	}

	public Double getSliceMargin()
	{
		return sliceMargin;
	}

	public PlotPieRendererOptions setSliceMargin(Double sliceMargin)
	{
		this.sliceMargin = sliceMargin;
		return this;
	}

	public Boolean isFill()
	{
		return fill;
	}

	public PlotPieRendererOptions setFill(Boolean fill)
	{
		this.fill = fill;
		return this;
	}

	public Double getShadowOffset()
	{
		return shadowOffset;
	}

	public PlotPieRendererOptions setShadowOffset(Double shadowOffset)
	{
		this.shadowOffset = shadowOffset;
		return this;
	}

	public Double getShadowAlpha()
	{
		return shadowAlpha;
	}

	public PlotPieRendererOptions setShadowAlpha(Double shadowAlpha)
	{
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public Integer getShadowDepth()
	{
		return shadowDepth;
	}

	public PlotPieRendererOptions setShadowDepth(Integer shadowDepth)
	{
		this.shadowDepth = shadowDepth;
		return this;
	}

	public Boolean getShowDataLabels()
	{
		return showDataLabels;
	}

	public PlotPieRendererOptions setShowDataLabels(Boolean showDataLabels)
	{
		this.showDataLabels = showDataLabels;
		return this;
	}

	public PlotDataLabels getDataLabels()
	{
		return dataLabels;
	}

	public PlotPieRendererOptions setDataLabels(PlotDataLabels dataLabels)
	{
		this.dataLabels = dataLabels;
		return this;
	}

	public Double getLineWidth()
	{
		return lineWidth;
	}

	public PlotPieRendererOptions setLineWidth(Double lineWidth)
	{
		this.lineWidth = lineWidth;
		return this;
	}
}
