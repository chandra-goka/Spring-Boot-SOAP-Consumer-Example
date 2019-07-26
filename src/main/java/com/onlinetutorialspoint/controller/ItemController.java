package com.onlinetutorialspoint.controller;

import com.onlinetutorialspoint.client.SoapClient;
import com.onlinetutorialspoint.soap.bindings.ItemRequest;
import com.onlinetutorialspoint.soap.bindings.ItemResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    @Autowired
    SoapClient soapClient;

    @PostMapping("/item")
    public ItemResponse item(@RequestBody ItemRequest itemRequest){
        return soapClient.getItemInfo(itemRequest);
    }
}
