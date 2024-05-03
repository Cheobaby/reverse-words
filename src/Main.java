import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String []args){
        System.out.println(reverseWords("Hola mundo")); //aloH odnum
        System.out.println(reverseWords("linda noche a todos")); //oehc ybab kcuf
        System.out.println(reverseWords("luis leon"));
    }
    public static String reverseWords(final String original){
        char []letters=original.toCharArray();
        int espacio=0;
        int inicio=0;
        List<String>reverse=new ArrayList<>();
        for(int i=0;i<= letters.length-1;i++){
            //System.out.println(letters[i]);
            if(letters[i]==' '){
                espacio=i;
                for(int j=espacio;j>=inicio;j--){
                    //System.out.println(letters[j]);
                    reverse.add(String.valueOf(letters[j]));
                }
                reverse.add(" ");
                inicio=i;
            }else if(i==letters.length-1){
                for(int x=letters.length-1;x>=espacio;x--){
                    //System.out.println(letters[j]);
                    reverse.add(String.valueOf(letters[x]));
                }
            }
            //reverse.add(String.valueOf(letters[i]));
        }

        return String.valueOf(reverse);
    }
}

/* public static String reverseWords(final String original){
        char []letters=original.toCharArray();
        char []aux=letters;
        int espacio=0;
        List<String>reverse=new ArrayList<>();
        for(int i=letters.length-1;i>=0;i--){
            //System.out.println(letters[i]);
            if(letters[i]==' '){
                espacio=i;
                for(int j=i;j>=0;j--){
                    //System.out.println(letters[j]);
                    reverse.add(String.valueOf(letters[j]));
                }
            }else if(i==0){
                for(int x=letters.length-1;x>=espacio;x--){
                    //System.out.println(letters[j]);
                    reverse.add(String.valueOf(letters[x]));
                }
            }
            //reverse.add(String.valueOf(letters[i]));
        }

        return String.valueOf(reverse);
    }*/