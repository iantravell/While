package iantravell.com;

public class Main {

    public static void main(String[] args) {

//        int count = 0;
////        while(count !=5) {
////            System.out.println("Count is value " + count);
////            count++;
////        }
////
////        count = 1;
////        while (true) {
////            if(count == 6){
////                break;
////            }
////            System.out.println("count value is " + count);
////            count ++;
////        }
//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count ++;
//
//            if(count >100) {
//                break;
//            }
//        } while (count !=6);

//        int number = 5;
//        int finishNumber = 20;
//        while (number <= finishNumber) {
//            if (!isEvenNumber(number)) {
//                number++;
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//            number++;
//        }


        int number = 5;
        int finishNumber = 20;
        int evenNumbersFound = 0;
        while (number <= finishNumber) {
            if (!isEvenNumber(number)) {
                number++;
                continue;
            }


            System.out.println("Even number " + number);
            number++;

            evenNumbersFound++;
            if(evenNumbersFound >=5) {
                break;
            }
        }

        System.out.println("Total even numbers found " + evenNumbersFound);

    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            return true;
        } else {
            return false;
        }

    }
}
