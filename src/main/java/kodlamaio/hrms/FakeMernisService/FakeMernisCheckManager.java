package kodlamaio.hrms.fakeMernisService;

import org.springframework.stereotype.Component;
@Component
public class fakeMernisCheckManager {
   public boolean isOkay(String identityNumber) {
     if(identityNumber.length<11){
       return false;
     }
      return true;
     
   }
}