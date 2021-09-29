/*
Дан текст. Определите содержит ли данный текст
все буквы алфавита. Например,
The quick brown fox jumps over the lazy dog
– содержит все буквы английского алфавита.
Aleksandr Egorov JPTV20
 */
package strings;
import java.util.Scanner;

public class Strings {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите текст на английском языке: ");
        String text = scan.nextLine();
//        String text = "The quick brown fox jumps over the lazy dog"; //Переменная строка text, только состоящая из символов, неизменяемая.
        int count = 0; //Переменная для хранения числа букв алфавита
        
        //Преобразование строки в массив символов.
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y', 'z'};
        
        for (int x = 0; x < letters.length; x++){ //Индекс массива - x, обьектов в массиве 26. Идёт по значением массива и программа начинает следующий цикл for.
            for(int i = 0; i < text.length();i++){ //Цикл проверяет содержится ли данный символ из массива letters в строке text
                if(letters[x] == text.charAt(i)){ //Значение массива (символ) совпадает со символом в текстe, то возвращает символ, находящийся по указанному индексу в строке.
                    count++; //Если всё по условию соблюдается, то к переменной прибавляется 1. (И так до того как ячейки в массиве не закончатся их 26)
                    break;
                }
            }
            
        }
        //Если переменная имеет значение 26, тоесть в строке есть все буквы алфавита, выполняется следующее.
        if (count == 26){
            System.out.println("Строка содержит все буквы Английского алфавита");
        }
        else{
            System.out.println("Строка не содержит все буквы Английского алфавита ");
            
        }
        
    }
    
}
