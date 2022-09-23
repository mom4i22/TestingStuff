package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {

    }
}




//    FIND NUMBER THAT IS SMALLEST IN ITS ROW, LARGEST IN ITS COLUMN
//    public static void findMatrixSaddlePoint(int[][] matrix){
//        for(int i=0;i<matrix.length;i++){
//            int rowMin = matrix[i][0];
//            int columnIndex=0;
//            boolean saddlePoint=true;
//
//            for(int j=1;j<matrix[i].length;j++){
//                if(matrix[i][j]<rowMin){
//                    rowMin=matrix[i][j];
//                    columnIndex=j;
//                }
//            }
//
//            for(int k=0;k<matrix.length;k++){
//                if(matrix[k][columnIndex]>rowMin){
//                    rowMin=matrix[i][k];
//                    saddlePoint=false;
//                }
//            }
//
//            if(saddlePoint){
//                System.out.println(rowMin);
//            }
//        }
//    }








//              TURN NUMBER INTO ROMAN NUMERALS
//        String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
//
//        int[] decimals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
//
//        int number = 1546;
//
//        int copyOfNumber = number;
//        String roman = "";
//
//        if(number>=1&&number<=3999){
//            for(int i=0;i<decimals.length;i++){
//                while(number>=decimals[i]){
//                    number=number-decimals[i];
//                    roman = roman+romanSymbols[i];
//                }
//            }
//            System.out.println("Equivalent of " +copyOfNumber+ " in roman is: " +roman);
//        }








//         FIND IF NUMBER IS ARMSTRONG NUMBER
//    public static void isArmstrongNumber(int number){
//        int copyOfNumber = number;
//        int numberOfDigits = String.valueOf(number).length();
//        int sum=0;
//
//        while(copyOfNumber!=0){
//            sum+=Math.pow(copyOfNumber%10,numberOfDigits);
//            copyOfNumber/=10;
//        }
//        if(number==sum){
//            System.out.println("True");
//        }
//        else{
//            System.out.println("False");
//        }
//    }







//            HOURGLASS PATTERN
//        int rows = 7;
//
//        for(int i=1;i<=rows;i++){
//            for(int j=1;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int k=i;k<=rows;k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }
//
//        for(int i=rows;i>0;i--){
//            for(int j=1;j<i;j++){
//                System.out.print(" ");
//            }
//            for(int k=i;k<=rows;k++){
//                System.out.print(k);
//            }
//            System.out.println();
//        }






//            BMI CALCULATOR
//        Scanner sc = new Scanner(System.in);
//        while(true){
//            printIntroduction();
//            System.out.println("Enter your height: ");
//            double height=sc.nextDouble();
//            System.out.println("Enter your weight: ");
//            double weight=sc.nextDouble();
//            getBmi(height,weight);
//           double bmi = bmiFor(height,weight);
//            int number =1;
//            String status = getStatus(bmi);
//            reportResults(number,bmi,status);
//            number++;
//        }
//    }
//
//    public static void printIntroduction(){
//        System.out.println("Welcome to BMI calculator. Check your BMI: " );
//
//    }
//
//    public static void getBmi(double height, double weight) {
//        height = height / 2.54;
//        weight = weight * 2.0246;
//        System.out.println("Your BMI is: " +bmiFor(height,weight));
//    }
//
//    public static double bmiFor(double height, double weight){
//        double bmi = weight*703/(height*height);
//        return bmi;
//    }
//
//    public static String getStatus(double bmi){
//        String status = "";
//        if(bmi<=18.5){
//            status= "Underweight";
//        }
//        else if(bmi>18.5&&bmi<=25){
//            status = "Normal";
//        }
//        else if(bmi>25&&bmi<=30){
//            status = "Overweight";
//        }
//        else if(bmi>30){
//            status = "Obese";
//        }
//        return status;
//    }
//
//    public static void reportResults(int resultNumber,double bmi,String status ){
//        System.out.println("Person " +resultNumber+ " has a BMI of " +Math.round(bmi)+ " and is " +getStatus(bmi));
//    }









