package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetAccept4Controller {


    @Autowired
    private RestTemplate restTemplate;
    private String result1;
    private String result2;
    private Double S;
    private Double Ss;
    private Double Sf;
    private boolean flag;
    private int num=0;
    private String name="18";


    @GetMapping("/Accept4")
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


        result1=restTemplate.getForObject("http://traction-rope-Ss-calculate" + "/getSs?name="+name,String.class);
        Ss=new Double(result1);
        result2=restTemplate.getForObject("http://traction-rope-Sf-calculate" + "/getSf?name="+name,String.class);
        Sf=new Double(result2);
        System.out.println(Ss);
        System.out.println(Sf);
        flag=Ss>=Sf;
        System.out.println("Accept4: "+flag);
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

        return "test2";
//        return "  "+result2+"   "+result3;
    }
}
