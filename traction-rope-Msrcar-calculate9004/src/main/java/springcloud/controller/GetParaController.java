package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetParaController {


    @Autowired
    private RestTemplate restTemplate;
    private Double Msrcar;
    private Double d;
    private Double qs;
    private String result1;
    private String result2;
    private double H = 20.0;
    private String name="4";
    @GetMapping("/getMsrcar")
    public String getMsrcar() {
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
        System.out.println(qs);
        System.out.println(d);
        Msrcar = d * d * qs * H;
        System.out.println("Msrcar: " + Msrcar);
        return Msrcar + "";
    }


    @GetMapping("/test")
    public String test() throws InterruptedException {
        Thread.sleep(0);
        return "4";
    }
}
