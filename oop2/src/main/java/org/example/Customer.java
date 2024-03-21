package org.example;

public class Customer implements IEntity {

  public  int Id;
  public String Name;
  public Boolean IsStudent;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Boolean getStudent() {
        return IsStudent;
    }

    public void setStudent(Boolean student) {
        IsStudent = student;
    }
}
