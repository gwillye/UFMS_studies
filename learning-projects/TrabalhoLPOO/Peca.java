package TrabalhoLPOO;

import java.util.Objects;

public class Peca extends ProducaoUnica {
	
	//Attributes
    protected String local;
    protected String data;

    //Constructor - Builder
    protected Peca(Builder builder) {
        super(builder);
        this.local = builder.local;
        this.data = builder.data;
    }

    public static class Builder extends ProducaoUnica.Builder<Builder> {
        private String local;
        private String data;

        public Builder local(String local) {
            this.local = local;
            return this;
        }

        public Builder data(String data) {
            this.data = data;
            return this;
        }

        protected Builder self() {
            return this;
        }

        public Peca build() {
            return new Peca(this);
        }
    }
    
    //Methods - Getters and Setters
    public String getLocal() {
        return local;
    }

    public String getData() {
        return data;
    }

    public void setLocal(String local) {
		this.local = local;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Peca: {");
    	sb.append("nome: ").append(getNome()).append("   ");
        if (getAno() != 0) {
            sb.append("ano: ").append(getAno()).append("   ");
        }
        if (getSegundos() != 0) {
            sb.append("duracao em segundos: ").append(getSegundos()).append("   ");
        }
        if (getLocal() != null) {
            sb.append("local: ").append(getLocal()).append("   ");
        }
        if (getData() != null) {
            sb.append("data: ").append(getData()).append("   ");
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
	    Peca other = (Peca) obj;
	    return super.equals(obj) &&
	           Objects.equals(local, other.local) &&
	           Objects.equals(data, other.data);
	}
	public int hashCode() {
	    return Objects.hash(super.hashCode(), local, data);
	}

}