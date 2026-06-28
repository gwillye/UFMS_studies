package TrabalhoLPOO;

import java.util.Objects;

public class Filme extends ProducaoUnica {
	
	//Attributes
    protected String estudio;

    
    //Constructor - Builder
    protected Filme(Builder builder) {
        super(builder);
        this.estudio = builder.estudio;
    }


    public static class Builder extends ProducaoUnica.Builder<Builder> {
        private String estudio;

        public Builder estudio(String estudio) {
            this.estudio = estudio;
            return this;
        }

        protected Builder self() {
            return this;
        }

        public Filme build() {
            return new Filme(this);
        }
    }
    
    //Methods - Getters and Setters
	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}
	
    public String getEstudio() {
        return estudio;
    }
    
    public String toString() {
    	StringBuilder sb = new StringBuilder();
    	sb.append("Filme {");
    	sb.append("nome: ").append(getNome()).append("   ");
        if (getAno() != 0) {
            sb.append("ano: ").append(getAno()).append("   ");
        }
        if (getSegundos() != 0) {
            sb.append("duracao em segundos: ").append(getSegundos()).append("   ");
        }
        if (getEstudio() != null) {
            sb.append("estudio: ").append(getEstudio()).append("   ");
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
        Filme other = (Filme) obj;
        return super.equals(obj) &&
               Objects.equals(estudio, other.estudio);
    }
    
    public int hashCode() {
        return Objects.hash(super.hashCode(), estudio);
    }


}