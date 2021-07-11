package com.project.constelacoes.Controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.constelacoes.Controller.Service.ServiceFatosCostelacao;
import com.project.constelacoes.Model.FatosCostelacao;

@RestController
@RequestMapping("/v1/api/fatosCostelacao")
public class ControllerFatosCostelacao {
	
   private ServiceFatosCostelacao serviceFatosCostelacao;	
	
   public ControllerFatosCostelacao(ServiceFatosCostelacao serviceFatosCostelacao) {
	   this.serviceFatosCostelacao = serviceFatosCostelacao;
   }
   
   @PostMapping
   public FatosCostelacao saveInfo(@RequestBody FatosCostelacao fatosCostelacao) {
	   return serviceFatosCostelacao.save(fatosCostelacao);
   }
   
   @GetMapping("/{id}")
   public Optional<FatosCostelacao> listId(@PathVariable Long id){
	   return serviceFatosCostelacao.list(id);
   }
   
   @PutMapping("/{id}")
   public void updateFatos(@PathVariable Long id, @RequestBody FatosCostelacao fatosCostelacao){
	    serviceFatosCostelacao.update(id, fatosCostelacao);
   }
   
}
