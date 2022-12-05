package org.launchcode.techjobs.persistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity // Part 2: Says to make a table
public class Employer extends AbstractEntity {

    // Part 2: Add location field with validation
    @NotBlank
    @Size(min = 3, max = 255)
    private String location;

    // Part 3:
    @OneToMany  // One employer can have many jobs
    @JoinColumn(name="employer_id") // Join on this column
    private List<Job> jobs = new ArrayList<>();

    public Employer(){} // Part 2: Hibernate Uses

    // Part 2: Accessors for added location field
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
