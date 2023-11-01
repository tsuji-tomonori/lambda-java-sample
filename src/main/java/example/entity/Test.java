package example.entity;

import java.util.HashMap;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;

public class Test {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		Sample sample = new Sample("x", "y");
		HashMap<String, AttributeValue> sampleMap = sample.toDbHashMap();
		for (String key: sampleMap.keySet()) {
			System.out.println(key + sampleMap.get(key));
		}

	}

}
