package codechallenges.hashtables;
import org.junit.jupiter.api.Test;
import java.util.Collection;
import static org.junit.jupiter.api.Assertions.*;
public class HashTableTest {
  @Test
  public void givenHashMap_whenSetKeyAndValue_thenValueIsStored() {
    // Arrange
    HashMap<String, Integer> hashMap = new HashMap<>(10);

    // Act
    hashMap.set("key1", 100);
    int value = hashMap.get("key1");

    // Assert
    assertEquals(100, value);
  }

  @Test
  public void givenHashMap_whenGetNonExistentKey_thenReturnsNull() {
    // Arrange
    HashMap<String, Integer> hashMap = new HashMap<>(10);

    // Act
    Integer value = hashMap.get("nonexistent");

    // Assert
    assertNull(value);
  }

  @Test
  public void givenHashMap_whenCheckingForExistingKey_thenReturnsTrue() {
    // Arrange
    HashMap<String, Integer> hashMap = new HashMap<>(10);
    hashMap.set("key2", 200);

    // Act
    boolean containsKey = hashMap.contains("key2");
    boolean containsNonExistentKey = hashMap.contains("nonexistent");

    // Assert
    assertTrue(containsKey);
    assertFalse(containsNonExistentKey);
  }

  @Test
  public void givenHashMap_whenGettingKeys_thenReturnsAllUniqueKeys() {
    // Arrange
    HashMap<String, Integer> hashMap = new HashMap<>(10);
    hashMap.set("key1", 100);
    hashMap.set("key2", 200);

    // Act
    Collection<String> keys = hashMap.keys();

    // Assert
    assertEquals(2, keys.size());
    assertTrue(keys.contains("key1"));
    assertTrue(keys.contains("key2"));
  }

  @Test
  public void givenHashMapWithCollision_whenGettingValues_thenCorrectValuesRetrieved() {
    // Arrange
    HashMap<String, Integer> hashMap = new HashMap<>(10);
    hashMap.set("key1", 100);
    hashMap.set("key11", 110);

    // Act
    int value1 = hashMap.get("key1");
    int value2 = hashMap.get("key11");

    // Assert
    assertEquals(100, value1);
    assertEquals(110, value2);
  }

  @Test
  public void givenHashMapWithCollision_whenGettingValueFromCollisionBucket_thenCorrectValueRetrieved() {
    // Arrange
    HashMap<String, Integer> hashMap = new HashMap<>(10);
    hashMap.set("key1", 100);
    hashMap.set("key11", 110);

    // Act
    int value = hashMap.get("key11");

    // Assert
    assertEquals(110, value);
  }

  @Test
  public void givenHashMap_whenHashingKey_thenValueIsInRange() {
    // Arrange
    HashMap<String, Integer> hashMap = new HashMap<>(10);

    // Act
    int hashValue = hashMap.hash("key1");

    // Assert
    assertTrue(hashValue >= 0 && hashValue < 10);
  }
}
