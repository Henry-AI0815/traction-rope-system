package springcloud;

import common.LBRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@EnableDiscoveryClient
public class TractionRopeMsrcar9004 {
    public static void main(String[] args) {
        SpringApplication.run(TractionRopeMsrcar9004.class,args);
    }
    @Configuration
    @RibbonClient(name = "traction-rope-basic-parameter" ,configuration = {LBRule.class})
    public class GoodsRibbonConfig {
    }


}
