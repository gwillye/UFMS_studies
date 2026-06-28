package TrabalhoLPOO;

public abstract class ProducaoUnica extends AudioVisual {
	
	//Attributes
    protected int segundos;

    //Constructor - Builder
    protected ProducaoUnica(Builder<?> builder) {
        super(builder);
        this.segundos = builder.segundos;
    }

    public static abstract class Builder<T extends Builder<T>> extends AudioVisual.Builder<T> {
        protected int segundos;

        public T segundos(int segundos) {
            this.segundos = segundos;
            return self();
        }

        protected abstract T self();

        public abstract ProducaoUnica build();
    }
    
    //Methods - Getters and Setters
    /* Por ser uma classe abstrata, nao necessita da implementacao do toString() */
    public int getSegundos() {
        return segundos;
    }

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
}