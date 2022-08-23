package com.traveloka.jsonrpcjpapostgresclient;

import com.googlecode.jsonrpc4j.spring.rest.JsonRpcRestClient;
import com.traveloka.jsonrpcjpapostgresclient.model.User;
import org.springframework.web.bind.annotation.*;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/findById/{id}")
    public Object getUserById(@PathVariable Long id){
        try{
            URL url = new URL(getApiUrl());
            JsonRpcRestClient client = new JsonRpcRestClient(url);
            Map<String, Object> params = new HashMap<>();
            params.put("user_id", id);
            User result = client.invoke("findById", params, User.class);
            return result;
        } catch (Throwable t) {
            return String.valueOf(t);
        }
    }

    @GetMapping("/findAll")
    public Object getAllUser(){
        try {
            URL url = new URL(getApiUrl());
            JsonRpcRestClient client = new JsonRpcRestClient(url);
            Map<String, Object> params = new HashMap<>();
            params.put("user_id", 1);
            User result = client.invoke("findAll", params, User.class);
            return result;
        } catch (Throwable t) {
            return String.valueOf(t);
        }
    }

    @PostMapping("/create")
    public Object create(@RequestBody User request){
        try {
            URL url = new URL(getApiUrl());
            JsonRpcRestClient client = new JsonRpcRestClient(url);
            Map<String, Object> params = new HashMap<>();
            params.put("user", request);
            User result = client.invoke("create", params, User.class);
            return result;
        } catch (Throwable t) {
            return String.valueOf(t);
        }
    }

    @PutMapping("/update/{id}")
    public Object update(@PathVariable Long id, @RequestBody User request){
        try {
            URL url = new URL(getApiUrl());
            JsonRpcRestClient client = new JsonRpcRestClient(url);
            Map<String, Object> params = new HashMap<>();
            params.put("user_id", id);
            params.put("user", request);
            User result = client.invoke("update", params, User.class);
            return result;
        } catch (Throwable t) {
            return String.valueOf(t);
        }
    }

    private static String getApiUrl() {
        return "http://localhost:8081/api";
    }
}
