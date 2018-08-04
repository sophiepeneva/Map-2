# Map-2
Google Inside Look/ CodingBat challenges

public Map<String, Integer> wordCount(String[] strings) {
   Map<String, Integer> map = new HashMap<String, Integer>();
   for(String word : strings)
   {
    map.put(word, occurances(strings,word));     
   }
   return map;
}

public int occurances(String[] strings, String word)
{
  int counter =0;
  for(String str : strings)
  {
    if(str.compareTo(word)==0)counter++;
  }
  return counter;
}
