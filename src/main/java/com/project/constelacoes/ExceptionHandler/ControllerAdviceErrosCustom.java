package com.project.constelacoes.ExceptionHandler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import com.project.constelacoes.Exceptions.NotValueDataCatalogacao;

@RestControllerAdvice
public class ControllerAdviceErrosCustom {
    
	@ExceptionHandler(NotValueDataCatalogacao.class)
	@ResponseStatus(value = HttpStatus.NOT_FOUND)
	public ErroResponse notValueDataCatalogacao(NotValueDataCatalogacao ex, WebRequest request) {
		 ErroResponse message = new ErroResponse(
			HttpStatus.NOT_FOUND.value(),
			new Date(),
			ex.getMessage(),
			request.getDescription(false));
		 
		 return message;
	}
	
	@ExceptionHandler(Exception.class)
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	public ErroResponse ErroResponse (Exception ex, WebRequest request) {
		ErroResponse erroGlobal = new ErroResponse(
				
				HttpStatus.INTERNAL_SERVER_ERROR.value(),
				new Date(),
				ex.getMessage(),
				request.getDescription(false));
		
		return erroGlobal;
	}
	
}
