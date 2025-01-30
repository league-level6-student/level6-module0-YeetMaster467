package _08_mocking.models;

import _07_intro_to_mocking.models.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class DeliveryDriverTest {

    DeliveryDriver deliveryDriver;


    String name = "James";

    @Mock
    Car car;

    @Mock
    CellPhone cellPhone;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        deliveryDriver = new DeliveryDriver(name, car, cellPhone);
    }

    @Test
    void itShouldWasteTime() {
        //given
        boolean expected = true;

        //when
        when(deliveryDriver.wasteTime()).thenReturn(true);
        boolean actual = deliveryDriver.wasteTime();

        //then
        assertEquals(expected, actual);
    }

    @Test
    void itShouldRefuel() {
        //given
        int octaneGrade = 85;
        boolean expected = true;

        //when
        when(deliveryDriver.refuel(85)).thenReturn(true);
        boolean actual = deliveryDriver.refuel(85);

        //then
        assertEquals(expected, actual);
    }

    @Test
    void itShouldContactCustomer() {
        //given
        boolean expected = true;
        String phoneNumber = "411";
        when(deliveryDriver.contactCustomer(phoneNumber)).thenReturn(true);

        //when
        boolean actual = deliveryDriver.contactCustomer(phoneNumber);

        //then
        assertEquals(expected, actual);
    }

}