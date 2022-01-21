package com.starwars;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Yoda implements RequestHandler<String, String> {
        /*
          Method to handle AWS Lambda requests
        */
        @Override
        //     return-type  method-name(object-with-request-data, aws-lambda-context-object)
        public String  handleRequest(String a,  Context context) {
                // an aws-lambda-context-object supplies methods and properties that provide
                //    information about the invocation, function, and execution environment.

                System.out.println("Patience you must have my young Padawan");

                return "Do or do not. There is no try";
        }
}
