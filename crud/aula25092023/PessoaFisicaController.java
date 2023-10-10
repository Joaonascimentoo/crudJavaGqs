/**
 * 
 */
package aula25092023;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class PessoaFisicaController implements IPessoa {

	/**
	 * 
	 */
	
	List<PessoaFisica> listaPF = new ArrayList<PessoaFisica>();

	public PessoaFisicaController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean salvaPessoa(Pessoa pessoa) {
		boolean ok;
		
		PessoaFisica pf = (PessoaFisica) pessoa;
				
		try {
			ok=listaPF.add(pf);
		} catch (Exception e) {
			ok=false;
		}
		return ok;
	}

	@Override
	public List<PessoaFisica> retornaListaPessoa() {
		// TODO Auto-generated method stub
		return listaPF;
	}

	@Override
	public boolean atualizaPessoa(Pessoa pessoa) {
		boolean ok = false;
		
		PessoaFisica pf = (PessoaFisica) pessoa;

		try {
			for(int i =0; i < retornaListaPessoa().size(); i++) {
				if(retornaListaPessoa().get(i).getNome().equalsIgnoreCase(pf.getNome())) {
					retornaListaPessoa().get(i).setNome(pf.getNome());
					retornaListaPessoa().get(i).setCpf(pf.getCpf());
					ok=true;
				}
			}	
		} catch(Exception e) {
			ok=false;
		}
	
		return ok;
	}

	@Override
	public boolean deletaPessoa(int cpf) {
		boolean ok = false;
		try {
			for(int i =0; i < retornaListaPessoa().size(); i++) {
				if(retornaListaPessoa().get(i).getCpf()==cpf){
					retornaListaPessoa().remove(i);
					ok=true;
				}
			}	
		} catch(Exception e) {
			ok=false;
		}
	
		return ok;
	}

}
