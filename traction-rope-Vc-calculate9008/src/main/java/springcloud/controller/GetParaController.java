package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetParaController {


    @GetMapping("/getVc")
    public String getVc() {
//        if(++num>74){  try {
//            Thread.sleep(3);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }}

        try {
            Thread.sleep(0);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Double Vc;
        Double r = 0.001;
        Double V = 1.0;
        Vc=r*V;
        System.out.println("Vc: "+Vc);
        return Vc+"";

    }
    @GetMapping("/test")
    public String test() throws InterruptedException {

        return "8";
    }


}
