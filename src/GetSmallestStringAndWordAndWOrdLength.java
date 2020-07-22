public class GetSmallestStringAndWordAndWOrdLength {


    public String findSmallestStringInArray(){
        String[] strings = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};

        String smallestWord = strings[0];

        for (int i =0; i<strings.length; i++){
            if (strings[i].length() < smallestWord.length()){
                smallestWord = strings[i];

            }
        }

        return smallestWord;
    }

    public int findLengthOfSamllestWord(){


        String strings = "bitcoin take over the world maybe who knows perhaps";

        String[] checkLength = strings.split(" ");
        int maxLength = checkLength[0].length();

        for (int i =0; i<checkLength.length; i++){
            if (checkLength[i].length() < maxLength) {
                maxLength = checkLength[i].length();
            }
        }

        return maxLength;
    }
}
