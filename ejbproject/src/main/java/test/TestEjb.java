package test;

import javax.ejb.Stateless;

@Stateless
public class TestEjb {

    public int addTwoNumbers(int a, int b) {
        return a + b;
    }
}
