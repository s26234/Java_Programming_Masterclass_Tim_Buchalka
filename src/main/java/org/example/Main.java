package org.example;

import java.io.IOException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Date dateNow = new Date();

        System.out.println(dateNow);

        // ternary operator
        String makeOfCar = "Ford";
        boolean isDomestic = makeOfCar == "Ford" ? true : false;
        if (isDomestic) {
            System.out.println("This car is domestic");
        } else {
            System.out.println("It's foregin car");
        }


        int highScorePsition = calculateHighScorePsition(1500);
        displayHighScorePsition("Tim", highScorePsition);

        highScorePsition = calculateHighScorePsition(500);
        displayHighScorePsition("Marcin", highScorePsition);

        highScorePsition = calculateHighScorePsition(250);
        displayHighScorePsition("Sam", highScorePsition);


        //operator chalange
        double value1 = 20.00d;
        double value2 = 80.00d;
        double valueSum = ((value1 + value2) * 100d);
        double valueSumModulo = valueSum % 40.00d;
        boolean valueoolean1 = valueSumModulo == 0.0d ? true : false;
        if (valueoolean1) {
            System.out.println("valSum modulo 40.0 is equal 0.0");
        } else {
            System.out.println("valSum modulo 40.0 is NOT equal 0.0");
        }


        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        System.out.println("Hello world!");
        System.out.println(myFirstNumber);
        System.out.println(mySecondNumber);
        System.out.println(myThirdNumber);

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);

        int myLastOne = 1000 - myTotal;
        System.out.println(myLastOne);

        int myMinIntValue = Integer.MIN_VALUE;
        System.out.println(myMinIntValue);

        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println(myMaxIntValue);

        int willThisCompile = (Integer.MAX_VALUE - 1);
        System.out.println(willThisCompile);

        long myLongValue = 100L;
        System.out.println("A long has a width of " + Long.SIZE);

        short firstShort = 1;
        int firstInt = 2;
        System.out.println(firstShort + firstInt);

        byte firstByte = 1, secondByte = 2;
        System.out.println(firstByte + secondByte);

        int myTotal2 = (myMinIntValue / 2);
        System.out.println(myTotal2);

        short myNewShortValue = (short) (firstShort * 2);
        System.out.println(myNewShortValue);

        byte myByte = 3;
        short myShort = 8;
        int myInt = 21;
        long myLong = 50000L;
        long myLong2 = myLong + 10 * ((byte) myByte + (short) myShort + myInt);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myInt);
        System.out.println(myLong);
        System.out.println(myLong2);

        float myOtherFloatValue = 5.25F;
        System.out.println(myOtherFloatValue);

        double myDoublePound = 5d;
        double myDoubleConverter = 0.45359237d;
        double myDoubleKilo = myDoublePound * myDoubleConverter;
        System.out.println(myDoubleKilo);

        char myChar = 'D';
        System.out.println(myChar);

        char myUnicode = '\u0044';
        System.out.println(myUnicode);

        char myDecimalCode = 68;
        System.out.println(myDecimalCode);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;
        boolean iSCustomerHappy = true; //'is' and 'has' - good practice
        boolean hasChildren = false;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinByteValue);
        System.out.println(myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println(myMinShortValue);
        System.out.println(myMaxShortValue);

        byte myByte2 = 4;
        short myShort2 = 12;
        int myInt2 = 33;
        long myLong3 = 50000L + (10 * (myByte2 + myShort2 + myInt2));
        System.out.println(myLong3);

        double pounds = 4;
        double onePound = 0.4535;
        double kilograms = pounds * onePound;
        System.out.println(kilograms);

        double one = 20.00;
        double two = 80.00;
        double sum1 = one + two * 100.00;
        System.out.println(sum1);

        double modu1 = sum1 % 40.00;
        System.out.println(modu1);

        boolean bool1 = true;
        if (modu1 == 0)
            System.out.println("it's okey!");
        else
            System.out.println("there is some modulo");

        //

        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        boolean gameOver = true;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score is " + finalScore);
        }

        int newScoore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (gameOver) {
            int finalScore2 = newScoore + (newLevelCompleted * newBonus);
            System.out.println("Yeah = " + finalScore2);
        }

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Woohoo =  " + finalScore);
        }

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Don ", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob ", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy ", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert ", highScorePosition);

        double kilometersPerHour;
        toMilesPerHour(-5.34);
        toMilesPerHour(8.67);
        toMilesPerHour(10.90);
        toMilesPerHour(20.00);

        int newScore = calculateScore("Adaś", 25);
        System.out.println("new score is " + newScore);

        calculateScore(75);

        calcFeetAndInchesToCentimeters(7, 5);
        calcFeetAndInchesToCentimeters(100);

        getDurationString(211, 54);
        getDurationString(800);

        //____________________________________//

        displayHighScorePosition("Adam ", 1002);


        int value = 3;
        if (value == 1) {
            System.out.println("Val was 1");
        } else if (value == 2) {
            System.out.println("Val was 2");
        } else {
            System.out.println("Was not 1,2");
        }

        int switchValue = 1;
        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        char switchChar = 'C';
        switch (switchChar) {
            case 'A':
                System.out.println("It's A");
                break;
            case 'B':
                System.out.println("It's B");
                break;
            case 'C':
                System.out.println("It's C");
                break;
            default:
                System.out.println("Not found");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("It's Jan");
                break;
        }

        printDayOfTheWeek(3);

        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10000 at 5% interest = " + calculateInterest(10000.0, 5.0));


        // for loop
        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello");
        }

        for (int j = 2; j < 9; j++) {
            System.out.println("10000 at " + j + "% interest = " + (calculateInterest(10000.0, j)));
        }

        for (int j = 2; j < 9; j++) {   //"%.2f" zmniejsza liczbę miejsc po przecinku
            System.out.println("10000 at " + j + "% interest = " + String.format("%.2f", calculateInterest(10000.0, j)));
        }

        for (int j = 8; j >= 2; j--) {   //"%.2f" zmniejsza liczbę miejsc po przecinku
            System.out.println("10000 at " + j + "% interest = " + String.format("%.2f", calculateInterest(10000.0, j)));
        }

        for (int i = 10; i <= 50; i++) {
            System.out.println(" Number " + i + " is " + isPrime(i));
        }

        int count = 0;   // prime numbers
        for (int i = 10; i <= 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is a prime number");
                if (count == 3) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }

        // for loop
        int sum = 0;
        int count2 = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                count2++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if (count2 == 5) {
                System.out.println("exit the loop2");
                break;
            }
        }
        System.out.println("Sum = " + sum);

        // while loop
        int count3 = 1;
        while (count3 != 5) {
            System.out.println("Count3 value is + " + count3);
            count3++;
        }
        // while loop
        count3 = 1;
        while (true) {
            if (count3 != 5) {
                break;
            }
            System.out.println("Count3 value is + " + count3);
            count3++;
        }
        // do-while loop
        count3 = 1;
        do {
            System.out.println("Do-while count: " + count3);
            count3++;

            if (count3 > 100) {
                break;
            }

        } while (count3 != 5);


        int evenNumbersFound = 0;
        int number = 4;
        int finishNumber = 20;
        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {   // kontynuacja pętli
                continue;
            }
            System.out.println(" Even number " + number);
            evenNumbersFound++;
            if (evenNumbersFound >= 6) {
                break;
            }
        }
        System.out.println(" Total even numbers found " + evenNumbersFound);


