package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetParaController {

    @Autowired
    private RestTemplate restTemplate;
    private Double Ss;
    private Double Ts;
    private Double T;
    private Double d;
    private String result1;
    private String result2;
    private String result3;
    private int num=0;
    private String name="17";
    @GetMapping("/getSs")
    public String getSs() {
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
        result1=restTemplate.getForObject("http://traction-rope-T-calculate"+ "/getT?name="+name ,String.class);
        T=new Double(result1);
        result2=restTemplate.getForObject("http://traction-rope-basic-parameter" + "/getTs?name="+name,String.class);
        Ts=new Double(result2);
        result3=restTemplate.getForObject("http://traction-rope-basic-parameter" + "/getd?name="+name,String.class);
        d=new Double(result3);
        System.out.println(Ts);
        System.out.println(T);
        System.out.println(d);
        Ss=(d*d*Ts)/T;
        System.out.println("Ss: "+Ss);
        return Ss+"";

    }
    @GetMapping("/test")
    public String test() throws InterruptedException {

        return "17";
    }


}
