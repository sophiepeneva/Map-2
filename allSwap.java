# Map-2
Google Inside Look/ CodingBat challenges

public String[] allSwap(String[] strings) {
  Map<Character, Integer> map = new HashMap<Character, Integer>();
  int counter = wordCount(strings);
  for(int i=0;i<counter;i++)
  {
    if(map.containsKey(strings[i].charAt(0)))
    {
       if(map.get(strings[i].charAt(0))==-1)map.put(strings[i].charAt(0),i);
       else
       {
         String temp = strings[i];
         strings[i] = strings[map.get(strings[i].charAt(0))];
         strings[map.get(strings[i].charAt(0))]=temp;
         map.put(strings[i].charAt(0),-1);
       }
     }
      if(!map.containsKey(strings[i].charAt(0)))map.put(strings[i].charAt(0),i);
  }
  return strings;
}

public int wordCount(String[] str)
{
  int counter=0;
  for(String word : str)counter++;
  return counter;
}
