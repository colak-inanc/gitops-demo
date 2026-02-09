package com.colak.gitopsdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.net.UnknownHostException;
import java.net.InetAddress;

@RestController
public class Controller {

    @GetMapping("/")
    public String index() throws UnknownHostException {
        String podName = InetAddress.getLocalHost().getHostName();
        return "<html><body style='text-align:center; font-family:sans-serif; background-color: #f4f4f4;'>" +
                "<h1>Repo Server Sorunu Çözüldü! Sistem Canavar Gibi Çalışıyor!</h1>" +
                "<p>Bu yanıt şu Pod'dan geliyor: <strong>" + podName + "</strong></p>" +
                "<div style='margin-top:20px; padding:10px; border:2px solid #2ecc71; display:inline-block;'>" +
                "Versiyon: <b>v2.0.0</b></div>" +
                "</body></html>";
    }
}
