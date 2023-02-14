import java.util.Arrays;

public class Ex3{

    public static void main(String[] args) {

        opject[] num = new opject[3];
        num[0] = new opject(1);
        num[1] = new opject(2);
        num[2] = new opject(3);

        opject[] num2 = new opject[3];
        num2[0] = new opject(5);
        num2[1] = new opject(6);
        num2[2] = new opject(7);

        opject[] num3 = new opject[6];


        int j = 0;
        for (int i = 0; i < 6; i++) {
            if (i <= 2)
                num3[i] = num[i];
            else {
                num3[i] = num2[j];
                j++;
            }

        }
        System.out.println(Arrays.toString(num3));
    }
}
