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

public class TRSafeCheck9018 {
    public static void main(String[] args) {

//        try {
//            Thread.sleep(10);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        SpringApplication.run(TRSafeCheck9018.class, args);
    }

    @Configuration
    @RibbonClients(
            {@RibbonClient(name = "traction-rope-Ss-calculate" ,configuration = {LBRule.class}),
                    @RibbonClient(name = "traction-rope-Sf-calculate" ,configuration = {LBRule.class})
            }
    )
    public class GoodsRibbonConfig {
    }


}
