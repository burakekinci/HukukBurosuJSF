/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.faces.bean.ManagedBean;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author burak
 */

@ManagedBean
@RequestScoped
public class user {

    String name;
    String surname;
    String birthplace;
    int birthYear;
    String tc;
    String password;
    String userType;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getBirthplace(){
        return birthplace;
    }
    
    public void setBirthplace(String birthplace){
        this.birthplace = birthplace;
    }
    
    public int getBirthYear(){
        return birthYear;
    }
    
    public void setBirthYear(int birthYear){
        this.birthYear = birthYear;
    }
    
    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public  String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getUserType(){
        return userType;
    }
    
    public void setUserType(String userType){
        this.userType = userType;
    }
    
    public user() {
    }
    
}
