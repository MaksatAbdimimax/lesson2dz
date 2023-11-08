public class Main {


    public static void main(String[] args) {
        double pon = weatherTest(30, -20);
        System.out.println("Na ulitse: " + pon + "gradusov");

        double vtor = weatherTest(19, 0);
        System.out.println("Na ulitse: " + vtor + "gradusov");

        double sred = weatherTest(45, -10);
        System.out.println("Na ulitse: " + sred + "gradusov");

        double chet = weatherTest(11, 12);
        System.out.println("Na ulitse: " + chet + "gradusov");

        double pyat = weatherTest(110, 132);
        System.out.println("Na ulitse: " + pyat + "gradusov");


    }

    public static double weatherTest(int ageOfPeople, int weather) {
        if (ageOfPeople > 30 && weather < -20) {
            System.out.println("Mojno idti gulyat ");
        } else if (ageOfPeople > 19 && weather < 0) {
            System.out.println("Mojno idti gulyat ");
        } else if (ageOfPeople > 45 && weather < -10) {
            System.out.println("Mojno idti gulyat ");
        } else {
            System.out.println("Ostavaytes doma ");
        }


        return ageOfPeople + weather;
    }

}