//        FIND MUTUAL FRIENDS OF THREE PEOPLE -> Person Class
//        Scanner sc = new Scanner(System.in);
//        Person A = new Person();
//        System.out.println("How many friends of Person A: ");
//        A.setNumberOfFriends(sc.nextInt());
//        System.out.println("Enter the Names: ");
//        List<String> listA = new ArrayList<>();
//        int i = A.getNumberOfFriends();
//        while (i > 0) {
//            listA.add(sc.next());
//            i--;
//        }
//
//        Person B = new Person();
//        System.out.println("How many friends of Person B: ");
//        B.setNumberOfFriends(sc.nextInt());
//
//        System.out.println("Enter the Names: ");
//        List<String> listB = new ArrayList<>();
//        int j = B.getNumberOfFriends();
//        while (j > 0) {
//            listB.add(sc.next());
//            j--;
//        }
//        Person C = new Person();
//        System.out.println("How many friends of Person C: ");
//        C.setNumberOfFriends(sc.nextInt());
//        System.out.println("Enter the Names: ");
//        List<String> listC = new ArrayList<>();
//        int k = C.getNumberOfFriends();
//        while (k > 0) {
//            listC.add(sc.next());
//            k--;
//        }
//
//        List<List<String>> lists = new ArrayList<>();
//        lists.add(listA);
//        lists.add(listB);
//        lists.add(listC);
//
//        if(getCommonFriends(lists).size()>0) {
//            System.out.println("A, B and C have " +getCommonFriends(lists).size()+ " mutual friends");
//        }
//        else{
//            System.out.println("No mutual friends");
//        }
//    }
//    public static List<String> getCommonFriends(List<List<String>>lists){
//       List<String> commonFriends = lists.get(0);
//       Iterator<List<String>> it = lists.iterator();
//       while(it.hasNext()){
//           commonFriends.retainAll(it.next());
//       }
//       return commonFriends;
//    }








//        String s = "Java";
//       s.concat(" Se 6");
//
//        System.out.println(s);






//         FIND SECOND LARGEST ELEMENT IN ARRAY SLOW METHOD
//    public static int findSecondLargestElementInArray(int[]a,int length){
//        int temp=0;
//        for(int i=0;i<length;i++){
//            for(int j=i+1;j<length;j++){
//                if(a[i]>a[j]){
//                    temp=a[i];
//                    a[i]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//        return a[length-2];
//    }







//       FIND SECOND LARGEST ELEMENT IN ARRAY WITH COLLECTIONS
//    public static int findSecondLargestNumberInArray(Integer[]a,int length){
//        List<Integer> list = Arrays.asList(a);
//        Collections.sort(list);
//        int element = list.get(length-2);
//        return element;
//    }







//        COUNT OCCURRENCES OF EACH CHARACTER IN STRING
//    public static void countOccurrencesOfCharactersInString(String a){
//        String str = a.replaceAll("\\s","").toLowerCase();
//        Map<Character,Integer> map = new HashMap<>();
//        char []strArray = str.toCharArray();
//        for(Character c:strArray){
//            if(map.containsKey(c)){
//                map.put(c,map.get(c)+1);
//            }
//            else{
//                map.put(c,1);
//            }
//        }
//        for(Map.Entry<Character,Integer>set:map.entrySet()){
//            System.out.println("Character " +set.getKey()+ " appears " +set.getValue()+" times");
//        }
//    }







//      REMOVE DUPLICATE CHARACTERS INS STRING
//    public static void removeDuplicateCharactersInString(String a){
//       String str = a.replaceAll("\\s","").toLowerCase();
//       LinkedHashSet<Character> set = new LinkedHashSet<>();
//      for(int i=0;i<str.length();i++){
//          set.add(str.charAt(i));
//      }
//      for(Character c:set){
//          System.out.print(c);
//      }
//    }







//      REMOVE DUPLICATE ELEMENTS FROM AN ARRAY WITH SET
//    public static void removeDuplicateFromArray(int[]a){
//        Set<Integer> set = new LinkedHashSet<>();
//        for(int i=0;i<a.length;i++){
//            set.add(a[i]);
//        }
//        System.out.println(set);
//    }







//     SORT ARRAY BY ELEMENT FREQUENCY WITH STREAM
//    public static void sortArrayByElementFrequency(int[]a){
//        Map<Integer,Integer> map = new LinkedHashMap<>();
//        for(int i=0;i<a.length;i++){
//            if(map.containsKey(a[i])){
//                map.put(a[i],map.get(a[i])+1);
//            }
//            else{
//                map.put(a[i],1);
//            }
//        }
//        ArrayList<Integer> list = new ArrayList<>();
//        map.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).forEach(entry->{
//            for(int i=0;i<entry.getValue();i++)
//                list.add(entry.getKey());
//        });
//        System.out.println(list);
//    }








