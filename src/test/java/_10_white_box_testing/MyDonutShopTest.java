package _10_white_box_testing;

import _08_mocking.models.DeliveryDriver;
import _09_intro_to_white_box_testing.models.DeliveryService;
import _09_intro_to_white_box_testing.models.Order;
import _10_white_box_testing.models.BakeryService;
import _10_white_box_testing.models.PaymentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class MyDonutShopTest {

    MyDonutShop myDonutShop;
    BakeryService bakeryService;

    @Mock
    PaymentService paymentService;
    DeliveryService deliveryService;
    DeliveryDriver deliveryDriver;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

        List<DeliveryDriver> availableDeliveryDrivers = Collections.singletonList(deliveryDriver);

        myDonutShop = new MyDonutShop(paymentService, deliveryService, bakeryService);

        myDonutShop.openForTheDay();
    }

    @Test
    void itShouldTakeDeliveryOrder() throws Exception {

        //given
        Order order = new Order("James", "411", 6, 10, "3", true);

        //when
        bakeryService.getDonutsRemaining();

        //then
        verify(deliveryDriver, times(1)).completeDelivery(order);
    }

    @Test
    void givenInsufficientDonutsRemaining_whenTakeOrder_thenThrowIllegalArgumentException() {
        //given

        //when

        //then
    }

    @Test
    void givenNotOpenForBusiness_whenTakeOrder_thenThrowIllegalStateException(){
        //given

        //when

        //then
    }

}