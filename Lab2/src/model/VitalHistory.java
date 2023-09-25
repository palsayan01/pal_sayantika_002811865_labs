/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author palsa
 */
public class VitalHistory {
    ArrayList<Vitals> vitalSaved;

    public VitalHistory() {
        this.vitalSaved = new ArrayList<>();
    }

    public ArrayList<Vitals> getVitalSaved() {
        return vitalSaved;
    }

    public void setVitalSaved(ArrayList<Vitals> vitalSaved) {
        this.vitalSaved = vitalSaved;
    }
    
    
    public Vitals addVital()
    {
        Vitals v=new Vitals();
        vitalSaved.add(v);
        return v;
        
    }
    
    public void deleteVital(Vitals v)
    {
        vitalSaved.remove(v);
        
    }
    
    
    
}
