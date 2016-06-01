package com.smartbrewed.utils;

import com.smartbrewed.testrail.APIClient;
import com.smartbrewed.testrail.APIException;
import lombok.Data;
import org.junit.runner.Description;
import org.junit.runner.notification.Failure;

import org.junit.runner.notification.RunListener;
import org.junit.runner.Result;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Data
public class SmartBrewedTestListener extends RunListener {
    private final Map<String, Object> results = new HashMap<>();
    private String suiteId;
    private String testId;
    private String testName;
    private APIClient client;
    private String comment = "";

    @Override
    public void testFailure(final Failure failure) {
        String[] message = failure.getMessage().split("\n");
        System.out.println(message[0]);
        results.put(failure.getDescription().getDisplayName(), "Failure - " + message[0]);
    }

    @Override
    public void testIgnored(final Description description) {
        results.put(description.getDisplayName(), "Ignored");
    }

    @Override
    public void testRunFinished(final Result testContext) {
        final Map<String, Object> data = new HashMap<>();
        int status = 1;

        for (Map.Entry<String, Object> result : results.entrySet()) {
            comment += result.getKey() + ": " + result.getValue() + "\n";

            if(result.getValue().toString().contains("Failure") && status != 5){
                status = 5;
            }
        }

        data.put("test_id", testId);
        data.put("status_id", status);
        data.put("comment", comment);
        data.put("elapsed", "30s");

        try {
            client.sendPost("add_result/" + testId, data);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (APIException e) {
            e.printStackTrace();
        }

        System.out.println("Done");
    }
}
