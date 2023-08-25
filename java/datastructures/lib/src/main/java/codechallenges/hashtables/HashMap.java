package codechallenges.hashtables;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// NOTE: Does NOT preserve insertion order!
// WARNING: Don't make K an Object or Character!
public class HashMap<K, V>{
  ArrayList<LinkedList<HashMapPair<K, V>>> bucketArrayList;  // using ArrayList instead of array so we can instantiate with a parameterized type
  int size;

  public HashMap(int size)
  {
    if (size < 1)
    {
      throw new IllegalArgumentException("HashMap size must be 1 or greater!");
    }

    this.size = size;
    this.bucketArrayList = new ArrayList<>(size);

    // Next part is not required, and is a little inefficient, but it makes writing HashMap operations easier
    for (int i = 0; i < this.size; i++)
    {
      bucketArrayList.add(i, new LinkedList<>());
    }
  }

  // Make sure to replace if the key is a dupe!
  public void set(K key, V value) {
//    There must be at least one item
    if (key == null) {
      throw new IllegalArgumentException("Key cannot be null");
    }

    int bucketIndex = hash(key) % size;
    LinkedList<HashMapPair<K, V>> bucket = bucketArrayList.get(bucketIndex);

    // Search for an existing entry with the same key
    for (HashMapPair<K, V> pair : bucket) {
      if (pair.getKey().equals(key)) {
        pair.setValue(value); // Replace value if key already exists - like updating the main information
        return;
      }
    }

    // If no existing entry with the same key is found, add a new key-value pair
    bucket.add(new HashMapPair<>(key, value));
  }


  public V get(K key) {
//    There needs to be at least one item(key)
    if (key == null) {
      throw new IllegalArgumentException("Key cannot be null");
    }

    int bucketIndex = hash(key) % size;
    LinkedList<HashMapPair<K, V>> bucket = bucketArrayList.get(bucketIndex);

    // Search for the key in the linked list
    for (HashMapPair<K, V> pair : bucket) {
      if (pair.getKey().equals(key)) {
        return pair.getValue(); // Return value if key is found
      }
    }

    return null; // Key not found
  }

  public boolean contains(K key) {
    //      At least one item needed
    if (key == null) {
      throw new IllegalArgumentException("Key cannot be null");
    }

    int bucketIndex = hash(key) % size;
    LinkedList<HashMapPair<K, V>> bucket = bucketArrayList.get(bucketIndex);

    // Search for the key in the linked list
    for (HashMapPair<K, V> pair : bucket) {
      if (pair.getKey().equals(key)) {
        return true; // Key is found
      }
    }

    return false; // Key not found
  }

  public List<K> keys() {
//    Create the empty list that will store the collection of keys
    List<K> keysList = new ArrayList<>();

    for (LinkedList<HashMapPair<K, V>> bucket : bucketArrayList) {
      for (HashMapPair<K, V> pair : bucket) {
        keysList.add(pair.getKey());
      }
    }

    return keysList;
  }

  // Sometimes hashCode in Java can be negative! So we need to do absolute value
  // If you really want to hash things yourself, look at https://stackoverflow.com/a/113600/16889809
  // Don't use Character! Don't use Object! Don't use any object you have not overridden equals() and hashCode() on!
  // If you do this, things that should collide, won't, because Object.hashCode() is not good
  // Protip: Testing collisions is easy with Integer, because Integer hashes to its own value
  public int hash(K key)
  {
    return Math.abs(key.hashCode()) % size;
  }
}
