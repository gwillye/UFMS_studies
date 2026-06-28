package TrabalhoLPOO;

import java.util.Objects;

public class Livro extends Midia {
	
	//Attributes
    protected String autor;
    protected int paginas;
    protected String editora;
    protected int edicao;
    protected String isbn;
    protected int ano;

    //Constructor - Builder
    protected Livro(Builder builder) {
        super(builder);
        this.autor = builder.autor;
        this.paginas = builder.paginas;
        this.editora = builder.editora;
        this.edicao = builder.edicao;
        this.isbn = builder.isbn;
        this.ano = builder.ano;
    }
    
    public static class Builder extends Midia.Builder<Builder> {
        private String autor;
        private int paginas;
        private String editora;
        private int edicao;
        private String isbn;
        private int ano; // Novo campo para o ano

        public Builder autor(String autor) {
            this.autor = autor;
            return this;
        }

        public Builder paginas(int paginas) {
            this.paginas = paginas;
            return this;
        }

        public Builder editora(String editora) {
            this.editora = editora;
            return this;
        }

        public Builder edicao(int edicao) {
            this.edicao = edicao;
            return this;
        }

        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder ano(int ano) {
            this.ano = ano;
            return this;
        }

        protected Builder self() {
            return this;
        }

        public Livro build() {
            return new Livro(this);
        }
    }


	//Methods - Getters and Setters
	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public int getEdicao() {
		return edicao;
	}

	public void setEdicao(int edicao) {
		this.edicao = edicao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("Livro {");
    	sb.append("nome: ").append(getNome()).append("   ");
    	sb.append("autor: ").append(getAutor()).append("   ");
        if (getAno() != 0) {
            sb.append("ano: ").append(getAno()).append("   ");
        }
        if (getPaginas() != 0) {
            sb.append("numero de paginas: ").append(getPaginas()).append("   ");
        }
        if (getEditora() != null) {
            sb.append("editora: ").append(getEditora()).append("   ");
        }
        if (getEdicao() != 0) {
            sb.append("edicao: ").append(getEdicao()).append("   ");
        }
        if (getIsbn() != null) {
            sb.append("ISBN: ").append(getIsbn()).append("   ");
        }
    	sb.append("}");
    	return sb.toString();
    	}
	
	
	//Methods - Equals
	public boolean equals(Object obj) {
	    if (this == obj) {
	        return true;
	    }
	    if (obj == null || getClass() != obj.getClass()) {
	        return false;
	    }
	    Livro other = (Livro) obj;
	    return super.equals(obj) &&
	           Objects.equals(autor, other.autor) &&
	           paginas == other.paginas &&
	           Objects.equals(editora, other.editora) &&
	           edicao == other.edicao &&
	           Objects.equals(isbn, other.isbn) &&
	           ano == other.ano;
	}
	
	public int hashCode() {
	    return Objects.hash(super.hashCode(), autor, paginas, editora, edicao, isbn, ano);
	}
	
	

}