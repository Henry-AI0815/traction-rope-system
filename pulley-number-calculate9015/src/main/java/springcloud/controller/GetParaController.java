package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetParaController {

    @Autowired
    private RestTemplate restTemplate;
    private Double N;
    private Double Np;
    private Double Nt;
    private String result1;
    private String result2;
    private int num=0;
    private String name="15";
    @GetMapping("/getN")
    public String getN() {
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
        result1=restTemplate.getForObject("http://guide-wheel-number-calculate"+ "/getNp?name="+name ,String.class);
        Np=new Double(result1);
        result2=restTemplate.getForObject("http://drag-wheel-number-calculate" + "/getNt?name="+name,String.class);
        Nt=new Double(result2);
        System.out.println(Nt);
        System.out.println(Np);
        N=Np+Nt;
        System.out.println("N: "+N);
        return N+"";

    }
    @GetMapping("/test")
    public String test() throws InterruptedException {

        return "15";
    }


}
