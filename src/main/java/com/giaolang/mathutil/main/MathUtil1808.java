/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author giao.lang
 */
public class MathUtil1808 {
    
    //psvm tab tạo nhanh hàm main() 
    public static void main(String[] args) {
        //CÁCH 2: TEST HÀM = CÁCH POPUP
        
        int n = 0;
        long expectedValue = 1; //hy vọng 0! = 1
        long actualValue; //= ? chờ hàm trả về
        actualValue = MathUtility.getFactorial(n);
        
        String result = n + "! | Expected: " + expectedValue + 
                            " | Actual: " + actualValue;
        JOptionPane.showMessageDialog(null, result);
        
    }

//    public static void main(String[] args) {
//        //TEST CASE #01
//        //N = 0, EX VALUE: 1, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        int n = 0;
//        long expectedValue = 1; //hy vọng 0! = 1
//        long actualValue; //= ? chờ hàm trả về
//        actualValue = MathUtility.getFactorial(n);
//        
//        System.out.println("0! | Expected: " + expectedValue 
//                              + " Actual: " + actualValue);
//        
//        //TEST CASE #02
//        //N = 1, EX VALUE: 1, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("1! | Expected: " + expectedValue 
//                              + " Actual: " + actualValue);
//        
//        //TEST CASE #03
//        //N = 5, EX VALUE: 120, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! | Expected: " + expectedValue 
//                              + " Actual: " + actualValue);
//        
//        //TEST CASE #04
//        //N = -1, EX VALUE: THẤY NGOẠI LỆ, ACTUAL VALUE: ? STATUS: PASSED/FAILED
//        System.out.println("Check if the Illegal Argument Exception is thrown");
//        n = -1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("-1! | Expected: " + expectedValue 
//                              + " Actual: " + actualValue);
//
//    }
}

