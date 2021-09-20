/*
Дан текст. Определите содержит ли данный текст
все буквы алфавита. Например,
The quick brown fox jumps over the lazy dog
– содержит все буквы английского алфавита.
Aleksandr Egorov JPTV20
 */
package strings;

public class Strings {

    
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        int count = 0;
        
        char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y', 'z'};
        
        for (int x = 0; x < letters.length; x++){
            for(int i = 0; i < text.length();i++){
                if(letters[x] == text.charAt(i)){
                    count++;
                    break;
                }
            }
            
        }
        if (count == 26){
            System.out.println("Строка содержит все буквы Английского алфавита");
        }
        else{
            System.out.println("Строка не содержит все буквы Английского алфавита ");
            
        }
        
    }
    
}
