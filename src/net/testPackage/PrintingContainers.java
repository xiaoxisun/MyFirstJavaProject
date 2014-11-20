package net.testPackage;

import java.util.*;
import static java.lang.System.out;

public class PrintingContainers {
static Collection fill(Collection<String> collection) {
collection.add("rat");
collection.add("cat");
collection.add("dog");
collection.add("dog");
return collection;
}
static Map fill(Map<String,String> map) {
map.put("rat", "Fuzzy");
map.put("cat", "Rags");
map.put("dog", "Bosco");
map.put("dog", "Spot");
return map;
}
public static void main(String[] args) {
out.println(fill(new ArrayList<String>()));
out.println(fill(new LinkedList<String>()));
out.println(fill(new HashSet<String>()));
out.println(fill(new TreeSet<String>()));
out.println(fill(new LinkedHashSet<String>()));
out.println(fill(new HashMap<String,String>()));
out.println(fill(new TreeMap<String,String>()));
out.println(fill(new LinkedHashMap<String,String>()));
}
} //* Output: