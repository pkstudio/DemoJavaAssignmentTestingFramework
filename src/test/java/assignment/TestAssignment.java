package assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junitpioneer.jupiter.DisableIfTestFails;
import assignment.testing.framework.BaseAssignment;

import static org.junit.jupiter.api.Assertions.*;
import static assignment.testing.framework.Utilities.*;

import java.lang.reflect.AccessFlag;
import java.util.List;


@DisableIfTestFails
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@DisplayName("Assignments")
public class TestAssignment extends BaseAssignment
{
    @DisplayName("Assignment 01 Task #01")
    @Order(1)
    @Test()
    public void assignment01_01() {
        assertTrue(classExists("assignment._01.Demo"));
    }

    @DisplayName("Assignment 01 Task #02")
    @Order(1)
    @Test()
    public void assignment01_02() {
        testClassField("assignment._01.Demo", "version", () -> {
            assertTrue(fieldIsStatic());
            assertTrue(fieldIsPublic());
            assertTrue(fieldIsFinal());
            assertEquals("String", fieldType());
        });
    }
}
