package com.example.student.bai1;

public class Calculator {
    private int a;
    private int b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Calculator() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int tinhTong() {
        return a+ b;
    }

    public int tinhHieu() {
        return a - b;
    }

    public int tinhTich() {
        return a * b;
    }

    public int tinhThuong() {
        return b > 0 ? a/b : 0;
    }

    public int uocChung() {
        return GCD(a, b);
    }

    public int GCD(int a, int b) {
        if (b==0) return a;
        return GCD(b,a%b);
    }
}
