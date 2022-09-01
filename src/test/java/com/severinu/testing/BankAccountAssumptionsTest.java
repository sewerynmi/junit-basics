package com.severinu.testing;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BankAccountAssumptionsTest {
    
    @Test
    @DisplayName("Test activation account after creation")
    public void testActive() {
        BankAccount bankAccount = new BankAccount(500, 0);
        //assumeTrue(bankAccount == null, "Account is null");
        //assumeFalse(bankAccount == null);
        assumingThat(bankAccount != null,  () -> assertTrue(bankAccount.isActive()) );
    }

}
