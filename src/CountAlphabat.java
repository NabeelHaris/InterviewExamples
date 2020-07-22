public class CountAlphabat {

    private String value= "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33\"";


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

    public void returnNumberOfAlphaWithDifferentWay(){

        int letter = 0;
        int space = 0;
        int num = 0;
        int other = 0;

        for (char check: value.toCharArray()){
            if (Character.isLetter(check)){
                letter++;
            }
            else if (Character.isDigit(check)){
                num++;
            }
            else if (Character.isSpaceChar(check)){
                space++;
            }
            else {
                other++;
            }
        }
        System.out.println("Letter is: " + letter);
        System.out.println("Number is: " + num);
        System.out.println("Space is: " + space);
        System.out.println("Other is:" + space);
    }
}
