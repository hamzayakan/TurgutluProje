package Turgutlu.tradesman;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/tradesman")
public class TradesmanController {

    @Autowired
    private TradesmanService tradesmanService;

    @GetMapping("/getOk")
    public String getOk(){
        return "ok";
    }

    @GetMapping("/allTradesmans")
    public ResponseEntity<List<Tradesman>> getAllUsers(){
        List<Tradesman> tradesman = null;
        try {
            tradesman = tradesmanService.getAllTradesman();
        }catch(Exception ex) {
            ex.getMessage();
        }
        return new ResponseEntity<List<Tradesman>>(tradesman, HttpStatus.OK);
    }


}
