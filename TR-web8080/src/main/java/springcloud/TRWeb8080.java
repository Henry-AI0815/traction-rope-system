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

public class TRWeb8080 {
    public static void main(String[] args) {

//        try {
//            Thread.sleep(10);
//        }catch (InterruptedException e){
//            e.printStackTrace();
//        }

        SpringApplication.run(TRWeb8080.class, args);
    }

    @Configuration
    @RibbonClients(
            {@RibbonClient(name = "traction-rope-d-checkout" ,configuration = {LBRule.class}),
                    @RibbonClient(name = "traction-rope-Msrcwt-calculate" ,configuration = {LBRule.class}),
                    @RibbonClient(name = "traction-rope-safe-checkout" ,configuration = {LBRule.class}),
                    @RibbonClient(name = "traction-rope-pressure-checkout" ,configuration = {LBRule.class}),
                    @RibbonClient(name = "traction-rope-Ms-calculate" ,configuration = {LBRule.class}),
            }
    )
    public class TestConfiguration {
    }
}
