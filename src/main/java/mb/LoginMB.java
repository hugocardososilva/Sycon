package mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import dao.DAOFacade;

import model.Funcionario;
import model.Inquilino;
import model.Usuario;

@ManagedBean
@SessionScoped
public class LoginMB extends AbstractMB {
	
	private Usuario user;
	
	private String email;
	private String senha;
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String redirectAcesso(){
		FacesContext ctx= FacesContext.getCurrentInstance();
		HttpServletRequest req= (HttpServletRequest) ctx.getExternalContext().getRequest();
		Usuario usuario= (Usuario) req.getSession().getAttribute("user");
		System.out.println("classe do usuario  "+ usuario.getClass());
		if(user.getClass()== Funcionario.class){
			return "/protected/funcionario/index.xhtml";
		
			}else
				if(user.getClass()== Inquilino.class){
					return "/protected/inquilino/index.xhtml";
				
				}else{
					return "/login.xhtml";
				}
		
	
	}
	
	public String login(){
		DAOFacade dao= new DAOFacade();
		Usuario usuario= dao.isValidLogin(email, senha);
		if(usuario!= null){
			user = usuario;
			FacesContext ctx= FacesContext.getCurrentInstance();
			HttpServletRequest req= (HttpServletRequest) ctx.getExternalContext().getRequest();
			req.getSession().setAttribute("user", user);
			System.out.println(user.getClass() +  "  classe do tipo");
			
			if(user.getClass()== Funcionario.class){
				return "/protected/funcionario/index.xhtml";
			
				}else
					if(user.getClass()== Inquilino.class){
						return "/protected/inquilino/index.xhtml";
					}
			
		}
		displayErrorMessageToUser("Usuário ou senha inválidos");
		return null;
	}
	public String logout(){
		HttpServletRequest req=(HttpServletRequest) FacesContext.getCurrentInstance().getExternalContext().getRequest();
		req.getSession().invalidate();
		return "/login.xhtml";
	}
	

}
