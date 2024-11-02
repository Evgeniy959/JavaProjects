package com.mycompany;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateNowTest {
    private DateNow dateNow;

    @BeforeEach
    void setUp() {
        dateNow = new DateNow();
    }

    @AfterEach
    void tearDown() {
        dateNow = null;
    }

    @Test
    void testgetDateNow() {
        //Date date = new Date();
        //Assertions.assertSame( date.getTime(), dateNow.getDateNow().getTime());
        //Assertions.assertSame( new Date(), dateNow.getDateNow());
        //Assertions.assertEquals( date.getTime(), dateNow.getDateNow().getTime());
        //Assertions.assertEquals( date, dateNow.getDateNow());
        Assertions.assertEquals( new Date(), dateNow.getDateNow());
        //Assertions.assertNotEquals( date, dateNow.getDateNow());
        //Assertions.assertNotSame( date, dateNow.getDateNow());
    }
}