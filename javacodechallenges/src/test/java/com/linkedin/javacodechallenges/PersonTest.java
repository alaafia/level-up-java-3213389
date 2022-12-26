package com.linkedin.javacodechallenges;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PersonTest {
  @Test
  public void shouldReturnCorrectInfo() {
    Person p = new Person("first", "second", 20);
    assertTrue(p.getFirstName().equals("first"));
    assertTrue(p.getLastName().equals("second"));
    assertTrue(p.getAge() == 20);
  }

  public void shouldChangeInfo() {
    Person p = new Person("first", "second", 20);
    p.setAge(30);
    p.setLastName("last");
    assertTrue(p.getFirstName().equals("first"));
    assertTrue(p.getLastName().equals("last"));
    assertTrue(p.getAge() == 30);
  }
}
