# Map-2
Google Inside Look/ CodingBat challenges

public Map<String, String> pairs(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  for(String word : strings)
  {
    String first = new String();
    first = first + word.charAt(0);
    String last = new String();
    last = last + word.charAt(word.length()-1);
    map.put(first,last);
  }
  return map;
}