//        for(number = 1; number <20; number++) {
//            if (isEvenNumber(number)) {
//                System.out.println("It is: " + number);
//            }
//        }
        System.out.println("Sum digits is: " + sumDigits(125));


// parsing values
        String numberAsString = "2018";
        System.out.println("number as string = " + numberAsString);

        int numberFromString = Integer.parseInt(numberAsString);
        System.out.println("number from string: " + numberFromString);

        numberAsString += 1;
        numberFromString += 1;
        System.out.println(numberAsString);   // put number one after 2018
        System.out.println(numberFromString); // add number

        /*
// reading user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter birth year: ");

        boolean hasNextInt = scanner.hasNextInt();



        if(hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter name: ");
            String name = scanner.nextLine();
            int age = 2023 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Inncorect data");
        }
        scanner.close();
        */

        // method overloading
        int newCalculateScoree = calculateScoree("Adam", 120);
        System.out.println(newCalculateScoree);

        int newCalculateScore = calculateScoree(75);
        System.out.println(newCalculateScore);

        System.out.println("New score is " + calculateScoree(34) + " points"); //magic :)


        convertToCentimeters(3);
        convertToCentimeters(3, 3);
        getDurationSstring(4125);
        getDurationSstring(65, 45);

        char switchValuee = 'C';
        switch (switchValuee) {
            case 'A':
                System.out.println("Able");
                break;
            case 'B':
                System.out.println("Baker");
                break;
            default:
                System.out.println("Not found char " + switchValuee);
                break;
        }
        System.out.println(checkMonth("MAY"));
        printDayOfWeek(0);
        printDayOfWeekIf(2);
        printDayOfWeekIff(5);

        System.out.println("10000 at 2% interest = " + calculateInterest(10000.0, 2.0));

        for (double rate = 7.5; rate <= 10.0; rate += 0.25) {
            double interestAmount = calculateInterest(100, rate);
            System.out.println("100 at " + rate + "% interest = " + interestAmount);
        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter string: ");
//        String input = scanner.nextLine();
//        int vowelCount = countVowels(input);
//        System.out.println("Count: " + vowelCount);
//        scanner.close();
        // lub:
//        int vowelCount = countVowels("Jeszczea");
//        System.out.println("Count: " + vowelCount);
//
//        // for loop
//        System.out.println("0 is " + (isPrime2(0) ? "" : "NOT") + " a prime number");
//        System.out.println("2 is " + (isPrime2(2) ? "" : "NOT") + " a prime number");
//        System.out.println("19 is " + (isPrime2(19) ? "" : "NOT") + " a prime number");
//
//        int counter = 0;
//        for (int i = 21; i < 50; i++) {
//            if (isPrime2(i)) {
//                System.out.println("number " + i + " is a prime number");
//                counter++;
//                if (counter == 3) {
//                    System.out.println("finding 3 - exiting");
//                    break;
//                }
//            }
//        }
//        System.out.println("Total amount of prime numbers is : " + counter);

        isOdd(-2);
        sumOdd(1,6);

        Main main1 = new Main();
//        main1.m();
//        main1.n();
        main1.p();
        //main1.methodExep();


       Bike03 myBike03 = new Bike03();
       myBike03.run01();

        int yearCheck = 2024;
        boolean leap01 = false;


        // DOKONCZYC ZA DNIA - COS NIE STYKA
//        if(yearCheck%4 == 0) {
//            if(yearCheck%100 == 0) {
//                if (yearCheck % 400 == 0) {
//                    leap01 = true;
//                } else {
//                    leap01 = false;
//                }
//            else {
//                leap01 = true;
//                }
//            else {
//                leap01 = false;
//                }
//            }
//        }


        Honda hondaBike = new Honda();
        hondaBike.run01();

        //count numbers of chracters
        String stringExample01 = "This Is an example that change amount of letters";
        int countChar01 = 0;

        for(int i = 0; i < stringExample01.length(); i++) {
            if(stringExample01.charAt(i) != ' ') {
                countChar01++;
            }
        }
        System.out.println(countChar01);

//        // divide string
//        String simpleStringToDivide = "aaaabbbbcccc";
//        int lehghtOf = simpleStringToDivide.length();
//        int amountOfDivision = 3;
//        int temp01 = 0 ;
//        int charsAmount = lehghtOf/amountOfDivision;
//
//        String[] equalString = new String[amountOfDivision];
//
//        if(lehghtOf % amountOfDivision != 0) {
//            System.out.println(" o - oo it cannot be divided into");
//        } else{
//            for(int i = 0; i <lehghtOf; i++) {
//                //dividing string in n equal parts
//                String part = simpleStringToDivide.substring(i,i+charsAmount);
//                equalString[temp01] = part;
//                temp01++;
//            }
//            System.out.println(amountOfDivision + " parts is divided string");
//            for(int i = 0; i <equalString.length; i++) {
//                System.out.println(equalString[i]);
//            }
//        }


//        // sunny number example
//        Scanner scaneerSunny = new Scanner(System.in);
//        System.out.println("Emter number: ");
//        int eN = scaneerSunny.nextInt();

        // find duplicates
        String stringWithDupli = "Big black bug a bit big and black";
        int counterDuplicates = 0;
        stringWithDupli = stringWithDupli.toLowerCase();
        String separateWords[] = stringWithDupli.split(" ");

        System.out.println("Duplicats: ");
        for (int i = 0; i < separateWords.length; i++) {
            counterDuplicates = 1;
            for (int j = i +1; j < separateWords.length; j++) {
                if(separateWords[i].equals(separateWords[j])) {
                    counterDuplicates++;
                    separateWords[j] = "0";
                }
            }
            if(counterDuplicates >1 && separateWords[i] !="0") {
                System.out.println(separateWords[i]);
            }

        }

          int[] arrInt = new int[] {25,11,8,75,56};
           int maxInt = arrInt[0];
           for(int i = 1; i < arrInt.length; i++) {
               if(arrInt[i] >maxInt) {
                   maxInt = arrInt[i];
               }
               System.out.println("max element: " + maxInt);
           }

           int sumArray01 = 0;
            for(int i = 1; i < arrInt.length; i++) {
                sumArray01 = sumArray01 + arrInt[i];
            }
        System.out.println("Sum is: " + sumArray01);

            //array removing duplicates in array
        int[] arrayZet = {25,11,8,75,56,66,2,89};
        int lenghtArrayZet = arrayZet.length;
        lenghtArrayZet = removeDuplicates(arrayZet,lenghtArrayZet);

        for (int i = 0; i < lenghtArrayZet; i++) {
        System.out.println(arrayZet[i] + " ");

        }





    }


    ///////////////////////////////////////////
    ///////////////////////////////////////////
    ///////////////////////////////////////////
    ///////////////////////////////////////////
    ///////////////////////////////////////////
    ///////////////////////////////////////////
    // // // // //    methods    // // // // //
    ///////////////////////////////////////////
    ///////////////////////////////////////////
    ///////////////////////////////////////////
    ///////////////////////////////////////////
    ///////////////////////////////////////////
    ///////////////////////////////////////////

    public static int removeDuplicates(int arrayZet[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] tempArray = new int[n];
        int j = 0;
        for(int i = 0; i <n; i++) {
            if(arrayZet[i] != arrayZet[i + 1]) {
                tempArray[j++] =arrayZet[i];
            }
        }tempArray[j++] = arrayZet [n-1];
        for(int i =0; i<j; i++) {
            arrayZet[i] = tempArray[i];
        }

        return j;
    }



    void m() throws IOException {
        throw new IOException("just error"); //checked exception
    }

    void n() throws IOException {
        m();
    }

    void p() {
        try {
            n();
        } catch (Exception ExOfP) {
            System.out.println("exception handled");
        }
    }

    void methodExep() throws IOException {
        System.out.println("device must be checked");
    }




    public static boolean isOdd(int number) {
        if (number < 0) {
            System.out.println("-1");
            return false;
        } else {
            System.out.println(number);
            return true;
        }
    }

        public static boolean sumOdd ( int start, int end){
            int total = 0;
            for (int i = start; i < end; i++) {
                total += i;
                System.out.println(i);
            }
            return false;
        }

        public static boolean isPrime2 ( int wholeNumber){
            if (wholeNumber <= 2) {
                return (wholeNumber == 2);
            }

            for (int divisor = 2; divisor < wholeNumber; divisor++) {
                if (wholeNumber % divisor == 0) {
                    return false;
                }
            }
            return true;
        }

        // count vowels
        public static int countVowels (String str){
            int count = 0;
            String vowels = "AEIOUaeiou";

            for (char c : str.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    count++;
                }
            }
            return count;
        }



        //enhanced switch statement
        public static void printDayOfWeek ( int day){
            String dayOfWeek = switch (day) {
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> " is not there";
            };
            System.out.println(day + " is " + dayOfWeek);
        }

        //if-else instead switch
        public static void printDayOfWeekIf ( int day){
            if (day == 0) {
                System.out.println("Sunday");
            } else if (day == 1) {
                System.out.println("Monday");
            } else {
                System.out.println("Invalid val");
            }
        }

        //if-else
        public static void printDayOfWeekIff ( int day){
            String dayOfWeek = "Invalid";
            if (day == 2) {
                dayOfWeek = "Tuesday";
            } else if (day == 3) {
                dayOfWeek = "Wednesday";
            } else if (day == 4) {
                dayOfWeek = "Thursday";
            } else {
                System.out.println(day + " = " + dayOfWeek);
            }

        }

        //enhanced switch statement
        public static String checkMonth (String month){
            return switch (month) {
                case "JANUARY" -> "1st";
                case "MAY" -> "5th";
                default -> "bad";
            };
        }

        public static String getDurationSstring ( int seconds){
            if (seconds <= 60) {
                int minutes = seconds / 60;
                return getDurationSstring(minutes, seconds);
            }
            return "";
        }

        public static String getDurationSstring ( int minutes, int seconds){
            if (minutes >= 60 && seconds >= 0 && seconds <= 60) {
                int hours = minutes / 60;
                int minutesRest = minutes % 60;
                int secondsRest = seconds % 60;
                System.out.println(hours + "h " + minutesRest + "min " + secondsRest + "sek");
            }
            return "";
        }

        public static int convertToCentimeters ( int heightInch){
            double inch = 2.54;
            System.out.println("Height in inch: " + heightInch + " converted to height in centimeters is " + heightInch * inch + " cm");
            return 0;

        }

        public static int convertToCentimeters ( int footInch, int heightInch){
            double inch = 2.54;
            double convert = (((footInch * 12) + heightInch) * inch);
            System.out.println("Height: " + footInch + " foot and " + heightInch + " inches is " + convert + " cm");
            return 0;
        }

        public static int calculateScoree (String playerName,int score){
            System.out.println("Player " + playerName + " scored " + score + " points");
            return score + 1000;
        }
        public static int calculateScoree(int score){
            System.out.println("Unnamed player scored " +score+ " points" );
            return score+1000;
        }

