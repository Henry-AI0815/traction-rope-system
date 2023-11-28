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
public class TRSfCal9016 {
    public static void main(String[] args) {

//        try {
//            Thread.sleep(10);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        SpringApplication.run(TRSfCal9016.class,args);
    }
    @Configuration
    @RibbonClients(
            {@RibbonClient(name = "pulley-number-calculate" ,configuration = {LBRule.class}),
                    @RibbonClient(name = "traction-rope-basic-parameter" ,configuration = {LBRule.class})
            }
    )
    public class GoodsRibbonConfig {
    }
}
