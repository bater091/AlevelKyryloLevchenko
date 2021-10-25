package task2;

public class Task {
    public static void main(String[] args) {
        // First task
        Double Sqr = Square(4, 5, 7);
        System.out.println("1. Square = " + Sqr);
        // Second task
        int Result = MinAbs((int) (Math.random() * 1000 - 500), (int) (Math.random() * 1000 - 500), (int) (Math.random() * 1000 - 500));
        System.out.println("2. The least number = " + Result);
        // Third task
        int rand = ((int) (Math.random() * 1000 - 500));
        System.out.println("3. " + rand + " is " + ChekEven(rand));
        //Fourth task
        int ConNumb = (int) (Math.random() * 2000);
        int Num[] = Con(ConNumb);
        System.out.print("4. " + ConNumb + " in binary system = ");
        int Q = 3;
        for (int i = 0; i < 12; i++) {
            System.out.print(Num[i]);
            if(i == Q){
                System.out.print(" ");
                Q +=4;
            }
        }


    }





    public static double Square(double a, double b, double c) {
        double Square;
        double P = (a + b + c) / 2;
        Square = Math.sqrt (P * ((P - a) * (P - b) * (P - c)));

        return Square;
    }

    public static int MinAbs(int a, int b, int c) {
        int MinAbs;
        MinAbs = Math.abs(a) < Math.abs(b) ? a : b;
        MinAbs = Math.abs(MinAbs) < Math.abs(c) ? MinAbs : c;


        return MinAbs;
    }


    public static String ChekEven ( int a) {
        String Result;
        if (a % 2 == 0) {
            Result = "even";
        } else {
            Result = "odd";
        }

        return Result;
    }
    public static int[] Con (int a){
        int [] Num;
        Num = new int[12];
        int ConNum = a;
            int i = 11;
        do {

            if(a % 2 == 0){
                Num[i] = 0;
                a /= 2;

            }else{
                Num [i] = 1;
                a -= 1;
                a /= 2;
            }
            i --;

        }while (a >= 1);

        return Num;
    }

}


