package springcloud.controller;


import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class GetParaController{

    private long time=100;
//    private int num1=0,num2=0,num3=0;


    @GetMapping("/getType")
    public String getType() {
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        String Type = "GB/T8903";
        System.out.println("Type: " + Type);
        return Type + "";
    }


    @GetMapping("/test")
    public String get() {
        return "1";
    }


}
