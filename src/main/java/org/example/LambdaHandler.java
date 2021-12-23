package org.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaHandler implements RequestHandler<Object, Object> {

    /**
     * Handles a Lambda Function request
     *
     * @param input   The Lambda Function input
     * @param context The Lambda execution environment context object.
     * @return The Lambda Function output
     */
    @Override
    public Object handleRequest(Object input, Context context) {
        context.getLogger().log("You provided: " + input);
        System.out.println("\n\n\nMore to come");
        return "Hello World";
    }
}
