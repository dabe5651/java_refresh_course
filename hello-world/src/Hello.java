public class Hello {
    public static void main(String[] args) {

//        printMegaBytesAndKiloBytes(1025);
//        System.out.println(isLeapYear(2000));
//        System.out.println(2000 % 100);
        System.out.println(areEqualByThreeDecimalPlaces(1.1234, 1.1234));
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if(kiloBytes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            int numMB = (kiloBytes / 1024);
            int numKB = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + numMB + " MB and " + numKB + " KB");
        }
    }

    public static boolean bark(boolean barking, int hourOfDay) {
        if( (hourOfDay < 0) & (hourOfDay > 23) ) {
            return false;
        }
        if( (hourOfDay > 8) & (hourOfDay < 22) )  {
            return false;
        }
        else {
            return true;
        }
    }



    public static boolean isLeapYear(int year) {
        if( (year >= 1) & (year <= 9999) ) {
            if( (year % 4 == 0) & (year % 100 != 0) ) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double x, double y) {
//        DecimalFormat df = new DecimalFormat("#.###");
//        if ( df.format(x) == df.format(y) ){
//            return true;
//        } else {
//            return false;
//        }
        if ( ((int)(x * 1000)) == ((int)(y * 1000)) ) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean hasTean(int x, int y, int z) {
        if( ((x >= 13) & (x <= 19)) | ((y >= 13) & (y <= 19)) | ((z >= 13) & (z <= 19)) ) {
            return true;
        } else {
            return false;
        }
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player" + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore( int score) {
        System.out.println("Player" + score + " points");
        return score * 1000;
    }





}
