package br.com.soap.cliente;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import br.com.soap.model.CalculadoraSoap;

public class ClienteCalculadora {
	public static void main(String[] args) throws MalformedURLException {
		
		URL url = new URL("http://172.17.204.6:8080/calculadoraWS?wsdl");
		QName qname = new QName("http://model.soap.com.br/", "CalculadoraSoapImplService");
		
		Service ws = Service.create(url, qname); // retorna objeto que pode invocar operações oferecidas pelo serviço (PortType)
		CalculadoraSoap calc = ws.getPort(CalculadoraSoap.class); // recupera PortType
		
		System.out.println("Soma (5+1): " + calc.soma(5, 1));
	}
}
