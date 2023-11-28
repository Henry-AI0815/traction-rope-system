package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetParaController {

    @Autowired
    private RestTemplate restTemplate;
    private Double Kp;

    private Double Dp;
    private String result;

    private int num=0;
    private String name="13";
    @GetMapping("/getKp")
    public String getKp() {
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
        result=restTemplate.getForObject("http://drag-wheel-basic-parameter"+ "/getDp?name="+name ,String.class);
        Dp=new Double(result);
        System.out.println(Dp);
        Double D1 = 1.0;
        Kp=Math.pow((D1/Dp),4);
        System.out.println("Kp: "+Kp);
        return Kp+"";

    }
    @GetMapping("/test")
    public String test() throws InterruptedException {

        return "13";
    }


}
