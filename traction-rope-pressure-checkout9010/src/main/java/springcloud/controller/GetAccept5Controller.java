package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetAccept5Controller {


    @Autowired
    private RestTemplate restTemplate;
    private String result1;
    private String result2;
    private String result3;
    private Double p2;
    private Double pu1;
    private Double pv1;
    private boolean flag;
    private int num=0;
    private String name="10";


    @GetMapping("/Accept5")
    public String getAccept() {
//        if(++num>74){  try {
//            Thread.sleep(6);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }}

        try {
            Thread.sleep(0);
        }catch (InterruptedException e){
            e.printStackTrace();
        }


        result1=restTemplate.getForObject("http://traction-rope-p2-calculate" + "/getp2?name="+name,String.class);
        p2=new Double(result1);
        result2=restTemplate.getForObject("http://traction-rope-pv1-calculate" + "/getpv1?name="+name,String.class);
        pv1=new Double(result2);
        result3=restTemplate.getForObject("http://traction-rope-pu1-calculate" + "/getpu1?name="+name,String.class);
        pu1=new Double(result3);
        System.out.println(p2);
        System.out.println(pv1);
        System.out.println(pu1);
        flag=(pu1+pv1)/2<=p2;
        System.out.println("Accept5: "+flag);
        return flag+"";
    }
    @GetMapping("/test")
    public String test() throws InterruptedException {
//        String result1=restTemplate.getForObject("http://door-energy-calculate" + "/test?name="+name,String.class);
//        String result2=restTemplate.getForObject("http://door-section-calculate" + "/test?name="+name,String.class);
//        String result3=restTemplate.getForObject("http://door-speed-calculate" + "/test?name="+name,String.class);
//
//        System.out.println("  "+result2+"   "+result3);

//       Thread.sleep(20);

        return "test1";
//        return "  "+result2+"   "+result3;
    }
}
