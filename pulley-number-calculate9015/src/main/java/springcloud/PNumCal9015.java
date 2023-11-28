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
public class PNumCal9015 {
    public static void main(String[] args) {

//        try {
//            Thread.sleep(10);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        SpringApplication.run(PNumCal9015.class,args);
    }
    @Configuration
    @RibbonClients(
            {@RibbonClient(name = "guide-wheel-number-calculate" ,configuration = {LBRule.class}),
                    @RibbonClient(name = "drag-wheel-number-calculate" ,configuration = {LBRule.class})
            }
    )
    public class GoodsRibbonConfig {
    }
}
