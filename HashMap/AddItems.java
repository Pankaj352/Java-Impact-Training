import java.util.HashMap;

class AddItems{
    public static void main(String[] args) {
        HashMap<String, String> capitalCities=new HashMap<>();

        capitalCities.put("Englan","London");
        capitalCities.put("Germany","Berlin");
        capitalCities.put("Norway","Oslo");
        capitalCities.put("USA","Washington DC");

        System.out.println(capitalCities);

    }
}