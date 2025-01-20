package de.he.segallus.dao;

import org.junit.jupiter.api.Test;

class InvoicePositionRepositoryTest {

    @Test
    void hibernateTestCall() {
        new InvoicePositionRepository().hibernateTestCall();
    }
}