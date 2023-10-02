package org.launchcode.techjobs.oo;
//Modified Code!
import java.util.Objects;
//End modified cde
public class PositionType {

    private int id;
    private static int nextId = 1;
    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.
//!!---Modified Code

    // Custom toString method that returns the value of a PositionType object.
    @Override
    public String toString() {
        return value;  //Return the 'value' field as a string.
    }

    // Custom equals method that considers two PositionType objects equal when their id fields match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType that = (PositionType) o;
        return getId() == that.getId();
    }

    // Custom hashCode method that generates a hash code based on the id field.
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
//!!---End of Modified Code

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

}
