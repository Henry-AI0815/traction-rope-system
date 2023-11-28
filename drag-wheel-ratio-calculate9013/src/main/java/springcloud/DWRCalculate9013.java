package springcloud;

import common.LBRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableDiscoveryClient
public class DWRCalculate9013 {
    public static void main(String[] args) {

//        try {
//            Thread.sleep(10);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        SpringApplication.run(DWRCalculate9013.class,args);
    }
    @Configuration
    @RibbonClient(name = "drag-wheel-basic-parameter" ,configuration = {LBRule.class})
    public class GoodsRibbonConfig {
    }
}
