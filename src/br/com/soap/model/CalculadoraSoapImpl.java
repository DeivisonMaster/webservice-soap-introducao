package br.com.soap.model;

import javax.jws.WebService;

@WebService(endpointInterface = "br.com.soap.model.CalculadoraSoap")
public class CalculadoraSoapImpl implements CalculadoraSoap{

	@Override
	public float soma(float n1, float n2) {
		return n1 + n2;
	}

	@Override
	public float subtracao(float n1, float n2) {
		return n1 - n2;
	}

	@Override
	public float multiplicacao(float n1, float n2) {
		return n1 * n2;
	}

	@Override
	public float divisao(float n1, float n2) {
		return n1 / n2;
	}
	
}
