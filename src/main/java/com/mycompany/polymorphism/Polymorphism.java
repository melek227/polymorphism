/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polymorphism;

/**
 *
 * @author melek
 */
public class Polymorphism {

    public static void main(String[] args) {
        
        CustomerManager customerManager=new CustomerManager(DataBaseLogger());//çok biçimliliğin olduğu yer databaselogger verebilmemiz
        customerManager.Add();
        //BaseLogger [] loggers=new BaseLogger[]{new FileLogger(), new EmailLogger(), new DataBaseLogger()};
        //for(BaseLogger logger: loggers){
          //  logger.Log("log mesajı");
            
        //}
        
        
    }
}
