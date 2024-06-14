import java.util.HashMap;

public class LoopHashMap {
    public static void main(String[] args) {
        
    
     HashMap<String, String> capitalCities=new HashMap<>();

        capitalCities.put("Englan","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");

        // print keys
        for(String i : capitalCities.keySet()){
            System.out.println(i);
        }
        
        // print values
        for(String i: capitalCities.values()){
            System.out.println(i);
        }

        for(String i : capitalCities.keySet()){
            System.out.println("Key: "+i+" value: "+ capitalCities.get(i));
        }


}
}