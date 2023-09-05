package codechallenges.hashtables;

public class TreeIntersection {
  public static ArrayList<Integer> commonValues(Tree<Integer> firstTree, Tree<Integer> secondTree) {
    HashSet<Integer> firstTreeValues = new HashSet<>();
    firstTreeValues = preOrderTraversal(firstTree.root, firstTreeValues);
    ArrayList<Integer> sameValuesSet = new ArrayList<>();
    sameValuesSet = valueComparisonPreorder(secondTree.root, sameValuesSet, firstTreeValues);

    return sameValuesSet;
  }

  HashSet<Integer> preOrderTraversal(Node node, HashSet<Integer> firstTreeValues) {
    if (node == null) {
      return firstTreeValues;
    }

    firstTreeValues.add(node.value);

    preOrderTraversal(node.left, firstTreeValues);

    preOrderTraversal(node.right, firstTreeValues);

    return firstTreeValues;
  }

  ArrayList<Integer> valueComparisonPreorder(Node node, ArrayList<Integer> sameValuesSet, HashSet<Integer> firstTreeValues) {
    if (node == null) {
      return sameValuesSet;
    }

    if (firstTreeValues.contains(node.value)) {
      sameValuesSet.add(node.value);
    }

    valueComparisonPreorder(node.left, sameValuesSet, firstTreeValues);

    valueComparisonPreorder(node.right, sameValuesSet, firstTreeValues);

    return sameValuesSet;
  }
}
