package aula25092023;

import java.util.List;

public interface IPessoa {
	public boolean salvaPessoa(Pessoa pessoa);
	public List<?> retornaListaPessoa();
	public boolean atualizaPessoa(Pessoa pessoa);
	public boolean deletaPessoa(int id);
}
