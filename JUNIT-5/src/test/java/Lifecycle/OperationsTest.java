package Lifecycle;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperationsTest {


    @BeforeAll
    static void beforeAll() {
        System.out.println("Runs before all methods once");
    }

    Operations operations;

    @BeforeEach
    void initial() {
        operations = new Operations();
    }

    @AfterEach
    void after() {
        System.out.println("After each method");
    }

    @DisplayName("Should find average of three int")
    @Test
    void average() {
        assertEquals(2, operations.average(1, 2, 3));
    }

    @DisplayName("Should throw Arithmetic Exception")
    @Test
    void divide() {
        assertThrows(ArithmeticException.class, () -> operations.divide(5, 0));
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Runs after all methods once");
    }


}