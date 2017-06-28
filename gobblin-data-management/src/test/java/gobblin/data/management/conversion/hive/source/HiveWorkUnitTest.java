package gobblin.data.management.conversion.hive.source;

import java.util.ArrayList;
import java.util.List;

import org.apache.hadoop.hive.metastore.api.FieldSchema;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HiveWorkUnitTest {

  @Test
  public void testPartitionKeys() {
    HiveWorkUnit hwu = new HiveWorkUnit();
    List<FieldSchema> partitionKeySchema = new ArrayList<>();
    partitionKeySchema.add(new FieldSchema("dailypartition", "string", null));
    partitionKeySchema.add(new FieldSchema("hour", "int", null));

    hwu.setPartitionKeys(partitionKeySchema);

    List<FieldSchema> actual = hwu.getPartitionKeys().get();
    Assert.assertEquals(actual, partitionKeySchema);
  }
}
