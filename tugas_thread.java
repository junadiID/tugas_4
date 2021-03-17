import static java.lang.thread.sleep;

public class tugas_thread {

/*
Nama    : Junjun Junaedi
Nim     : 20190040028
Matkul  : Sistem Operasi
*/
    public static void main(String[] args) throws InterruptedException {
        for(int i = 1; i<=50; i++){
            Thread.sleep (1000);
            System.out.println (i);
        }
        for(int j = 49; j>=1; j--){
            Thread.sleep (1000);
            System.out.println (j);
        }
    }
    
}
