package TrabalhoLPOO;

public abstract class Midia {
	//Attributes
    protected String nome;
    protected int ano;

    //Constructor - Builder
    protected Midia(Builder<?> builder) {
        this.nome = builder.nome;
        this.ano = builder.ano;
    }

    public static abstract class Builder<T extends Builder<T>> {
        protected String nome;
        protected int ano;

        public T nome(String nome) {
            this.nome = nome;
            return self();
        }

        public T ano(int ano) {
            this.ano = ano;
            return self();
        }

        protected abstract T self();

        public abstract Midia build();
    }
    
    //Methods - Getters and Setters
    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
    
	public abstract String toString();
	
	//Method - Equals
	public boolean equals(Object obj) {
	    if (this == obj)
	        return true;
	    if (obj == null || getClass() != obj.getClass())
	        return false;
	    Midia midia = (Midia) obj;
	    if (!nome.equals(midia.nome))
	        return false;
	    if (ano != midia.ano)
	        return false;
	    return true;
	}
	
	public int hashCode() {
	    int result = nome.hashCode();
	    result = 31 * result + ano;
	    return result;
	}

}