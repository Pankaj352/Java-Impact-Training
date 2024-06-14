import java.util.HashMap;

class ClearItems{
    public static void main(String[] args) {
        HashMap<String, String> capitalCities=new HashMap<>();

        capitalCities.put("Englan","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");

        System.out.println(capitalCities);

        capitalCities.clear();
        System.out.println(capitalCities);
    }
}