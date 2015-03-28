/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Kris
 * edited by MattiahIT
 */
abstract public class Person {
    
    public static final int VISITOR = 1;
    public static final int LIBRARY_WORKER = 2;
    public static final int ADMINISTRATOR = 3;
    
    protected int id;
    protected int type;
    protected String name;
    protected String surname;
    protected String login;
    protected String password;
    protected String email;
    protected String street;
    protected String city;
    protected String nationality;
    
    public void setId(int val)
    {
        this.id = val;
    }
    
    public int getId()
    {
        return this.id;
    }
    
    public void setPersonType(int val)
    {
        this.type = val;
    }
    
    public int getPersonType()
    {
        return this.type;
    }
    
    public void setName(String val)
    {
        this.name = val;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void setSurname(String val)
    {
        this.surname = val;
    }
    
    public String getSurname()
    {
        return this.surname;
    }
    
    public void setLogin(String val)
    {
        this.login = val;
    }
    
    public String getLogin()
    {
        return this.login;
    }
    
    public void setPassword(String val)
    {
        this.password = val;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public void setEmail(String val)
    {
        this.email = val;
    }
    
    public String getEmail()
    {
        return this.email;
    }
    
    public void setStreet(String val)
    {
        this.street = val;
    }
    
    public String getStreet()
    {
        return this.street;
    }
    
    public void setCity(String val)
    {
        this.city = val;
    }
    
    public String getCity()
    {
        return this.city;
    }
    
    public void setNationality(String val)
    {
        this.nationality = val;
    }
    
    public String getNationality()
    {
        return this.nationality;
    }
}
