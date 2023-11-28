package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetParaController {


    @GetMapping("/getNt")
    public String getNt() {
        try {
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Double Nt = 10.0;
        System.out.println("Nt: " + Nt);
        return Nt + "";
    }





    @GetMapping("/test")
    public String test() throws InterruptedException {

        return "11";
    }


}
