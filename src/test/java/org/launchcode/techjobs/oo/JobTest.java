package org.launchcode.techjobs.oo;

import org.junit.Test;
import static org.junit.Assert.*;
public class JobTest {
    // Define a test called testSettingJobId and annotate it with @Test.
    @Test
    public void testSettingJobId() {
        // Create two Job objects using the empty constructor.
        Job job1 = new Job();
        Job job2 = new Job();

        // Use assertNotEquals to verify that the IDs of the two objects are distinct.
        assertNotEquals(job1.getId(), job2.getId()); // Ensure IDs are distinct.
    }
    // Define a test called testJobConstructorSetsAllFields.
    @Test
    public void testJobConstructorSetsAllFields() {
        // Declare and initialize a new Job object with the specified data.
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Use assertTrue and assertEquals statements to verify field values.
        assertTrue(job instanceof Job);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }
    // Define a test called testJobsForEquality.
    @Test
    public void testJobsForEquality() {
        // Generate two Job objects with identical field values except for id.
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Test that equals returns false.
        assertFalse(job1.equals(job2));
    }
    // Define a test called testToStringStartsAndEndsWithNewLine.
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        // Create a Job object with some data (for testing the toString method).
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Define the expected output with the specified formatting and universal line separator.
        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator() +
                System.lineSeparator(); // Ending new line

        // Use assertEquals to verify that the toString method produces the expected output.
        assertEquals(expected, job.toString());
    }
    // Define a test called testToStringContainsCorrectLabelsAndData.
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        // Create a Job object with specific data (for testing the toString method).
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        // Define the expected output with the specified formatting and universal line separator.
        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();
                //System.lineSeparator(); // Ending new line

        // Use assertTrue to verify that the toString output contains the expected labels and data.
        assertTrue(job.toString().contains(expected));
    }
}