package example.entity;

import java.lang.reflect.Field;
import java.util.HashMap;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

public abstract class DynamoDbEntity {

	public HashMap<String, AttributeValue> toDbHashMap() throws IllegalArgumentException, IllegalAccessException{
		HashMap<String, AttributeValue> result = new HashMap<String, AttributeValue>();
		Field[] fields = this.getClass().getDeclaredFields();
		for (Field f : fields) {
			f.setAccessible(true);
			result.put(f.getName(), new AttributeValue((String) f.get(this)));
		}
		return result;
	}

}
