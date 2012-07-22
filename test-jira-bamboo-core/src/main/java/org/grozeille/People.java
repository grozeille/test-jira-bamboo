package org.grozeille;

public class People {
  private String firstname;
  
  private String lastname;

  public String getFirstname() {
    return firstname;
  }

  public String getLastname() {
    return lastname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public void setLastname(String lastname) {
    this.lastname = lastname;
  }
  
  public String SayHelloTo(People other){
    return "WTF "+other.getFirstname()+"!";
  }
}
