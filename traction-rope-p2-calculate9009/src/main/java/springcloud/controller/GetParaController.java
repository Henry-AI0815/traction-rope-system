package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetParaController {

    @Autowired
    private RestTemplate restTemplate;
    private Double p2;
    private Double Vc;

    private String result;

    private int num=0;
    private String name="9";
    @GetMapping("/getp2")
    public String getp2() {
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
        result=restTemplate.getForObject("http://traction-rope-Vc-calculate"+ "/getVc?name="+name ,String.class);
        Vc=new Double(result);
        System.out.println(Vc);
        p2=(12.5+4*Vc)/(1+Vc);
        System.out.println("p2: "+p2);
        return p2+"";

    }
    @GetMapping("/test")
    public String test() throws InterruptedException {

        return "9";
    }


}