//          SORT ARRAY BY ELEMENT FREQUENCY WITH COMPARATOR
//    public static void sortArrayByFrequencyOfElements(int[]a){
//        Map<Integer,Integer> map = new LinkedHashMap<>();
//        for(int i=0;i<a.length;i++){
//            if(map.containsKey(a[i])){
//                map.put(a[i],map.get(a[i])+1);
//            }
//            else{
//                map.put(a[i],1);
//            }
//        }
//        ArrayList<Map.Entry<Integer,Integer>> list = new ArrayList<>(map.entrySet());
//        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>(){
//
//            @Override
//            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
//                return o2.getValue().compareTo(o1.getValue());
//            }
//        }
//        );
//        System.out.print("[");
//        for(Map.Entry<Integer,Integer>entry:list){
//            int frequency = entry.getValue();
//            while(frequency>=1){
//                System.out.print(entry.getKey()+ " ");
//                frequency--;
//            }
//        }
//        System.out.print("]");
//    }








//       FIND NUMBER OF OCCURRENCES OF EACH ELEMENT IN ARRAY
//    public static void findRepeatingElementsInArrayAndTheirOccurrences(int[]a){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<a.length;i++){
//            if(map.containsKey(a[i])){
//                map.put(a[i],map.get(a[i])+1);
//            }
//            else{
//                map.put(a[i],1);
//            }
//        }
//        for(Map.Entry<Integer,Integer>entry:map.entrySet()){
//            System.out.println("Element " +entry.getKey()+ " occurs " + entry.getValue() +"  times");
//        }
//    }







//      CHECK FOR PAIRS IN ARRAY THAT EQUAL GIVEN NUMBER
//    public static void checkForPairThatMatchesNumber(int a[], int number){
//        int size = a.length;
//        for(int i=0;i<a.length;i++){
//            for(int j=i+1;j<a.length;j++){
//                if(a[i]+a[j]==number){
//                    System.out.println(a[i]+" "+a[j]);
//                }
//            }
//        }
//
//    }









//         SORT ARRAY OF 0s,1s AND 2s
//    public static void sortZeroOneTwo(int a[], int itemsToSort){
//        int countZero=0;
//        int countOne=0;
//        int countTwo=0;
//        int i=0;
//        while(i<itemsToSort){
//            if(a[i]==0){
//                countZero=countZero+1;
//            }
//            if(a[i]==1){
//                countOne=countOne+1;
//            }
//            if(a[i]==2){
//                countTwo=countTwo+1;
//            }
//            i=i+1;
//        }
//        i=0;
//        while(i<countZero){
//            a[i]=0;
//            i=i+1;
//        }
//        while(i<countOne+countZero){
//         a[i]=1;
//         i=i+1;
//        }
//        while(i<countTwo+countOne+countZero){
//            a[i]=2;
//            i=i+1;
//        }
//    }







//           MERGE SORT ARRAY(DIVIDE AND CONQUER)
//    public static void mergeSort(int a[], int itemsToSort){
//        if(itemsToSort<2){
//            return;
//        }
//        int mid = itemsToSort/2;
//        int b[] = new int[mid];
//        int c[] = new int[itemsToSort-mid];
//        for(int i=0;i<mid;i++){
//            b[i]=a[i];
//        }
//        for(int j=mid;j<itemsToSort;j++){
//            c[j-mid]=a[j];
//        }
//        mergeSort(b,mid);
//        mergeSort(c,itemsToSort-mid);
//        merge(a,b,c,mid,itemsToSort-mid);
//    }
//    public static void merge(int[]a,int[]b,int c[],int left, int right){
//        int i=0;
//        int j=0;
//        int k=0;
//        while(i<left&&j<right){
//            if(b[i]<=c[j]){
//                a[k++]=b[i++];
//            }
//            else{
//                a[k++]=c[j++];
//            }
//        }
//        while(i<left){
//            a[k++]=b[i++];
//        }
//        while(j<right){
//            a[k++]=c[j++];
//        }
//    }








//     SELECTION SORT(PUT THE SMALLEST FOUND IN THE FRONT
//    public static void selectionSort(int a[]){
//        for(int i=0;i<a.length;i++){
//            int index = i;
//            for(int j=i+1;j<a.length;j++){
//                if(a[j]<a[index]){
//                    index = j;
//                }
//            }
//            int smallerNumber = a[index];
//            a[index]=a[i];
//            a[i]=smallerNumber;
//        }
//    }









//            INSERTION SORT WITH RECURSION
//    public static void insertionSortWithRecursion(int[]a, int itemsToSort){
//        if(itemsToSort<=1){
//            return;
//        }
//        insertionSortWithRecursion(a,itemsToSort-1);
//        int current = a[itemsToSort-1];
//        int j = itemsToSort-2;
//        while(j>=0&&a[j]>current){
//            a[j+1]=a[j];
//            j=j-1;
//        }
//        a[j+1]=current;
//    }









