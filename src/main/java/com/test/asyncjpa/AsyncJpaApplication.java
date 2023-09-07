package com.test.asyncjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

@SpringBootApplication
public class AsyncJpaApplication {


	public static void main(String[] args) throws Exception {
		StreamLambdaHandler handler = new StreamLambdaHandler();
		InputStream targetStream = new ByteArrayInputStream(API_GATEWAY_EVENT.getBytes());
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		handler.handleRequest(targetStream, output, null);
		System.out.println("RESULT: " + output.toString(StandardCharsets.UTF_8));
	}

	static String API_GATEWAY_EVENT = "{\n"
			+ "    \"version\": \"1.0\",\n"
			+ "    \"resource\": \"$default\",\n"
			+ "    \"path\": \"/hello\",\n"
			+ "    \"httpMethod\": \"GET\",\n"
			+ "    \"headers\": {\n"
			+ "        \"Host\": \"i76bfh111.execute-api.eu-west-3.amazonaws.com\",\n"
			+ "        \"User-Agent\": \"curl/7.79.1\",\n"
			+ "        \"X-Amzn-Trace-Id\": \"Root=1-64087690-2151375b219d3ba3389ea84e\",\n"
			+ "        \"X-Forwarded-For\": \"109.210.252.44\",\n"
			+ "        \"X-Forwarded-Port\": \"443\",\n"
			+ "        \"X-Forwarded-Proto\": \"https\",\n"
			+ "        \"accept\": \"*/*\"\n"
			+ "    },\n"
			+ "    \"multiValueHeaders\": {\n"
			+ "        \"Host\": [\n"
			+ "            \"i76bfhczs0.execute-api.eu-west-3.amazonaws.com\"\n"
			+ "        ],\n"
			+ "        \"User-Agent\": [\n"
			+ "            \"curl/7.79.1\"\n"
			+ "        ],\n"
			+ "        \"X-Amzn-Trace-Id\": [\n"
			+ "            \"Root=1-64087690-2151375b219d3ba3389ea84e\"\n"
			+ "        ],\n"
			+ "        \"X-Forwarded-For\": [\n"
			+ "            \"109.210.252.44\"\n"
			+ "        ],\n"
			+ "        \"X-Forwarded-Port\": [\n"
			+ "            \"443\"\n"
			+ "        ],\n"
			+ "        \"X-Forwarded-Proto\": [\n"
			+ "            \"https\"\n"
			+ "        ],\n"
			+ "        \"accept\": [\n"
			+ "            \"*/*\"\n"
			+ "        ]\n"
			+ "    },\n"
			+ "    \"queryStringParameters\": {\n"
			+ "        \"abc\": \"xyz\",\n"
			+ "        \"foo\": \"baz\"\n"
			+ "    },\n"
			+ "    \"multiValueQueryStringParameters\": {\n"
			+ "        \"abc\": [\n"
			+ "            \"xyz\"\n"
			+ "        ],\n"
			+ "        \"foo\": [\n"
			+ "            \"bar\",\n"
			+ "            \"baz\"\n"
			+ "        ]\n"
			+ "    },\n"
			+ "    \"requestContext\": {\n"
			+ "        \"accountId\": \"123456789098\",\n"
			+ "        \"apiId\": \"i76bfhczs0\",\n"
			+ "        \"domainName\": \"i76bfhc111.execute-api.eu-west-3.amazonaws.com\",\n"
			+ "        \"domainPrefix\": \"i76bfhczs0\",\n"
			+ "        \"extendedRequestId\": \"Bdd2ngt5iGYEMIg=\",\n"
			+ "        \"httpMethod\": \"GET\",\n"
			+ "        \"identity\": {\n"
			+ "            \"accessKey\": null,\n"
			+ "            \"accountId\": null,\n"
			+ "            \"caller\": null,\n"
			+ "            \"cognitoAmr\": null,\n"
			+ "            \"cognitoAuthenticationProvider\": null,\n"
			+ "            \"cognitoAuthenticationType\": null,\n"
			+ "            \"cognitoIdentityId\": null,\n"
			+ "            \"cognitoIdentityPoolId\": null,\n"
			+ "            \"principalOrgId\": null,\n"
			+ "            \"sourceIp\": \"109.210.252.44\",\n"
			+ "            \"user\": null,\n"
			+ "            \"userAgent\": \"curl/7.79.1\",\n"
			+ "            \"userArn\": null\n"
			+ "        },\n"
			+ "        \"path\": \"/hello\",\n"
			+ "        \"protocol\": \"HTTP/1.1\",\n"
			+ "        \"requestId\": \"Bdd2ngt5iGYEMIg=\",\n"
			+ "        \"requestTime\": \"08/Mar/2023:11:50:40 +0000\",\n"
			+ "        \"requestTimeEpoch\": 1678276240455,\n"
			+ "        \"resourceId\": \"$default\",\n"
			+ "        \"resourcePath\": \"$default\",\n"
			+ "        \"stage\": \"$default\"\n"
			+ "    },\n"
			+ "    \"pathParameters\": null,\n"
			+ "    \"stageVariables\": null,\n"
			+ "    \"body\": null,\n"
			+ "    \"isBase64Encoded\": false\n"
			+ "}";


}
