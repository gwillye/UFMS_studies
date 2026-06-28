package TrabalhoLPOO;

public abstract class ProducaoContinua extends AudioVisual {
	
	//Attributes
    protected String estudio;
    protected int temporadas;

    //Constructor - Builder
    protected ProducaoContinua(Builder<?> builder) {
        super(builder);
        this.estudio = builder.estudio;
        this.temporadas = builder.temporadas;
    }

    public static abstract class Builder<T extends Builder<T>> extends AudioVisual.Builder<T> {
        protected String estudio;
        protected int temporadas;

        public T estudio(String estudio) {
            this.estudio = estudio;
            return self();
        }

        public T temporadas(int temporadas) {
            this.temporadas = temporadas;
            return self();
        }

        protected abstract T self();

        public abstract ProducaoContinua build();
    }
    
    //Methods - Getters and Setters
    /* Por ser uma classe abstrata, nao necessita da implementacao do toString() */

    public String getEstudio() {
        return estudio;
    }

    public int getTemporadas() {
        return temporadas;
    }

	public void setEstudio(String estudio) {
		this.estudio = estudio;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

}