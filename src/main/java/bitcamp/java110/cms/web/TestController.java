package bitcamp.java110.cms.web;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("Test")
public class TestController {

  public TestController() {
  }
  
  @GetMapping("HandleBarsTest01")
  public void HandleBarsTest01(Model model) throws JsonProcessingException {
    Map<String, String> map = new HashMap<String, String>();
    map.put("title", "HandleBarsTest01 Title 김영록");
    map.put("body", "HandleBarsTest01 Body");
    
    ObjectMapper mapper = new ObjectMapper();
    String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);
    System.out.println(json);
    
    model.addAttribute("json", json);
  }
  
  @GetMapping("FileUploadTest01")
  public void FileUploadTest01(Model model){
    
  }
  @PostMapping("FileUploadTest01.do")
  public String FileUploadTest01do() {
    
    return "redirect:FileUploadTest01";
    
  }
  

}

