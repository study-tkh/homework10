import java.util.Scanner;
public class Main {
    static void Task7_133() {
        Scanner in = new Scanner(System.in);
        int max = 0, i = 0, c = 1, a = 0;
        boolean v;
        System.out.println("Введите число");
        while (in.hasNextInt()) {
            a = in.nextInt();
            if (a > max) {
                max = a;
                i = 0;
            }
            if (a == max) i++;
            System.out.println("Количество максимальных элементов = " + i);
            System.out.println("Введите число");
        }
        System.out.println(i);
    }

    static void Task7_135() {
        double a = 0, sz = 0, sum = 0;
        int c = 1, sch = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNextDouble()) {
            System.out.println("Введите число");
            a = in.nextDouble();
            sum = sum + a;
            sch++;
            sz = sum/sch;
            System.out.println("Среднее значение =" + sz);
        }
        System.out.println("Среднее значение = " + sz);
    }

    static void Task7_136() {
        Scanner in = new Scanner(System.in);
        int max = 1, podr = 0, c = 1, i = 0, a = 0, b = 0, sch = 0;
        System.out.println("Введите число");
        while (in.hasNextInt()) {
            a = in.nextInt();
            if (b==a) sch++;
            if (sch>max) max++;
            if (b!=a) sch = 1;
            System.out.println("Максимальное число элементов, идущих подряд =" + max);
            b = a;
            System.out.print("Введите число ");
        }
    }

    static void Task7_137() {
        Scanner in = new Scanner(System.in);
        int max = 0, c=1, a = 0, sch = 0, perv = 0, posl = 0;
        System.out.println("Введите число");
        while (in.hasNextInt()) {
            a = in.nextInt();
            sch++;
            if (a>max) {
                max = a;
                perv = sch;
            }
            if (a==max) posl = sch;

            System.out.println("Первое максимальное число =" + perv);
            System.out.println("Последнее максимальное число =" + posl );
            System.out.println("Введите число");
        }
        System.out.println("Первое максимальное число =" + perv);
        System.out.println("Последнее максимальное число =" + posl);
    }

    static void Task7_138() {
        Scanner in = new Scanner(System.in);
        int a = 0, sch = 0, c = 1;
        while (in.hasNextInt()) {
            System.out.println("Введите число");
            a = in.nextInt();

            sch++;
            if (a==0) {
                System.out.println("Номер первого нуля =" + sch);
                System.exit(0);
            }
            System.out.println("Номер первого нуля = "+0);

        }
        System.out.println("0");
    }

    static void Task7_139() {
        Scanner in = new Scanner(System.in);
        int a, b, count = 1;
        System.out.println("Введите число");
        b = in.nextInt();
        System.out.println("Введите число");
        while (in.hasNextInt()){
            System.out.println("Введите число");
            a = in.nextInt();
            if(a > b) count++;
            b = a;
        }
        System.out.println("Число элементов больших предыдущего ="+count);
    }

    static void Task7_140() {
        Scanner in = new Scanner(System.in);
        int a = 0, c = 1, vtr = 0, max = 0;
        while (in.hasNextInt()) {
            System.out.println("Введите число");
            a = in.nextInt();
            if (a>max) {
                vtr = max;
                max = a;
            }
            if (a>vtr & a<max) vtr = a;
            System.out.println("Второе по величине число ="+vtr);
        }
        if (vtr == 0) System.out.println("No");
        else System.out.println(vtr);
    }

    static void Task7_141() {
        // ATTENTION
        int n=0, sch = 0, a = 0, z =0, x = 0, y = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        while (in.hasNextInt()) {
            a = in.nextInt();
            sch++;
            if (sch % 3 == 0) {
                z = a;
                n = n + 3;
            }
            if (sch - n == 1) x = a;
            if (sch - n == 2) y = a;
            if (x * y == z) System.out.println("x="+x + " " + "y="  + y + " " + "z=" + z);
            else  if (x * z == y) System.out.println("x="+x + " " + "y="  + z + " " + "z=" + y);
            else  if (y * z == x) System.out.println("x="+y + " " + "y="  + z + " " + "z=" + x);
            System.out.println("Введите число");
        }
        System.out.println("x = "+x + "y = " + y + "z = " + z);
    }

    static void Task7_142() {
        int maxdl=0, schmin=0, schmax=0,  a = 0, b = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        while (in.hasNextInt()){
            a = in.nextInt();
            if (b==a) {
                schmin = 1;
                schmax = 1;
            }
            if (a>b) {
                schmax++;
                schmin = 1;
            }
            if (a<b){
                schmin++;
                schmax =1;
            }
            if (schmax>maxdl) {
                maxdl = schmax;

            }
            if (schmin>maxdl) {
                maxdl = schmin;

            }
            b=a;
            System.out.println("Максимальный монотонный промежуток =" + maxdl);
            System.out.println("Введите число");
        }
        System.out.println("Максимальный монотонный промежуток =" + maxdl);
    }

    static void Task7_143() {
        int a = 0, b = 0, c = 1, sch = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        while (in.hasNextInt()) {
            a = in.nextInt();

            if (a<0 || a>1) break;
            if (a == 1 & b == 0) sch++;
            b=a;

            System.out.println("Число групп из единиц, разделенных нулями ="+sch);
            System.out.println("Введите число");
        }
        System.out.println(sch);
    }

    static void Task7_144() {
        int a = 0, x=0, b=0, c=0, d=0, e=0, f=0, sch=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        while (in.hasNextInt()){
            a = in.nextInt();
            if (a==1) x=a;
            else if (a==2) b=a;
            else if (a==3) c=a;
            else if (a==4) d=a;
            else if (a==5) e=a;
            else if (a==6 & x==1 & b==2 & c==3 & d==4 & e==5) {
                sch++;
                System.out.println("Количество фрагментов в последовательности =" + sch);
                x=0; b=0; c=0; d=0; e=0;
            }
            else if (a!=1 || a!=2 || a!=3 || a!=4 || a!=5 || a!=6) {
                x=0; b=0; c=0; d=0; e=0;
            }
            System.out.println("Количество фрагментов в последовательности =" + sch);
            System.out.println("Введите число");

        }
        System.out.println("Количество фрагментов в последовательности =" + sch);
    }

    public static void main(String[] args) {
	// write your code here
        Task7_133();
    }

}
