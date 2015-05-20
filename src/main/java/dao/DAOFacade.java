package dao;

import javax.persistence.NoResultException;

import model.Usuario;

public class DAOFacade {
	private DAO dao= new DAO();
	private DAOObject daoo= new DAOObject();
	
	
	public DAOFacade() {
		
	}
	public void inserir(Object obj){
		
		try {
			daoo.open();
			daoo.begin();
			daoo.persist(obj);
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
//			daoo.commit();
//			daoo.close();
		}
	}
	public void atualizar(Object obj){
		
		try {
			daoo.open();
			daoo.begin();
			daoo.merge(obj);
			System.out.println("atualizou?");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
//			daoo.commit();
//			daoo.close();
		}
	}
	
	public void commit(){
		daoo.commit();
		
	}


	public DAOObject getDaoo() {
		return daoo;
	}


	public void setDaoo(DAOObject daoo) {
		this.daoo = daoo;
	}
	
	public Usuario isValidLogin(String email, String senha){
		DAOUser daou = new DAOUser();
		daoo.open();
		daoo.begin();
		try {
			Usuario u = daou.getByEmail(email);
			System.out.println(u.toString());
			daoo.close();
				if(u.getSenha()!=senha){
					return null;
				}
			return u;
			
		} catch (Exception e) {
			return null;
		}
		
		
		
	}
	
	
	
	

}
