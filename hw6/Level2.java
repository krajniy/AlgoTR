package HWs.hw6;

public class Level2 {
    public static void main(String[] args) {
        //TODO
    //        Level 2
    //        Получите оптимальное решение задачи используя жадный подход:
    //        У вас есть 3 котлеты и сковорода, которая в себе вмещает всего 2 котлеты одновременно.
    //        Каждая сторона котлеты прожаривается за 1 минуту.
    //                За сколько времени вы сможете прожарить все котлеты со всех сторон?

        int toCook = 3;
        int atOnce = 2;
        int timeForOne = 1;

        int timeResult = toCook / atOnce * 2 * timeForOne;

        System.out.println(timeResult);


    }
}
