import static java.lang.thread.sleep;

public class tugas_thread {

/*
Nama    : Junjun Junaedi
Nim     : 20190040028
Matkul  : Sistem Operasi
*/
    public static void main(String[] args) throws InterruptedException {
        for(int a = 1; a<=50; a++){
            Thread.sleep (1000);
            System.out.println ("Increment> " + a);
        }
        for(int b = 50; b>=1; b--){
            Thread.sleep (1000);
            System.out.println ("Decrement> " + b);
        }
    }
    
}
