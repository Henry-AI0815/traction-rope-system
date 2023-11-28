package springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class WebController {
    @Autowired
    private RestTemplate restTemplate;
    private String result1;
    private String result2;
    private String result3;
    private String result4;
    private String result5;

    private String name="send-to-Accept26";
    @GetMapping("/go")
    public String get(){
        result1=restTemplate.getForObject("http://traction-rope-d-checkout" + "/Accept3?name="+name,String.class);
        result2=restTemplate.getForObject("http://traction-rope-Msrcwt-calculate" + "/getMsrcwt?name="+name,String.class);
        result3=restTemplate.getForObject("http://traction-rope-safe-checkout" + "/Accept4?name="+name,String.class);
        result4=restTemplate.getForObject("http://traction-rope-pressure-checkout" + "/Accept5?name="+name,String.class);
        result5=restTemplate.getForObject("http://traction-rope-Ms-calculate" + "/getMs?name="+name,String.class);
//        System.out.println(result);
//        result=restTemplate.getForObject("http://door-energy-checkout/test",String.class);
        return "7-26测试";
    }


    @GetMapping("/test")
    public String test(){


        return "result";
    }
}
