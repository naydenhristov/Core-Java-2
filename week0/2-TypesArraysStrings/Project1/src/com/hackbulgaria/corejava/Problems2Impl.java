package com.hackbulgaria.corejava;

public class Problems2Impl implements Problems2 {

    @Override
    public boolean isOdd(int number) {
        boolean bool = (number%2 == 0) ? false : true;
        return bool;
    }

    @Override
    public boolean isPrime(int number) {
        
        boolean isPrime = (number == 0 || number == 1) ? false : true;
        
        for(int i = 2; i <= (int)Math.sqrt(number); ++i) 
                if(number%i==0) {
                    isPrime = false;
                    break;
                }
        return isPrime;
    }

    @Override
    public int min(int... array) {
        
        int min = array[0];
        for (int i = 1; i < array.length; ++i){
            min = min<array[i] ? min : array[i];
        }
        return min;
    }

    @Override
    public int kthMin(int k, int[] array) {
        
        int additionalVar;
        for (int i = 0; i < array.length; ++i){
            for(int j = i+1; j < array.length-1; ++j){
                if (array[i] > array[j]) {
                    additionalVar = array[j];
                    array[j] = array[i];
                    array[i] = additionalVar;
                }
            }            
        } 
        return array[k-1];
    }

    @Override
    public float getAverage(int[] array) {
        
        float average = 0;
        for (int i=0; i<array.length; i++){
            average += array[i];
        }
        return average/array.length;
    }

    @Override
    public long getSmallestMultiple(int upperBound) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long getLargestPalindrome(long N) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int[] histogram(short[][] image) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long doubleFac(int n) {
        
        int doubleFactorial = 1;
        for (int i = 1; i <= 2; ++i){
            doubleFactorial = 1;
            while (n > 0) {
                doubleFactorial *= n;
                n--;
            }
            n = doubleFactorial;          
        }
        return doubleFactorial;
    }

    @Override
    public long kthFac(int k, int n) {
        
        long kthFactorial = 1;
        while (n > 0) {
            kthFactorial *= n;
            n-=k;
        }
        return kthFactorial;
    }

    @Override
    public int getOddOccurrence(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long pow(int a, int b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public long maximalScalarSum(int[] a, int[] b) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int maxSpan(int[] array) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean canBalance(int[] array) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int[][] rescale(int[][] original, int newWidth, int newHeight) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseMe(String argument) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String copyEveryChar(String input, int k) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String reverseEveryWord(String arg) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isPalindrome(String argument) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isPalindrome(int number) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getPalindromeLength(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int countOcurrences(String needle, String haystack) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public String decodeURL(String input) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int sumOfNumbers(String input) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean areAnagrams(String A, String B) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean hasAnagramOf(String string, String string2) {
        // TODO Auto-generated method stub
        return false;
    }

}
