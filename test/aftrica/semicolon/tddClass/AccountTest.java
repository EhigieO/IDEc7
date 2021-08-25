package aftrica.semicolon.tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test

    public void testThatAccountCanDepositOnce(){
        //Given
        Account ehigieAccount = new Account();
        Account janetAccount = new Account();
        //when
        ehigieAccount.deposit(1000);
        janetAccount.deposit(480);
        ehigieAccount.deposit(1000);
        janetAccount.deposit(0.0);
        //confirm
        double ehigieBalance = ehigieAccount.getAccountBalance();
        double janetBalance = janetAccount.getAccountBalance();

        assertEquals(2000, ehigieBalance);
        assertEquals(480, janetBalance);
        System.out.println(ehigieBalance);
        System.out.println(janetBalance);

    }

    @Test
    @DisplayName("User cannot deposit negative money")
    public void testThatUserCannotDepositNegativeMoney(){
        Account account = new Account();
        
    }
}
