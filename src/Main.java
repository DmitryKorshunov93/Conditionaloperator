// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int age = 15;
        if ( age > 18 )
        {
            System.out.println("Если возраст человека равен " + age + " то он совершеннолетний");
        }
        else {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }

        int temperature = 3;
        if ( temperature < 5 ){
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

        int speed = 70;
        if ( speed > 60 ){
            System.out.println("Если скорость " + speed + " то придется заплатить штраф");
        }
        else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно");
        }

        int age1 = 5;
        if ( age1 >=2 && age1 <= 6){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в детский сад");
        }

        if ( age1 >=7 && age1 <= 18){
            System.out.println("Если возраст человека равен " + age1 + " то ему нужно ходить в школу");}

        if ( age1 >=18 && age1 <= 24){
            System.out.println("Если возраст человека равен " + age1 + " то его место в университете");}

      if  ( age1 > 24) {
            System.out.println("А если человеку больше " + age1 + " то ему пора ходить на работу");}

      int age2 = 2;
      if ( age2 < 5) {
          System.out.println("Если возраст ребенка равен  " + age2 + " то ему нельзя кататься на аттракционе");}
        if ( age2 >= 5 && age2 <= 14) {
            System.out.println("Если возраст ребенка равен  " + age2 + " можно кататься на аттракционе в сопровождении");}
        if ( age2 > 14 ) {
            System.out.println("Если возраст ребенка равен  " + age2 + " то ему можно кататься на аттракционе без сопровождения взрослого");}

        int capacityOfOneWagon = 102;
        int seatPlace = 60;
        int human = 120;
        if ( human > capacityOfOneWagon){
            System.out.println( "Вагон полностью забит");}
        else {
            if (human >= seatPlace && human <= capacityOfOneWagon) {
                System.out.println("В вагоне есть только стоячие места");
            } else {
                System.out.println("В вагоне есть сидячие места");
            }
        }
            int one = 30;
            int two = 50;
            int three =1;

            if ( one > two && one > three) {
            System.out.println( one );}
            else {
                if ( two > one && two >three ){
                    System.out.println( two );
                }
                else {
                    System.out.println(three);
                }
            }

    }
}