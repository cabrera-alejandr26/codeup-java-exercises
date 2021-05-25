public class ControlFlowExercises {
    public static void main(String[] args) {
        // 1. Loop basics:
        // a.While

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

        //b. do-while
        int x = 0;

        do{
            System.out.println(x++);
        }while(x <= 100);

        int p = 100;

        do{
            System.out.println(p - 5);
        }while(p <= -10);
    }
}
