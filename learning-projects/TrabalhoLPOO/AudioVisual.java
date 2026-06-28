package TrabalhoLPOO;


public abstract class AudioVisual extends Midia {
	
	/*Estende os atributos de Midia apenas*/

    //Constructor - Builder
    protected AudioVisual(Builder<?> builder) {
        super(builder);
    }

    public static abstract class Builder<T extends Builder<T>> extends Midia.Builder<T> {

        protected abstract T self();

        public abstract AudioVisual build();
        
        /* Por ser uma classe abstrata, nao necessita da implementacao do toString() */
    }
}