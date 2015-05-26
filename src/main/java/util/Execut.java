package util;

import model.Funcionario;
import model.Usuario;
import dao.DAOUser;

public class Execut {
	public static void main(String[] args) {
		Usuario admin = new Funcionario();
		admin.setCpf("1234567890");
		admin.setEmail("hugocardososilva@gmail.com");
		admin.setSenha("admin");
		admin.setLogin("admin");
		admin.setNome("Administrador");
		admin.setSobrenome("admin");
		
		
		DAOUser daou= new DAOUser();
		
		daou.open();
		daou.begin();
		daou.persist(admin);
		daou.commit();
		
	}

}