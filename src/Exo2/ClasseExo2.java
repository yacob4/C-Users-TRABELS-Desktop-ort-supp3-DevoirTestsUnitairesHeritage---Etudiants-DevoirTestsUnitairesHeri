/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exo2;

/**
 *
 * @author jbuffeteau
 */
public class ClasseExo2
{
    
    public static double CalculerForfait(boolean licencie, int age,boolean carteNeige, boolean assurance)
    {
        double prix=0;
        if (licencie==true)
        {
            prix=13;
        }
        else
        {
            if (age<12)
            {
                prix=20;
            }
            else
            {
                prix=30;
            }
        }
        
        if(carteNeige==true)
        {
            prix=prix-(prix*10/100);
        }
        
        if(assurance==true)
        {
            prix=prix+3;
        }
        return prix;
    }
}
