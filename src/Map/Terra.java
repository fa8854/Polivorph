package Map;

import java.util.HashMap;
import java.util.Map;

public class Terra {
    private final Map<String,Integer> map = new HashMap<>();
    public void addToMap(String key, int value){
        if (!map.containsKey(key)){
            map.put(key,value);
        }
        else {
            int valueFromMap = map.get(key);
            if (valueFromMap == value){
                throw new IllegalArgumentException("Ошибка");
            }else {
                map.put(key, valueFromMap + value);
            }
        }
    }
}
