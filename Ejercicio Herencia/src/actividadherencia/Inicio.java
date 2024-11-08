/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actividadherencia;

import java.time.LocalDate;
import java.time.Month;
import models.Instagram;
import models.Twitter;

/**
 *
 * @author CETECOM
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Instagram ig=new Instagram(1, "Estoy en clase", true, "wacoldo", "1234");
        Twitter tw=new Twitter(2, "Estudien pal certamen", LocalDate.of(2024, Month.OCTOBER, 11), "Tertuliano", "987654");
        
        System.out.println(ig);
        System.out.println(tw);
        
        System.out.println(ig.visualizar());
        System.out.println(tw.visualizar());
    }
    
}
