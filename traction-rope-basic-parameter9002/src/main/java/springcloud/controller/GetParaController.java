package springcloud.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RefreshScope
public class GetParaController{

    private long time=0;
//    private int num1=0,num2=0,num3=0;

    @Autowired
    private RestTemplate restTemplate;

    private String Type;
    private String result;
//    private int num=0;
    private String name="2";

    @GetMapping("/getd")
    public String getd() {
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

//        if(++num1>74){  try {
//            Thread.sleep(3);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }}
        result=restTemplate.getForObject("http://traction-rope-type" + "/getType?name="+name,String.class);
        Type = new String(result);
        Double d = 0.01;
        System.out.println("d: " + d);
        return d + "";
    }

    @GetMapping("/getqs")
    public String getqs() {
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

//        if(++num2>74){  try {
//            Thread.sleep(3);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }}
        result=restTemplate.getForObject("http://traction-rope-type" + "/getType?name="+name,String.class);
        Type = new String(result);
        Double qs = 1000.0;
        System.out.println("qs: " + qs);
        return qs + "";
    }

    @GetMapping("/getTs")
    public String getTs() {
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

//        if(++num3>74){  try {
//            Thread.sleep(3);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }}
        result=restTemplate.getForObject("http://traction-rope-type" + "/getType?name="+name,String.class);
        Type = new String(result);
        Double Ts = 100.0;
        System.out.println("Ts: " + Ts);
        return Ts + "";
    }

    @GetMapping("/test")
    public String test() {
        return "2";
    }


}
