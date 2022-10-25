import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int min = list[0];
        int max = list[list.length - 1];
        int number = 5;
        for (int i : list) {
            if (i < max && i > number) {
                max = i;
            }
            if (i > min && i < number) {
                min = i;
            }
        }
        System.out.println("Minimum Değer " + max);
        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);

    }
}