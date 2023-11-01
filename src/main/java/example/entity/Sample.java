package example.entity;

public class Sample extends DynamoDbEntity{

	private final String partitionKey;
	private final String sortKey;


	public Sample(String partitionKey, String sortKey) {
		super();
		this.partitionKey = partitionKey;
		this.sortKey = sortKey;
	}

	public String getPartitionKey() {
		return partitionKey;
	}

	public String getSortKey() {
		return sortKey;
	}

}
