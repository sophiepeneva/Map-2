# Map-2
Google Inside Look/ CodingBat challenges

public String wordAppend(String[] strings) {
  Map<String, Integer> map = new HashMap<String, Integer>();
  String append = new String();
  for(String word :  strings)
  {
    if(map.containsKey(word))map.put(word,map.get(word)+1);
    if(!map.containsKey(word))map.put(word,1);
    if(map.get(word)%2==0)append = append + word;
  }
  return append;
}
