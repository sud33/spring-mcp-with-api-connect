package com.sud.demo_mcp_api_connect;

import org.springframework.ai.support.ToolCallbacks;
import org.springframework.ai.tool.ToolCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class DemoMcpApiConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoMcpApiConnectApplication.class, args);
	}

	@Bean
	public List<ToolCallback> getTools(OpenAirService service)
	{
		return List.of(ToolCallbacks.from(service));
	}

}
