package CoeJava.projects.aadhar.pan.link;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {

    private static Map<String,Aadhaar> aadhaarMap = new HashMap<>();

    static {
        aadhaarMap.put("123456",new Aadhaar("123456","arjun","21/4/2002","rajendra","jaipur"));
        aadhaarMap.put("654321",new Aadhaar("654321","rahul","45/6/2002","radhuveer","udaipur"));
    }
    public Aadhaar getAadhaarByNumber(String aadhaarNumber){
        return aadhaarMap.get(aadhaarNumber);
    }
    public Aadhaar updateAadhaarDetails(Aadhaar aadhaar, String aadhaarNumber){

        Aadhaar existsAadhaar = aadhaarMap.get(aadhaarNumber);

        existsAadhaar.setAddress(aadhaar.getAddress());
        existsAadhaar.setFatherName(aadhaar.getFatherName());
        existsAadhaar.setDateOfBirth(aadhaar.getDateOfBirth());
        existsAadhaar.setName(aadhaar.getName());

        return aadhaarMap.put(aadhaarNumber,existsAadhaar);
    };


}
