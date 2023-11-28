package springcloud;

import common.LBRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableDiscoveryClient
public class TractionRopeBasic9002 {
    public static void main(String[] args) {

//        try {
//            Thread.sleep(10);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        SpringApplication.run(TractionRopeBasic9002.class,args);
    }
    @Configuration
    @RibbonClient(name = "traction-rope-type" ,configuration = {LBRule.class})
    public class GoodsRibbonConfig {
    }
//    @Configuration
//    @RibbonClient(name = "door-energy-calculate" ,configuration = {RandRule.class})
//    public class GoodsRibbonConfig {
//    }


}
