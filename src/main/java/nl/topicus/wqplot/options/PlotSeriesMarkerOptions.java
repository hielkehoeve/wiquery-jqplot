package nl.topicus.wqplot.options;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotSeriesMarkerOptions implements Serializable
{
	private static final long serialVersionUID = 1L;

	/**
	 * wether to show data point markers.
	 */
	private Boolean show;

	/**
	 * circle, diamond, square, filledCircle. filledDiamond or filledSquare.
	 */
	private PlotMarkerStyle style;

	/**
	 * width of the stroke drawing the marker.
	 */
	private Double lineWidth;

	/**
	 * size (diameter, edge length, etc.) of the marker.
	 */
	private Double size;

	/**
	 * color of marker, set to color of line by default.
	 */
	private String color;

	/**
	 * wether to draw shadow on marker or not.
	 */
	private Boolean shadow;

	/**
	 * angle of the shadow. Clockwise from x axis.
	 */
	private Double shadowAngle;

	/**
	 * offset from the line of the shadow,
	 */
	private Double shadowOffset;

	/**
	 * Number of strokes to make when drawing shadow. Each stroke/ offset by shadowOffset
	 * from the last.
	 */
	private Integer shadowDepth;

	/**
	 * Opacity of the shadow
	 */
	private Double shadowAlpha;

	/**
	 * Renderer that will draws the shadows on the marker.
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String shadowRenderer;

	/**
	 * Renderer that will draw the marker.
	 */
	@JsonSerialize(using = PluginReferenceSerializer.class, include = Inclusion.NON_NULL)
	private String shapeRenderer;

	public PlotSeriesMarkerOptions()
	{
	}

	public Boolean getShow()
	{
		return show;
	}

	public PlotSeriesMarkerOptions setShow(Boolean show)
	{
		this.show = show;
		return this;
	}

	public PlotMarkerStyle getStyle()
	{
		return style;
	}

	public PlotSeriesMarkerOptions setStyle(PlotMarkerStyle style)
	{
		this.style = style;
		return this;
	}

	public Double getLineWidth()
	{
		return lineWidth;
	}

	public PlotSeriesMarkerOptions setLineWidth(Double lineWidth)
	{
		this.lineWidth = lineWidth;
		return this;
	}

	public Double getSize()
	{
		return size;
	}

	public PlotSeriesMarkerOptions setSize(Double size)
	{
		this.size = size;
		return this;
	}

	public String getColor()
	{
		return color;
	}

	public PlotSeriesMarkerOptions setColor(String color)
	{
		this.color = color;
		return this;
	}

	public Boolean getShadow()
	{
		return shadow;
	}

	public PlotSeriesMarkerOptions setShadow(Boolean shadow)
	{
		this.shadow = shadow;
		return this;
	}

	public Double getShadowAngle()
	{
		return shadowAngle;
	}

	public PlotSeriesMarkerOptions setShadowAngle(Double shadowAngle)
	{
		this.shadowAngle = shadowAngle;
		return this;
	}

	public Double getShadowOffset()
	{
		return shadowOffset;
	}

	public PlotSeriesMarkerOptions setShadowOffset(Double shadowOffset)
	{
		this.shadowOffset = shadowOffset;
		return this;
	}

	public Integer getShadowDepth()
	{
		return shadowDepth;
	}

	public PlotSeriesMarkerOptions setShadowDepth(Integer shadowDepth)
	{
		this.shadowDepth = shadowDepth;
		return this;
	}

	public Double getShadowAlpha()
	{
		return shadowAlpha;
	}

	public PlotSeriesMarkerOptions setShadowAlpha(Double shadowAlpha)
	{
		this.shadowAlpha = shadowAlpha;
		return this;
	}

	public String getShadowRenderer()
	{
		return shadowRenderer;
	}

	public PlotSeriesMarkerOptions setShadowRenderer(String shadowRenderer)
	{
		this.shadowRenderer = shadowRenderer;
		return this;
	}

	public String getShapeRenderer()
	{
		return shapeRenderer;
	}

	public PlotSeriesMarkerOptions setShapeRenderer(String shapeRenderer)
	{
		this.shapeRenderer = shapeRenderer;
		return this;
	}
}
