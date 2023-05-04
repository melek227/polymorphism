/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polymorphism;

/**
 *
 * @author melek
 */
public class CustomerManager {
    private BaseLogger logger;
    
    public CustomerManager(BaseLogger logger){ //parametre çalışılan loggerin kim olduğunu söyler
        //this.classın_loggeri=constructorun_loggeri
        this.logger=logger;
        //customermanageri newlediğimizde baselogger verecek.BaseLogger türünde filelogger emaillogger databaselogger alabilir
        
    

};
    public void Add(){
        System.out.println("müsteri eklendi");
        
        this.logger.Log("log mesajı");
        
    }
    
}
