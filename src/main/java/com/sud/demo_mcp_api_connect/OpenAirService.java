package com.sud.demo_mcp_api_connect;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class OpenAirService {

    private final OpenAirClient openAirClient;

    @Value("${com.sud.demo.mcp.openair.apiKey}")
    private String apiKey;

    public OpenAirService(OpenAirClient openAirClient)
    {
        this.openAirClient = openAirClient;
    }

    @Tool(name="getTestConnect",description = "test connectivity with open air mcp")
    public String getTestResult()
    {
        return (openAirClient.getAirQualityAtLocation(apiKey,8118l));
    }

}