//        public static int calculateScoree ( int score){
//            return calculateScoree("Tim", score);
//        }


        public static void displayHighScorePsition (String name,int highScorePsition){
            System.out.println(name + " managed to get into position " + highScorePsition + " on the high score list");
        }

        public static int calculateHighScorePsition ( int playerScore){
            if (playerScore >= 1000) {
                return 1;
            } else if ((playerScore >= 500) && (playerScore < 1000)) {
                return 2;
            } else if ((playerScore >= 100) && (playerScore < 500)) {
                return 3;
            } else {
                return 4;
            }
        }


        public static void calculateScore () {
            System.out.println("Yes");
        }

        public static void displayHighScorePosition (String name,int position){
            System.out.println(name + "is on  position " + position);
        }

        public static int calculateHighScorePosition ( int playerScore){
            if (playerScore > 1000) {
                return 1;
            } else if (playerScore > 500 && playerScore < 1000) {
                return 2;
            } else if (playerScore > 100 && playerScore < 500) {
                return 3;
            } else {
                return 4;
            }
        }


        public static void toMilesPerHour ( double kilometersPerHour){
            if (kilometersPerHour <= 0) {
                System.out.println("-1");
            } else if (kilometersPerHour > 0 && kilometersPerHour != 20) {
                double conventKilometersToMiles = 0.621504;
                long longValue = (long) (kilometersPerHour * conventKilometersToMiles);
                System.out.println("Przyjęty przelicznik to 1 mila = 0.6215 km");
                System.out.println(kilometersPerHour + " km/h = " + longValue + " ml/h");
            } else if (kilometersPerHour == 20) {
                long milesPerHour = (long) Math.round(kilometersPerHour / 1.609);
                System.out.println(milesPerHour);
            }
        }


        public static int calculateScore (String playerName,int score){
            System.out.println("player " + playerName + " scored " + score + " points ");
            return score * 1000;
        }

        public static int calculateScore ( int score){
            System.out.println("Unnaned player scored " + score + " points ");
            return score * 1000;
        }

        public static double calcFeetAndInchesToCentimeters ( double feet, double inches){
            if ((feet < 0) || ((inches < 0) || (inches > 12))) {
                return -1;
            }
            double centimeters = (feet * 12) * 2.54;
            centimeters += inches * 2.54;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + " centimeters ");
            return centimeters;
        }

        public static double calcFeetAndInchesToCentimeters ( double inches){
            if (inches < 0) {
                return -1;
            }
            double feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println("inches is equal to " + feet + " feet and " + remainingInches + " inches ");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }

        public static void getDurationString ( int minutes, int seconds){
            if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
                System.out.println("invalid value");
            } else {
                int hour = minutes / 60;
                int restOfMin = minutes % 60;
                System.out.println(hour + "h " + restOfMin + "m " + seconds + "s");
            }
        }

        public static void getDurationString ( int seconds){
            if ((seconds < 0)) {
                System.out.println("invalid value");
            } else {
                int minutes = seconds / 60;
                int restOfSek = seconds % 60;
                System.out.println(minutes + "m " + restOfSek + "s");
            }
        }


        public static boolean isPrime ( int n){
            if (n == 1) {
                return false;
            }
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }


        public static double calculateInterest ( double amount, double interestRate){
            return (amount * (interestRate / 100));
        }


        public static void printDayOfTheWeek ( int day){
            switch (day) {
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println("Invalid");
                    break;
            }
        }

        public static int sumDigits ( int number){
            if (number < 10) {
                return -1;
            }
            int sum = 0;
            //125 -> 125/10=12 -> 12*10=120 -> 125-120=5
            while (number > 0) {
                int digit = number % 10; //extract the least-significant digit
                sum += digit;

                number /= 10; //same as number = number/10
            }
            return sum;
        }

        public static boolean isEvenNumber ( int number){
            if ((number % 2) == 0) {
                return true;
            } else {
                return false;
            }
        }


    }




/*
//java - czysta
//    public class Hello {
//        public String sayHello() {
//        return "Hello";
//        }}
//
//    public class Sample {
//        public static void main (String[] args) {
//        Hello hello = new Hello();
//        hello.sayHello();
//    }}


//java - Spring
//    @SpringBootApplication
//    public class HelloApplication {
//        @Autowired
//        Hello hello;
//
//        public static void main (String[] args) {
//        SpringApplication.run (HelloApplication.class, args);
//        @PostConstruct
//        public void init() {
//        System.out.println (hello.sayHello());
//    }}
//
//    @Service
//    public class Hello {
//        public String sayHello() {
//        return "Hello";
//        }}
*/






