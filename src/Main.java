//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception{
        int count = 100_000;

        long start = System.nanoTime();
        SimpleLogger.writePlain(count);
        long plainMs = (System.nanoTime() - start) / 1_000_000;

        start = System.nanoTime();
        SimpleLogger.writeBuffered(count);
        long bufferedMs = (System.nanoTime() - start) / 1_000_000;

        System.out.println("FileOutputStream: " + plainMs + " ms");
        System.out.println("BufferedOutputStream: " + bufferedMs + " ms");





        }
    }
