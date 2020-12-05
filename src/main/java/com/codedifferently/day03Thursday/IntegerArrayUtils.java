package com.codedifferently.day03Thursday;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        Integer sum = 0;
        for (Integer value : intArray) {
            sum += value;
        }
        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        Integer product = 1;
        for (Integer value : intArray) {
            product *= value;
        }
        return product;
    }
    //Trying both ways:
//        Integer product = 1;
//        Integer number;
//        for (number = 1; number <= intArray.length; number++) {
//            product *= number ;
//        }
//        return product;
//    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        Double sum = 0.0;
        for (Integer value : intArray) {
            sum += value;
        }
        return sum / intArray.length;
    }


    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        return intArray[intArray.length-1];

        }
    }