package Turgutlu.tradesman;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/tradesman")
public class TradesmanController {

    @GetMapping("/getOk")
    public String getOk(){
        return "ok";
    }
}
