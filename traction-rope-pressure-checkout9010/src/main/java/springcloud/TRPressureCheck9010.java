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
public class TRPressureCheck9010 {
    public static void main(String[] args) {

//        try {
//            Thread.sleep(10);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        SpringApplication.run(TRPressureCheck9010.class, args);
    }

    @Configuration
    @RibbonClients(
            {@RibbonClient(name = "traction-rope-p2-calculate" ,configuration = {LBRule.class}),
                    @RibbonClient(name = "traction-rope-pv1-calculate" ,configuration = {LBRule.class}),
                        @RibbonClient(name = "traction-rope-pu1-calculate" ,configuration = {LBRule.class})
            }
    )
    public class GoodsRibbonConfig {
    }


}
