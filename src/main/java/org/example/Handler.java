package org.example;


import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.util.Map;

public class Handler implements RequestHandler<Map<String, String>, String> {

    // Make sure that the Runtime settings are set correctly
    // 1.) Go to the "Code" tab on the lambda function dashboard
    // 2.) Go to "Edit runtime management configuration"
    // 3.) Set "Handler" to the entrypoint below (org.example.Handler::handleRequest)
    @Override
    public String handleRequest(Map<String, String> stringStringMap, Context context) {
        return "Hi from handleRequest!";
    }
}