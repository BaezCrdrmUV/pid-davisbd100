
public class proyecto{
    public static void main(String[] args) {
        ProcessBuilder process = new ProcessBuilder("Notepad.exe");
        System.out.println("El id del Notepad" + process.toString());
        try {
            Process pro = process.start();
            System.out.println("PID: "+ pro.pid());
            Thread.sleep(10000);
            pro.destroy();
        }catch (Exception exception){

        }
    }
}