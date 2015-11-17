package nl.topicus.wqplot.data;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonValue;

public class BubbleSeriesEntry<K, V, S extends Number, L> extends AbstractSeriesEntry<K, V>
{
	private S size;

	private L label;

	public BubbleSeriesEntry(K key, V value, S size, L label)
	{
		super(key, value);
		this.size = size;
		this.label = label;
	}

	public S getSize()
	{
		return size;
	}

	public L getLabel()
	{
		return label;
	}

	@Override
	@JsonValue
	public List<Object> values()
	{
		return Arrays.asList(getKey(), getValue(), getSize(), getLabel());
	}
}
