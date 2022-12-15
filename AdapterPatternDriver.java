public class AdapterPatternDriver {
    
    public static void main(String args[]) {
    	Length menaraKembar = new MenaraKembar();
    	LengthAdapter menaraKembarAdapter = new LengthAdapterImpl(menaraKembar);
        System.out.println("Menara Kembar memiliki tinggi " + menaraKembarAdapter.getLength() + " hm.");

        Length monas = new Monas();
        LengthAdapter monasAdapter = new LengthAdapterImpl(monas);
        System.out.println("Monas memiliki tinggi " + monasAdapter.getLength() + " hm.");

        Length menaraeiffel = new MenaraEiffel();
        LengthAdapter menaraEiffelAdapter = new LengthAdapterImpl(menaraeiffel);
        System.out.println("Menara Eiffel memiliki tinggi " + menaraEiffelAdapter.getLength() + " hm.");
    }
}
