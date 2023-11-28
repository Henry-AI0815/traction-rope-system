package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetParaController {

    @Autowired
    private RestTemplate restTemplate;
    private Double Np;
    private Double Kp;
    private Double Nps;
    private Double Npr;
    private String result1;
    private String result2;
    private String result3;
    private int num=0;
    private String name="14";
    @GetMapping("/getNp")
    public String getNp() {
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
        result1=restTemplate.getForObject("http://drag-wheel-ratio-calculate"+ "/getKp?name="+name ,String.class);
        Kp=new Double(result1);
        result2=restTemplate.getForObject("http://drag-wheel-basic-parameter" + "/getNps?name="+name,String.class);
        Nps=new Double(result2);
        result3=restTemplate.getForObject("http://drag-wheel-basic-parameter" + "/getNpr?name="+name,String.class);
        Npr=new Double(result3);
        System.out.println(Kp);
        System.out.println(Nps);
        System.out.println(Npr);
        Np=Kp*(Nps+4*Npr);
        System.out.println("Np: "+Np);
        return Np+"";

    }
    @GetMapping("/test")
    public String test() throws InterruptedException {

        return "14";
    }


}
