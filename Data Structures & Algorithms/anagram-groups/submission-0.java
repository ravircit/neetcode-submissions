class Solution {
public List<List<String>> groupAnagrams(String[] strs) {

        // Key -> Sorted string
        // Value -> List of original strings
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through each string
        for (String str : strs) {

            // Sort the characters
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            // If first time, create a new list
            map.putIfAbsent(key, new ArrayList<>());

            // Store the original string
            map.get(key).add(str);
        }

        // Convert map values to List<List<String>>
        return new ArrayList<>(map.values());
    }
}
