public class GetBonues {

   private boolean bonus = false ;
   private int salary = 10000;
   private int result = salary;

    public String getBonus(){

        if (bonus = true){
            result = salary * 10;
        }
        else{
            result = salary;
        }

        return String.valueOf(result);
    }
}
