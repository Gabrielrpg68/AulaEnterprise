package br.com.fiap.aplication;

import java.math.BigDecimal;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.dominio.Veiculo;

public class Programa {

	public static void main(String[] args) {
		
		EntityManager em = Persistence.createEntityManagerFactory("loja-veiculo").createEntityManager();
		
		Veiculo veiculo1 = new Veiculo("Honda", "Civic", 2020, 2020,new BigDecimal(90500)); 
		
		em.persist(veiculo1);
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		System.out.println("pronto");
		em.close();
		
	}

}
