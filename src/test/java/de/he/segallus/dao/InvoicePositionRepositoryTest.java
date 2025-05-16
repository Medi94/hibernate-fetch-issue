package de.he.segallus.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InvoicePositionRepositoryTest {

    @Test
    void hibernateTestCall() {
        InvoicePositionRepository repo = new InvoicePositionRepository();
        int counter = 0;
        boolean hasEx = true;
        while (hasEx) {
            counter++;
            hasEx = false;
            try {
                repo.hibernateTestCall();
            } catch (AssertionError e) {
                hasEx = true;
            }
        }

        Assertions.assertEquals(1, counter, "It should work on the first run");
    }
}