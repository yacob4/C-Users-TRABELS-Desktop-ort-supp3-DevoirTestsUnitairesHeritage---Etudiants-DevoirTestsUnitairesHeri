package Exo1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jacqu
 */
public class CoursIndividuel extends Cours
{
    private Instrument leInstrument;
    
    public CoursIndividuel(int unIdCours,String unNomCours,int unPrixCours,Instrument unInstrument)
    {
        super(unIdCours, unNomCours, unPrixCours);
        leInstrument=unInstrument;
    }

    /**
     * @return the leInstrument
     */
    public Instrument getLeInstrument() {
        return leInstrument;
    }
    
    public int getPrixCours() 
    {
        if (leInstrument.getNomInstrument().compareTo("guitare")==0)
        {
           return super.getPrixCours()+5;
        }
        else
        {
            return super.getPrixCours()+7;
        }   
    }
    
}
