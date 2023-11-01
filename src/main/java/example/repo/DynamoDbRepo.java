package example.repo;

import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;

import example.entity.DynamoDbEntity;

public class DynamoDbRepo {

	private final AmazonDynamoDB ddb;
	private final String tabelName;


	public DynamoDbRepo(AmazonDynamoDB ddb, String tableName) {
		this.ddb = ddb;
		this.tabelName = tableName;
	}

	public DynamoDbRepo(String tableName) {
		this(AmazonDynamoDBClientBuilder.defaultClient(), tableName);
	}

	public void push(DynamoDbEntity entity) throws IllegalArgumentException, IllegalAccessException {
		ddb.putItem(tabelName, entity.toDbHashMap());
	}

}
