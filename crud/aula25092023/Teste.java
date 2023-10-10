package aula25092023;

public class Teste {

	public static void main(String[] args) {
		
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();
		PessoaFisicaController repPF = new PessoaFisicaController();
		PessoaJuridicaController repPJ = new PessoaJuridicaController();
		
		pf.setNome("teste pf");
		pf.setCpf(123123123);
		pj.setNome("teste pj");
		pj.setCnpj(123123123);
		
		if(repPF.salvaPessoa(pf)) {
			System.out.println("PF salva");
		}
		if(repPJ.salvaPessoa(pj)) {
			System.out.println("PJ salva");
		}	
		
		System.out.println("PF:" + repPF.retornaListaPessoa().get(0).getNome() +" - Cpf:" + repPF.retornaListaPessoa().get(0).getCpf());
		System.out.println("PJ:" + repPJ.retornaListaPessoa().get(0).getNome() +" - Cnpj:" + repPJ.retornaListaPessoa().get(0).getCnpj());

		pf.setNome("teste edicao pf");
		pf.setCpf(1111111111);
		pj.setNome("teste edicao pj");
		pj.setCnpj(1111111111);
		
		if(repPF.atualizaPessoa(pf)) {
			System.out.println("PF atualizada");
		}
		if(repPJ.atualizaPessoa(pj)) {
			System.out.println("PJ atualizada");
		}
		
		System.out.println("PF:" + repPF.retornaListaPessoa().get(0).getNome() +" - Cpf:" + repPF.retornaListaPessoa().get(0).getCpf());
		System.out.println("PJ:" + repPJ.retornaListaPessoa().get(0).getNome() +" - Cnpj:" + repPJ.retornaListaPessoa().get(0).getCnpj());
		
		if(repPF.deletaPessoa(pf.getCpf())) {
			System.out.println("PF deletada");
		}
		
		if(repPJ.deletaPessoa(pj.getCnpj())) {
			System.out.println("PJ deletada");
		}
		
	}

}
