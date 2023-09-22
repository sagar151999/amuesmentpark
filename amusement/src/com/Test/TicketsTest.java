package com.Test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.model.Tickets;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TicketsTest {

    @Test
    public void testTicketConstruction() {
        Tickets ticket = new Tickets(101, "adult", new Date(), 500);
        assertNotNull(ticket);
        assertEquals(101, ticket.getTicket());
        assertEquals("adult", ticket.getCategory());
        assertEquals(500, ticket.getPrice(), 0.01);
        assertEquals("Available", ticket.getAvalabilty());
        assertNull(ticket.getHolder());
    }

    @Test
    public void testTicketWithHolderConstruction() {
        Tickets ticket = new Tickets(102, "child", "Sagar Jadhav", new Date(), 120);
        assertNotNull(ticket);
        assertEquals(102, ticket.getTicket());
        assertEquals("child", ticket.getCategory());
        assertEquals(120, ticket.getPrice(), 0.01);
        assertEquals("Available", ticket.getAvalabilty());
        assertEquals("Sagar Jadhav", ticket.getHolder());
    }

    @Test
    public void testTicketToString() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf.parse("2023-08-25");
        Tickets ticket = new Tickets(103, "senior", date, 350);
        String expectedString = "Tickets [ticket: 103, category: senior, holder: null, date: Sat 2023.09.30, price: 350.0Avalabilty: Available]";
        assertEquals(expectedString, ticket.toString());
    }

   
}