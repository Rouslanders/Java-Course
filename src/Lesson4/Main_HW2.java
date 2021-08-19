package Lesson4;

public class Main_HW2 {
    public static void main(String[] args) {
        String text = "У меня все хорошо, замечательно, у меня все - получается!";
        String textToLower =text.toLowerCase();
        for (int i =0; i < text.length(); i++) {
            if(textToLower.charAt(i)=='а' || textToLower.charAt(i)=='е'||textToLower.charAt(i)=='у'|| textToLower.charAt(i)=='и'|| textToLower.charAt(i)=='ю'
                    || textToLower.charAt(i)=='я'|| textToLower.charAt(i)=='о'|| textToLower.charAt(i)=='ы'|| textToLower.charAt(i)=='э'){
                System.out.println(text.charAt(i));
            }
           }
        }
    }

