// Loop over the given array of strings to build a result string like this: when a string appears
//  the 2nd, 4th, 6th, etc. time in the array, append the string to the result.
//   Return the empty string if no string appears a 2nd time.


// wordAppend(["a", "b", "a"]) → "a"
// wordAppend(["a", "b", "a", "c", "a", "d", "a"]) → "aa"
// wordAppend(["a", "", "a"]) → "a"


import java.util.HashMap;
import java.util.Map;

    public String wordAppend(String[] strings) {
        String result = "";
        int value = 0;
        Map<String , Integer> map = new HashMap<String , Integer>();
        for(int i = 0; i <= strings.length-1;i++){
           if(!(map.containsKey(strings[i]))){
             map.put(strings[i],1);
           }else
           {
           value = map.get(strings[i]);
           value++;
           map.put(strings[i],value);
           if(map.get(strings[i]) % 2 == 0 && map.get(strings[i]) != 1){
          result += strings[i];
            }
          }
      }
      
      return result;
      } 

