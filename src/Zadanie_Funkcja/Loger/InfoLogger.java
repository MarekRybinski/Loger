package Zadanie_Funkcja.Loger;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;



public class InfoLogger {
    private static final Logger LOGGER = Logger.getLogger(InfoLogger.class.getName());
    public InfoLogger(){
        try{
            FileHandler fileHandler = new FileHandler("info.log");
            LOGGER.addHandler(fileHandler);
            LOGGER.fine("do constructor");
        }catch (IOException e){
            //System.out.println("");
        }
    }
    public void execute(){

    }
    public void run(){
        LOGGER.log(Level.FINE, "Do  run method");
    }
    public void exit(){


    }
}

