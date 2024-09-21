import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapSample {

    public static void main(String[] args)
    {
        Map<String,String>credentials = new HashMap<>();
        credentials.put("minnuiby@gmail.com","ms123");
        credentials.put("siby@gmail.com","sj1233");
        credentials.put("gsinu@gmail.com","gs4578");
        credentials.putIfAbsent("jithin34@gmail.com","jj567");
        credentials.putIfAbsent("gsinu@gmail.com","new123"); // already present so not added
        System.out.println(credentials);

        System.out.println(credentials.get("jithin34@gmail.com"));

        Set<Map.Entry<String,String>> entry = credentials.entrySet();
        for(Map.Entry<String,String> pairs: entry)
        {
            String email = pairs.getKey();
            String pw = pairs.getValue();
            if(!pw.equals("password123"))
            {
                pairs.setValue("password123"); //The setValue() method in the Map.Entry interface is used to update the value associated with a specific key in a map.
            }
        }

        System.out.println("After updating :");
        System.out.println(credentials);
    }
}
