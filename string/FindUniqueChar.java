package hash;
//hash相关.q387_字符串中的第一个唯一字符;
//给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1
import java.util.HashMap;

/**
 * Hash o(n)
 */
public class FindUniqueChar {
    public int solution(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            // build hash map : character and how often it appears
            map.put(c,map.getOrDefault(c,0)+1);
        }
        // find the index
        for (int i=0;i<s.length();i++){
            Character c = s.charAt(i);
            if (map.get(c) ==1){
                return i;
            }
        }
        return -1;
    }
}
