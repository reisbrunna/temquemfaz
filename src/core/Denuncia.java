package core;

public class Denuncia {

	private enum Status;

	private String descricao;

	private Date data;

	private Usuario autorDenuncia;

	private String respostaModerador;

	private Status situacao;

	private DenunciaAnuncio denunciaAnuncio;

	private Usuario Autor;

	private Moderador moderador;

	/**
	 *  
	 */
	public Denuncia(String descricao, Usuario autorDenuncia) {

	}

	public void responder(String resposta) {

	}

	public void atualizarStatus(Status situacao) {

	}

}
