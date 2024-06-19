public class MultiWatek extends Thread {
//[extend Thread] Pozwala na stworzenie osobnych wątków
    public int startNumer;
    public int skoki;

    public MultiWatek(int startNumer, int skoki)
    {
        this.startNumer = startNumer;
        this.skoki = skoki;
    }
    @Override
    public void  run()
    {
        for (int i = startNumer; i<=20; i=i+skoki)
        {
            System.out.println(i);
        }
    }
}
