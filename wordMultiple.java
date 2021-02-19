// Given an array of strings, return a Map<String, Boolean> where each different string is 
// a key and its value is true if that string appears 2 or more times in the array.


// wordMultiple(["a", "b", "a", "c", "b"]) → {"a": true, "b": true, "c": false}
// wordMultiple(["c", "b", "a"]) → {"a": false, "b": false, "c": false}
// wordMultiple(["c", "c", "c", "c"]) → {"c": true}


import java.util.HashMap;
import java.util.Map;


    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String , Boolean> map = new HashMap<String , Boolean>();
        // Map<String , Boolean> count = new HashMap<String , Boolean>();
        Boolean value ;
        
        for(int i = 0; i <= strings.length -1; i++){
          if(!(map.containsKey(strings[i]))){
            value = false;
            map.put(strings[i],value);
          } else{
            value = true;
            map.put(strings[i],value);
          }
      }
        return map;
      }

