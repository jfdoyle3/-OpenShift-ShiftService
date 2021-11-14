package com.ems.timeShift;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.body.Body;
import org.json.JSONArray;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) throws UnirestException {

        Long id = null;
        final HttpResponse<String> jsonStringResponse = Unirest.get("http://localhost:8080/api/employees/name/Jim").queryString("id", id).asString();

        String json = jsonStringResponse.getBody();
        JSONArray jsonEmployee = new JSONArray(json);
        JSONObject key = (JSONObject) jsonEmployee.get(0);

        Object empId = key.get("id");
        System.out.println(empId);

    }
}