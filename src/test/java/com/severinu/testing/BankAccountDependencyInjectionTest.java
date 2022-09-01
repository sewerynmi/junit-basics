package com.severinu.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(BankAccountParameterResolver.class)
public class BankAccountDependencyInjectionTest {

    @Test
    @DisplayName("Deposit 400 successfully")
    public void testDeposit(BankAccount bankAccount) {
        bankAccount.deposit(500);
        assertEquals(500, bankAccount.getBalance());
    }
    

}
