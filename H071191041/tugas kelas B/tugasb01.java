import java.util.Scanner;
class tugasb01{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long base = in.nextInt();
        long pangkat = in.nextInt();
        long hasil = in.nextInt();
        for ( int a =1; a <= pangkat; a++){
            hasil = hasil*base;
        }
        System.out.printf("%d'%s = %d" ,base,pangkat,hasil);
    }
}