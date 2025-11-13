import java.util.*;
public class Sorting {
    public static void BubbleSort(int numbers[]){
        for (int turn= 0; turn< numbers.length-1;turn++){
            for (int j= 0; j< numbers.length-1-turn;j++){
                if (numbers[j]>numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j]= numbers[j+1];
                    numbers[j+1] = temp;
                }
            }
        }
    }

    public static void print(int numbers[]){
        for (int i=0;i< numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
    public static void SS(int numbers[]){
        for (int i= 0;i< numbers.length-1;i++){
            int small= i;
            for (int j= i+1; j< numbers.length;j++){
                if (numbers[small]>numbers[j]){
                    small = j;

                }
            }
            int temp =numbers[small];
            numbers[small]= numbers[i];
            numbers[i]= temp;
        }
    }
    public static void IS(int numbers[]){
        for (int i= 0;i< numbers.length;i++){
            int curr = numbers[i];
            int prev = i-1;
            while (prev >=0 && numbers[prev]> curr){
                numbers[prev+1]= numbers[prev];
                prev--;
            }
            numbers[prev+1]=  curr;

        }
    }
    public static void Cs(int numbers[]){
        int large= Integer.MIN_VALUE;
        for (int i= 0;i< numbers.length;i++){
            large= Math.max(large,numbers[i]);
        }
        int count []= new int[large+1];
        for (int i= 0;i< numbers.length;i++){
            count[numbers[i]]++;
        }
        int j=0;
        for (int i= 0; i< count.length;i++){
            while (count[i]>0){
                numbers[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[]args){
        int numbers[]= {3,5,4,2,4,1,2};
        BubbleSort(numbers);
        SS(numbers);
        IS(numbers);
        Cs(numbers);
        print(numbers);
    }
}
