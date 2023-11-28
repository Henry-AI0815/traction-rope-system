package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetParaController {

    @Autowired
    private RestTemplate restTemplate;
    private Double T;
    private Double Msrcar;

    private String result;

    private int num=0;
    private String name="5";
    @GetMapping("/getT")
    public String getT() {
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
        result=restTemplate.getForObject("http://traction-rope-Msrcar-calculate"+ "/getMsrcar?name="+name ,String.class);
        Msrcar=new Double(result);

        System.out.println(Msrcar);

        double P = 1;
        double Q = 1;
        double r = 1;
        double gn = 1;

        T=((P+Q)/r+Msrcar)*gn;
        System.out.println("T: "+T);
        return T+"";

    }
    @GetMapping("/test")
    public String test() throws InterruptedException {

        return "5";
    }


}
