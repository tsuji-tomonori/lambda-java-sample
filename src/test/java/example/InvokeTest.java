package example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.amazonaws.services.lambda.runtime.Context;

class InvokeTest {
  private static final Logger logger = LoggerFactory.getLogger(InvokeTest.class);

  @Test
  void invokeTest() {
    logger.info("Invoke TEST");
    HashMap<String,String> event = new HashMap<String,String>();
    event.put("partitionkey", "aaa");
    event.put("sortkey", "bbb");
    Context context = new TestContext();
    Handler handler = new Handler();
    String result = handler.handleRequest(event, context);
    assertTrue(result.contains("200 OK"));
  }

}
