package CoeJava.projects.aadhar.pan.link;
import java.util.HashMap;
import java.util.Map;


public class PanService {

    private static Map<String, Pan> panMap = new HashMap<>();

    static {
        panMap.put("ABCEF12345",new Pan("ABCEF12345","123456","Hdfc bank","stock"));
        panMap.put("ABCEF54321",new Pan("ABCEF54321","654321","bank of Badoda","plot"));
    }
    public Pan getPanByAadhaarNumber(String aadhaarNumber){
        return panMap.values().stream().filter(pan->pan.getAadhaarNumber().equals(aadhaarNumber)).findFirst().orElse(null);
    }

}
