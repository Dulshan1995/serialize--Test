/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialize;

import java.io.Serializable;

/**
 *
 * @author Student
 */
public class Student implements Serializable{
    String Name;
    int Age;
    Double gpa;
    
    
    @Override
    public String toString(){
     String info="Name: "+this.Name+
             "\nAge: "+this.Age+
             "\nGPA: "+this.gpa;
     return info;
    }
}
