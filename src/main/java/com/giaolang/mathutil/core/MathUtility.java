/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.giaolang.mathutil.core;
//Quy tắc đặt tên package trong Java
//- chữ thường toàn tập
//- ghi theo tên miền công ty đảo ngược
//com.tên-cty.tên-dự-án.tên-module-nhóm-chức-năng
//com.microsoft.sqlserver.jdbc.  Tên Class import vào để dùng
//đây là kĩ thuật giúp code của nhiều dự án trong 1 cty có thể
//ở chung folder mà ko bị lẫn lộn
//giúp thư viện của các cty khác nhau ở chung với nhau dù trủng
//tên


//KMS (Katalon) com.kms.   

//C#      Giaolang.MathUtil.
//        Microsoft.MathUtil.

/**
 *
 * @author giao.lang
 */
public class MathUtility {
    
    
    //Hàm tính n! = 1.2.3.4...n  
    //Hàm là static vì tính xong trả về, ko nhớ nhung gì cả
    //Thường các thư viện dùng chung có tính toán số liệu ta hay 
    //dùng static
    
    //0! = 1! = 1
    //n = 0..20! vì n = 21! vượt 18 số 0, 18 số 0 là vừa đủ long
    public static long getFactorial(int n) {
        long product = 1;  //tích-kết quả phép nhân
        //update code again to see green 4ever
        
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1;
        
        return n * getFactorial(n - 1);
        //recursion - đệ quy - gọi lại chính mình với 1 quy mô khác
    }
}

//5! = 1.2.3.4.5 
//   = 5 . 4!
//4! = 1.2.3.4 
//   = 4 . 3!
//3! = 3 x 2!
//2! = 2 x 1!
//1! = 1
//n! = n x (n - 1)! công thức dệ quy - recursion


//búp bê người Nga

//NẾU TA XÀI CI TRONG PROJECT, THÌ LỢI ĐIỂM LÀ MỖI LẦN SỬA CODE, DÂN DEV 
//KO CẦN MẤT SỨC TEST LẠI CODE CỦA MÌNH ĐÚNG SAI, DO CƠ CHẾ TỰ ĐỘNG
//RUN TEST CASES CỦA CI LO GIÚP

//TOÀN BỘ VIỆC TEST LẠI CODE ĐC TỰ ĐỘNG HOÁ, PM, DEV CHỈ CẦN NHÌN MÀU 
//XANH LÀ ĐỦ, BIẾT RẰNG VIỆC SỬA CODE NGON, VÌ PASS ĐC BỘ TEST

//VIỆC TEST LẠI HÀM ĐÃ TỪNG TEST => REGRESSION TESTING
//                               -> KIỂM THỬ HỒI QUY
