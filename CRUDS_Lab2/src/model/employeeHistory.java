package model;


import java.util.ArrayList;
import model.employeeinfo;
import ui.CreateJPanel;
import ui.UpdateJPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dhruvilsuthar
 */
public class employeeHistory {
    private ArrayList<employeeinfo> history;
    public employeeHistory(){
        this.history = new ArrayList<employeeinfo>();
        
        
    }

    public ArrayList<employeeinfo> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<employeeinfo> history) {
        this.history = history;
    }
    
    public employeeinfo addNewEmployee(){
        employeeinfo newEmployee = new employeeinfo();
        history.add(newEmployee);
        return newEmployee;
    }
    public void deleteemp(employeeinfo ei){
        history.remove(ei);
    }
    
    public void Viewemp(employeeinfo ei){
        
        
    }

    public void setHistory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

   
