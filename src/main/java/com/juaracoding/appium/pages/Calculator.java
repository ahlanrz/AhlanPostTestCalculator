package com.juaracoding.appium.pages;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Calculator {
    private AndroidDriver<MobileElement> driver;

    public Calculator(AndroidDriver<MobileElement> driver) {
        this.driver = driver;
    }

    //Locator
    By btnSatu = By.id("com.android.calculator2:id/digit_1");
    By btnDua = By.id("com.android.calculator2:id/digit_2");
    By btnTiga = By.id("com.android.calculator2:id/digit_3");
    By btnEmpat = By.id("com.android.calculator2:id/digit_4");
    By btnTambah = By.id("com.android.calculator2:id/op_add");
    By btnKali = By.id("com.android.calculator2:id/op_mul");
    By btnSamaDengan = By.id("com.android.calculator2:id/eq");
    By hasil = By.id("com.android.calculator2:id/result");
    /* web: xpath = //taghtml[contains(@attr, value)] */

    //Method
    public void calcAdd() {
        driver.findElement(btnSatu).click();
        System.out.println("Klik Angka 1");
        driver.findElement(btnTambah).click();
        System.out.println("Klik Tanda Tambah");
        driver.findElement(btnDua).click();
        System.out.println("Klik Angka 2");
        driver.findElement(btnSamaDengan).click();
        System.out.println("Klik Sama Dengan");
    }

    public void calMul() {
        driver.findElement(btnTiga).click();
        System.out.println("Klik Angka 3");
        driver.findElement(btnKali).click();
        System.out.println("Klik Tombol Kali");
        driver.findElement(btnEmpat).click();
        System.out.println("Klik Angka 4");
        driver.findElement(btnSamaDengan).click();
        System.out.println("Klik Sama Dengan");
    }

    public String getTxtResult() {
        return driver.findElement(hasil).getText();
    }
}