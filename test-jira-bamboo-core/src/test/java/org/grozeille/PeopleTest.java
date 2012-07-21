package org.grozeille;

import junit.framework.Assert;

import org.junit.Test;

public class PeopleTest {
  
  @Test
  public void test(){
    People mathias = new People();
    mathias.setFirstname("Mathias");
    mathias.setLastname("Kluba");
    
    People michel = new People();
    michel.setFirstname("Michel");
    michel.setLastname("Kluba");
    
    Assert.assertEquals("Hello Mathias!", michel.SayHelloTo(mathias));
  }
}
