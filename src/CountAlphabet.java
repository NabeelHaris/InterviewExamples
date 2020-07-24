public class CountAlphabet {

    private String value= "Aa kiu, I swd skieo 236587. GH kiu: sieo??25.33";

    public int returnNumberOfAlphabet(){
         int count=0;
        for (int i=0; i<value.length(); i++){
            char check = value.charAt(i);
            if (check == 'i'){
                count++;
            }

        }
        return count;
    }

    public void returnTheNumberOfLetterSpaceDigitsAnOtherInString(){

        int letters = 0;
        int spaces = 0;
        int digits = 0;
        int whiteSpace = 0;

        for (char check: value.toCharArray()){
            if (Character.isLetter(check)){
                letters++;
            }
            else if (Character.isWhitespace(check)){
                whiteSpace++;
            }
            else if (Character.isDigit(check)){
                digits++;
            }
//            else if (Character.){
//                System.out.print("String is incorrect.");
//            }
        }
        System.out.println("Letters is: " + letters);
        System.out.println("Digits is: " + digits);
        System.out.println("White Space is:" + whiteSpace);
    }
}
