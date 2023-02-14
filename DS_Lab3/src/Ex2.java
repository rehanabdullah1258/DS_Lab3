import java.lang.reflect.Array;
import java.util.Arrays;
public class Ex2 {
    public static void main(String[] args) {

        opject[] num=new opject[3];
        num[0]=new opject(11);
        num[1]=new opject(22);
        num[2]=new opject(33);

        opject[] num2=new opject[3];

        for (int i = 0; i < num.length; i++) {
            num2[i]=num[i];
        }
        System.out.println(Arrays.toString(num2));
    }
}