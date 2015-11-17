package nl.topicus.wqplot.options;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize.Inclusion;

@JsonAutoDetect(fieldVisibility = Visibility.ANY, getterVisibility = Visibility.NONE, setterVisibility = Visibility.NONE)
@JsonSerialize(include = Inclusion.NON_NULL)
public class PlotTick implements Serializable
{
	private static final long serialVersionUID = 1L;

	private Object val;

	private Object label;

	public PlotTick(Object val)
	{
		this.val = val;
		this.label = null;
	}

	public PlotTick(Object val, Object label)
	{
		this.val = val;
		this.label = label;
	}

	public Object getVal()
	{
		return val;
	}

	public PlotTick setVal(Object val)
	{
		this.val = val;
		return this;
	}

	public Object getLabel()
	{
		return label;
	}

	public PlotTick setLabel(Object label)
	{
		this.label = label;
		return this;
	}

	@JsonValue
	public Object values()
	{
		if (getLabel() == null)
			return getVal();
		List<Object> ret = new ArrayList<Object>();
		ret.add(getVal());
		ret.add(getLabel());
		return ret;
	}
}
