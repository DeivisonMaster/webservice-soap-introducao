package br.com.soap.model;

import javax.xml.ws.Endpoint;

public class ExecutaWS {
	public static void main(String[] args) {
		
		Endpoint.publish("http://172.17.204.6:8080/calculadoraWS", new CalculadoraSoapImpl());
	}
}
