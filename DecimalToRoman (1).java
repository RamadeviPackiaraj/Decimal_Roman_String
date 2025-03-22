import java.util.*;
public class DecimalToRoman{
    public static String ConvertToRoman(int num){
        if(num<1||num>3999){
            throw new IllegalArgumentException("Number out of range (1-3999)");
        }
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        //for efficient string modifications
        StringBuilder roman=new StringBuilder();
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                roman.append(symbols[i]);//build a roman numeral
                num-=values[i];
            }
        }
        return roman.toString();
    }
    public static void main(String[] args){
        int number=1987;
        System.out.println("Roman numeral of"+number+"is: "+ConvertToRoman(number));
        number=3999;
        System.out.println("Roman numeral of"+number+"is: "+ConvertToRoman(number));
    }
}//Time O(N) space O(1)