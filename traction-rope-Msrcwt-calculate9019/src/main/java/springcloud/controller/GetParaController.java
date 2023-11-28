package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetParaController {

    @Autowired
    private RestTemplate restTemplate;
    private Double Msrcwt;
    private Double d;
    private Double qs;

    private String result1;
    private String result2;
    private double H = 10.0;

    private int num=0;
    private String name="19";
    @GetMapping("/getMsrcwt")
    public String getMsrcwt() {
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
        result1 = restTemplate.getForObject("http://traction-rope-basic-parameter" + "/getd?name=" + name, String.class);
        d = new Double(result1);
        result2 = restTemplate.getForObject("http://traction-rope-basic-parameter" + "/getqs?name=" + name, String.class);
        qs = new Double(result2);

        System.out.println(d);
        System.out.println(qs);
        Msrcwt=d * d * qs * H;
        System.out.println("Msrcwt: "+Msrcwt);
        return Msrcwt+"";

    }
    @GetMapping("/test")
    public String test() throws InterruptedException {

        return "19";
    }


}
