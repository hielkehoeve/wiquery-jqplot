package nl.topicus.wqplot.options;

import java.io.IOException;
import java.lang.reflect.Type;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

public class PluginReferenceSerializer extends StdSerializer<Object>
{
	/**
	 * Singleton instance to use.
	 */
	public final static PluginReferenceSerializer instance = new PluginReferenceSerializer();

	public PluginReferenceSerializer()
	{
		super(Object.class);
	}

	@Override
	public JsonNode getSchema(SerializerProvider provider, Type typeHint)
	{
		return createSchemaNode("any", true);
	}

	@Override
	public void serialize(Object value, JsonGenerator jgen, SerializerProvider provider)
			throws IOException, JsonGenerationException
	{
		jgen.writeRawValue(value.toString());
	}
}
