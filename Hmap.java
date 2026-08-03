import java.util.HashMap;

public class Hmap{

    public static void main(String[] args){
        
        HashMap<String, Integer> empIds = new HashMap<>();
        empIds.put("Vinay", 600017);
        empIds.put("Kiran", 600022);
        empIds.put("Teja", 600014);
     
        System.out.println(empIds);

        System.out.println(empIds.get("Vinay"));
        System.out.println(empIds.containsKey("Tejas"));
        System.out.println(empIds.containsValue(600014));

        empIds.put("Kiran", 12);
        empIds.put("Hero",600014);

        empIds.replace("Teja", 89);
        empIds.replace("SRI", 6000);
         
        empIds.putIfAbsent("SRI",2202);

        empIds.remove("SRI");






        System.out.println(empIds);
    }
}