//        INSERTION SORT ALGORITHM
//    public static int[] insertionSortAlgorithm(int[]a){
//        for(int i=1;i<a.length;i++){
//            int current=a[i];
//            int j=i-1;
//            while(j>-1&&a[j]>current){
//                a[j+1]=a[j];
//                j--;
//            }
//            a[j+1]=current;
//        }
//        return a;
//    }









//          SORT ARRAY BY ASCENDING ORDER
//    public static Integer[] sortArrayAscending(Integer[]a){
//        List<Integer> list = new ArrayList<Integer>(Arrays.asList(a));
//        Collections.sort(list);
//        Integer[]newArray = new Integer[list.size()];
//        newArray = list.toArray(newArray);
//        return newArray;
//    }







//    BUBBLE SORT ARRAY(i.e. ASCENDING ORDER)
//    public static void bubbleSort(int[]a){
//        int length = a.length;
//        int temp=0;
//        for(int i=0;i<length;i++){
//            for(int j=1;j<length-i;j++){
//                if(a[j-1]>a[j]){
//                    temp=a[j-1];
//                    a[j-1]=a[j];
//                    a[j]=temp;
//                }
//            }
//        }
//    }






//         FIND ELEMENT IN ARRAY BY INDEX
//    public static int findElementInArrayByIndex(int[]a, int index){
//        for(int i=0;i<a.length;i++){
//            if(a[index]==a[i]){
//                return a[i];
//            }
//        }
//        return -1;
//    }







//          GET SPECIFIC ELEMENT FROM ARRAY
//    public static int findElementInArray(int a[], int element){
//        for(int i=0;i<a.length;i++){
//            if(a[i]==element){
//                return element;
//            }
//
//        }
//        return -1;
//    }







//            DELETE ELEMENT AT SPECIFIC POSITION FROM ARRAY
//    public static Integer[] deleteElementFromArray(Integer a[], int elementIndex){
//        if(a==null||elementIndex<0||elementIndex>a.length){
//            return a;
//        }
//        List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(a));
//        arrayList.remove(elementIndex);
//        Integer []newArray = new Integer [arrayList.size()];
//        newArray = arrayList.toArray(newArray);
//        return newArray;
//    }







//               INSERT ELEMENT AT SPECIFIC POSITION IN ARRAY WITH LIST
//    public static void insertElementAtSpecificPositionInArray(Integer[]a, int pos, int number){
//        List<Integer> list = new ArrayList<>(Arrays.asList(a));
//        list.add(pos, number);
//        Integer []newArray = new Integer[list.size()];
//        newArray = list.toArray(newArray);
//        System.out.println(Arrays.toString(newArray));
//    }








//           ADD ELEMENT AT SPECIFIC POSITION IN ARRAY WITH arraycopy METHOD
//    public static int[] insertElementAtSpecificPositionInArray(int[]a, int number, int pos){
//        int[] newArray = new int[a.length+1];
//        System.arraycopy(a,0,newArray,0,pos);
//        newArray[pos]=number;
//        System.arraycopy(a,pos,newArray,pos+1,a.length-pos);
//        return newArray;
//    }









//            ADD ELEMENT TO BACK OF ARRAY
//    public static  int[] putElementAtBackOfArray(int n, int a[], int number){
//        int []newArray = new int[n+1];
//        for(int i=0;i<n;i++){
//            newArray[i]=a[i];
//            newArray[n]=number;
//
//        }
//        return newArray;
//    }








//   INSERT ELEMENT AT SPECIFIC POSITION IN ARRAY; n IS ORIGINAL ARRAY LENGTH SO THAT IT DOESN'T CHANGE
//    public static int[] addElementToArrayAtSpecificPosition(int n,int a[], int pos, int number){
//        int []newArray = new int[n+1];
//        for(int i=0;i<n+1;i++){
//            if(i<pos-1){
//                newArray[i]=a[i];
//            }
//            else if(i==pos-1){
//                newArray[i]=number;
//            }
//            else{
//                newArray[i]=a[i-1];
//            }
//
//        }
//        return newArray;
//    }








