package com.sud.demo_mcp_api_connect;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "openAirHolder",url = "https://api.openaq.org")
public interface OpenAirClient {

    @RequestMapping(method = RequestMethod.GET, value = "/v3/locations/{locationID}")
    String getAirQualityAtLocation(@RequestHeader("X-API-Key") String apiKey, @PathVariable("locationID") Long locationID);

}