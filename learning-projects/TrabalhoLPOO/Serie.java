package TrabalhoLPOO;

public class Serie extends ProducaoContinua {
	//Attributes
	/* Por ter todos os atributos definidos em ProducaoContinua, nao necessita de declaracao de atributos*/
	
	//Constructor - Builder
    protected Serie(Builder builder) {
        super(builder);
    }

    public static class Builder extends ProducaoContinua.Builder<Builder> {
    	//Polimorfismo Dinâmico
        protected Builder self() {
            return this;
        }

      //Polimorfismo Dinâmico
        public Serie build() {
            return new Serie(this);
        }
    }
    
    //Methods
    /* Por ter todos os atributos definidos em ProducaoContinua, nao necessita de getters e setters*/
    public String toString()
    {
    	StringBuilder sb = new StringBuilder();
    	sb.append("Serie { ");
    	sb.append("nome: ").append(getNome()).append("     ");
    	if (getAno() != 0) {
    		sb.append("ano: ").append(getAno()).append("   ");
    	}
    	if (getTemporadas() != 0) {
    		sb.append("temporadas: ").append(getAno()).append("   ");
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
        Serie other = (Serie) obj;
        return super.equals(obj);
    }
    public int hashCode() {
        return super.hashCode();
    }
}