//          FIND ALL EVEN NUMBERS IN ARRAY
//    public static void findAllEvenNumbersInArray(int a[]){
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2==0){
//                System.out.println(a[i]);
//            }
//        }
//    }







//           FIND ALL ODD NUMBERS IN ARRAY
//    public static void findAllOddNumbers(int a[]){
//        for(int i=0;i<a.length;i++){
//            if(a[i]%2!=0){
//                System.out.println(a[i]);
//            }
//        }
//    }







//        SWAP TWO NUMBERS
//    public static void swapTwoNumbers(int a, int b){
//        b=b+a-(a=b);
//        System.out.println(a +" "+ b);
//    }






//          PRINT FIBONACCI
//        int count=10;
//        int n1=0,n2=1,next;
//        for(int i=0;i<count;i++){
//            if(i<=1){
//                next=i;
//            }
//            else{
//                next=n1+n2;
//                n1=n2;
//                n2=next;
//            }
//            System.out.println(next);
//        }






//       PRINT SUM OF ALL DIGITS OF NUMBER
// public static void printSumOfAllDigitsOfNumber(int number){
//        int copyOfNumber = number;
//        int sum = 0;
//        while(copyOfNumber!=0){
//            int lastDigit = copyOfNumber%10;
//            sum+=lastDigit;
//            copyOfNumber=copyOfNumber/10;
//        }
//     System.out.println("Sum of digits of number " +number +" is " +sum);
// }






//       ARE STRINGS ANAGRAMS
// public static void areStringsAnagrams(String a, String b){
//        String copyOfA = a.replaceAll("//s","");
//        String copyOfB = b.replaceAll("//s","");
//
//     boolean status = true;
//     if(copyOfA.length()!=copyOfB.length()){
//         status = false;
//     }
//     else {
//         char[] arrA = copyOfA.toCharArray();
//         char[] arrB = copyOfB.toCharArray();
//         Arrays.sort(arrA);
//         Arrays.sort(arrB);
//         status = Arrays.equals(arrA,arrB);
//     }
//     if(status){
//         System.out.println("Strings are anagrams");
//     }
//     else{
//         System.out.println("Strings are not anagrams");
//     }
// }






//     PRINT DUPLICATE CHARACTERS IN STRING AND THEIR OCCURRENCES
//    public static void printDuplicateCharactersInString(String s){
//        HashMap<Character,Integer> map = new HashMap<>();
//        char[] stringArray = s.toCharArray();
//        for(char c:stringArray){
//            if(map.containsKey(c)){
//                map.put(c,map.get(c)+1);
//            }
//            else{
//                map.put(c,1);
//            }
//        }
//        Set<Character> set = map.keySet();
//        for(char c:set){
//            if(map.get(c)>1){
//                System.out.println(c + " " + map.get(c));
//            }
//        }
//    }







//       PYRAMID TYPE 1/22/333/444
// public static void printPyramid(int numberOfRows){
//        int rowsCount=1;
//     for(int i = numberOfRows;i>0;i--) {
//         for (int j = 1; j <= i; j++) {
//             System.out.print(" ");
//         }
//         for(int j =1;j<=rowsCount;j++){
//             System.out.print(rowsCount+" ");
//         }
//         System.out.println();
//         rowsCount++;
//     }
//
// }






//        NUMBER OF OCCURRENCES OF EACH ELEMENT IN ARRAY
//    public static void occurrenceInArray(int[] arr){
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i =0;i<arr.length;i++){
//            if(map.containsKey(arr[i])){
//                map.put(arr[i],map.get(arr[i])+1);
//            }
//            else{
//                map.put(arr[i],1);
//            }
//        }
//        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//    }






//           STRING PALINDROME
//    public static boolean isStringPalindrome(String s){
//        String a = "";
//        int b = s.length();
//        for(int i = b-1;i>=0;i--){
//            a+=s.charAt(i);
//        }
//        if(a.equals(s)){
//            return true;
//        }
//        else{
//            return false;
//        }
//    }






//    PALINDROME NUMBER
// public static boolean isNumberPalindrome(int number){
//        int temp = number;
//        int rem;
//        int sum=0;
//        while(number>0){
//            rem=number%10;
//            sum=(sum*10)+rem;
//            number=number/10;
//        }
//        if(temp==sum){
//            return true;
//        }
//        else{
//            return false;
//        }
// }


// Custom Exception Example, check classes Student and StudentAgeException
//        Student student = new Student(16);
//        System.out.println(student);
//        try{
//            validateAge(student.getAge());
//        }
//        catch(InvalidAgeException e){
//            System.out.println("Caught exception");
//            System.out.println(e);
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter new age: ");
//        student.setAge(sc.nextInt());
//        System.out.println(student);
//
//    }
//    public static void validateAge(int age) throws InvalidAgeException{
//        if(age>15){
//            throw new InvalidAgeException("Age must be above 16");
//        }
//        else{
//            System.out.println("Student is eligible");
//        }