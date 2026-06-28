package TrabalhoLPOO;

public class Anime extends ProducaoContinua {
	
	//Attributes
	/* Por ter todos os atributos definidos em ProducaoContinua, nao necessita de declaracao de atributos*/
	
	//Constructor
    protected Anime(Builder builder) {
        super(builder);
    }

    public static class Builder extends ProducaoContinua.Builder<Builder> {

        protected Builder self() {
            return this;
        }
        
        public Anime build() {
            return new Anime(this);
        }
    }
    
    //Methods
    /* Por ter todos os atributos definidos em ProducaoContinua, nao necessita de getters e setters*/
    public String toString()
    {
    	StringBuilder sb = new StringBuilder();
    	sb.append("Anime { ");
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
        Anime other = (Anime) obj;
        return super.equals(obj);
    }
    public int hashCode() {
        return super.hashCode();
    }


}