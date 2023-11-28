package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetParaController {

    @Autowired
    private RestTemplate restTemplate;
    private Double Sf;
    private Double N;
    private Double d;
    private String result1;
    private String result2;
    private int num=0;
    private String name="16";
    @GetMapping("/getSf")
    public String getSf() {
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
        result1=restTemplate.getForObject("http://pulley-number-calculate"+ "/getN?name="+name ,String.class);
        N=new Double(result1);
        result2=restTemplate.getForObject("http://traction-rope-basic-parameter" + "/getd?name="+name,String.class);
        d=new Double(result2);
        System.out.println(d);
        System.out.println(N);
        Sf=Math.pow(10,(2.6834-N));
        System.out.println("Sf: "+Sf);
        return Sf+"";

    }
    @GetMapping("/test")
    public String test() throws InterruptedException {

        return "16";
    }


}
