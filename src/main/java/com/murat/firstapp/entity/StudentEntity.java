package com.murat.firstapp.entity;


public class StudentEntity {
    private String rowId;
    private String name;
    private String lastName;

    public StudentEntity(){}
    public StudentEntity(String rowId, String name, String lastName) {
        this.rowId = rowId;
        this.name = name;
        this.lastName = lastName;
    }

    public String getRowId() {
        return rowId;
    }

    public void setRowId(String rowId) {
        this.rowId = rowId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof StudentEntity)) {
            return false;
        }
        StudentEntity entity = (StudentEntity)o;
        return this.getName().equals(entity.getName())
                && this.getLastName().equals(entity.getLastName());
    }

}
