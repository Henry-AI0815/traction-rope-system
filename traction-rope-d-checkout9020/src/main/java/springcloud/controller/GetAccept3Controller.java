package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class GetAccept3Controller {


    @Autowired
    private RestTemplate restTemplate;
    private String result;
    private Double d;
    private Double D1 = 1.0;
    private boolean flag;
    private int num=0;
    private String name="20";
    @GetMapping("/Accept3")
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
        result=restTemplate.getForObject("http://traction-rope-basic-parameter" + "/getd?name="+name,String.class);
        d=new Double(result);
        flag=D1/d>=40;
        System.out.println("Accept3: "+flag);

        return flag+"";
    }
    @GetMapping("/test")
    public String test() {
        return "test3";
    }
}
