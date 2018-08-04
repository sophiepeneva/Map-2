# Map-2
Google Inside Look/ CodingBat challenges

public Map<String, String> firstChar(String[] strings) {
  Map<String, String> map = new HashMap<String, String>();
  for(String word : strings)
  {
    char first = word.charAt(0);
    String firstStr = new String();
    firstStr = firstStr + first;
    if(!map.containsKey(firstStr))map.put(firstStr,concatenated(strings,first));
  }
  return map;
}

public String concatenated(String[] strings, char first)
{
  String conc= new String();
  for(String word : strings)
  {
    if(word.charAt(0)==first)conc=conc+word;
  }
  return conc;
}
