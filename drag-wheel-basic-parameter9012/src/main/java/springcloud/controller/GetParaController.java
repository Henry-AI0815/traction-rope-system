package springcloud.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetParaController {


    private long time=100;
    @GetMapping("/getNps")
    public String getNps() {
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Double Nps = 1.0;
        System.out.println("Nps: " + Nps);
        return Nps + "";
    }

    @GetMapping("/getNpr")
    public String getNpr() {
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Double Npr = 1.0;
        System.out.println("Npr: " + Npr);
        return Npr + "";
    }

    @GetMapping("/getDp")
    public String getDp() {
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Double Dp = 1.0;
        System.out.println("Dp: " + Dp);
        return Dp + "";
    }

    @GetMapping("/getD2")
    public String getD2() {
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Double D2 = 1.0;
        System.out.println("D2: " + D2);
        return D2 + "";
    }

    @GetMapping("/getLbj")
    public String getLbj() {
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Double Lbj = 1.0;
        System.out.println("Lbj: " + Lbj);
        return Lbj + "";
    }

    @GetMapping("/getHbj")
    public String getHbj() {
        try {
            Thread.sleep(time);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Double Hbj = 1.0;
        System.out.println("Hbj: " + Hbj);
        return Hbj + "";
    }




    @GetMapping("/test")
    public String test() throws InterruptedException {

        return "12";
    }


}
