package _06_payroll;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PayrollTest {

    Payroll payroll = new Payroll();

    @Test
    void itShouldCalculatePaycheck() {
        //given
        double wage = 16;
        int hours = 6;
        double expected = 96;

        //when
        double actual = payroll.calculatePaycheck(wage, hours);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void itShouldCalculateMileageReimbursement() {
        //given
        int milesTraveled = 60;
        double expected = 34.5;

        //when
        double actual = payroll.calculateMileageReimbursement(milesTraveled);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void itShouldCreateOfferLetter() {
        //given
        String name = "John";
        double wage = 20;
        String expected = "Hello " + name + ", We are pleased to offer you an hourly wage of " + wage;

        //when
        String actual = payroll.createOfferLetter("John", 20);

        //then
        assertEquals(expected, actual);
    }

}