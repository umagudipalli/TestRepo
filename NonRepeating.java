
import java.util.*;

public class NonRepeating {

        // [1,3,7,6,1,7,10,2,1,1,3,5,32,2,5,2] => 32
        
        public int getNonRepeatingEle(int[] arr){

            Map<Integer,Integer> map = new HashMap<Integer,Integer>();

            for(int var : arr){
                map.put(var,map.getOrDefault(var,0)+1);
            }

                // check for each value in the map

        // final version changes

            for(int i=arr.length-1 ; i>=0; i--){
                if(map.get(arr[i])==1){
                    return arr[i];
                }
            }
            return -1;
        }
    }

