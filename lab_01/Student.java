
package lab_01;

import java.io.Serializable;


public class Student implements Serializable{
    private String id;
    private String name;
    private Double gba;

    public Student() {
    }

    public Student(String id, String name, Double gba) {
        this.id = id;
        this.name = name;
        this.gba = gba;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getGba() {
        return gba;
    }

    public void setGba(Double gba) {
        this.gba = gba;
    }    
}
