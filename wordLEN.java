# Map-2
Google Inside Look/ CodingBat challenges

public Map<String, Integer> wordLen(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(String word : strings)
  {
    map.put(word,word.length());
  }
  return map;
}
