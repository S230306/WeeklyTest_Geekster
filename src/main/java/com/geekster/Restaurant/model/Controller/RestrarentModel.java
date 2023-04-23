package com.geekster.Restaurant.model.Controller;

import org.json.JSONObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestrarentModel {
    @GetMapping(value="/Restra")
    public static String StudentputInfo(){
        return "This information about Restaurant";
    }
    @PostMapping(value="/Restra")
    public static String StudentSaveInfo(@RequestBody String requestData){
        JSONObject obj = new JSONObject(requestData);
        System.out.print(requestData);
        System.out.println(obj.getString("name of Restra"));
        System.out.println(obj.getInt("Benfit$"));
        System.out.println(obj.getString("OwnerName"));
        return "Saved"+requestData;
    }
}
