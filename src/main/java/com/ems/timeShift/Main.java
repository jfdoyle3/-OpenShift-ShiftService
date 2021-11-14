package com.ems.timeShift;


import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mashape.unirest.request.GetRequest;
import com.mashape.unirest.request.body.Body;
import org.json.JSONArray;

public class Main {
    public static void main(String[] args) throws UnirestException {

        final HttpResponse<JsonNode> jsonStringResponse = Unirest.get("http://localhost:8080/api/employees").asJson();

        System.out.println(jsonStringResponse);;

    }
}