# Map-2
Google Inside Look/ CodingBat challenges

public Map<String, Integer> word0(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  for(String word : strings)
  {
    map.put(word,0);
  }
  return map;
}
