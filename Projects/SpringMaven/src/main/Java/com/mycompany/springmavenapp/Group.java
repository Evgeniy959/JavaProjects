package com.mycompany.springmavenapp;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students;
    public Group()
    {
        this.students=new ArrayList<>();
        this.name="noname";
    }
    public void addStudent(Student s)
    {
        this.students.add(s);
    }
    public void removeStudent(Student s)
    {
        this.students.remove(s);
    }
    public int getGroupSize()
    {
        return this.students.size();
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public List<Student> getStudents()
    {
        return students;
    }
    public void setStudents(List<Student> students)
    {
        this.students = students;
    }
    @Override
    public String toString()
    {
        String str="";
        str+="Group:\t"+name+"\n\n";
        for (Student s:students)
        {
            str+=s+"\n";
        }
        str+="\n\n";
        return str;
    }
}
