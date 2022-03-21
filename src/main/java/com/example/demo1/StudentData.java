package com.example.demo1;
import javafx.scene.image.Image;


public class StudentData {

    private String firstName;
    private String lastName;
    private long studentNumber;
    private String[] favActivities ;
    private Image firstImage;

    public StudentData(String firstName, String lastName, long studentNumber, String[] favActivity) {
        if(firstName != null && firstName.length() >= 2)
        {
            if(Character.isUpperCase(firstName.charAt(0)))
            {
                this.firstName = firstName;
            }
            else
            {
                firstName.replace(firstName.charAt(0),Character.toUpperCase(firstName.charAt(0)));
            }
        }
        else
        {
            throw new IllegalArgumentException("Please Enter Valid first name");
        }


        if(lastName != null && lastName.length() >= 2)
        {
            if(Character.isUpperCase(lastName.charAt(0)))
            {
                this.lastName = lastName;
            }
            else
            {
                lastName.replace(lastName.charAt(0),Character.toUpperCase(lastName.charAt(0)));
            }
        }
        else
        {
            throw new IllegalArgumentException("Enter Valid Last name:");
        }


        if (studentNumber > 100000000 && studentNumber < 999999999) {
            this.studentNumber = studentNumber;
        }

        else {
            throw new IllegalArgumentException("Enter a Valid Student Number:");
        }
        firstImage = new Image(getClass().getResource("/images/Bear_Image.jpeg").toExternalForm());
        this.favActivities = favActivity;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if(firstName != null && firstName.length() >= 2)
        {
            if(Character.isUpperCase(firstName.charAt(0)))
            {
                this.firstName = firstName;
            }
            else
            {
                firstName.replace(firstName.charAt(0),Character.toUpperCase(firstName.charAt(0)));
            }
        }
        else
        {
            throw new IllegalArgumentException("Please Enter Valid first name");
        }

    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if(lastName != null && lastName.length() >= 2)
        {
            if(Character.isUpperCase(lastName.charAt(0)))
            {
                this.lastName = lastName;
            }
            else
            {
                lastName.replace(lastName.charAt(0),Character.toUpperCase(lastName.charAt(0)));
            }
        }
        else
        {
            throw new IllegalArgumentException("Enter Valid Last name:");
        }

    }

    public long getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(long studentNumber) {
        if (studentNumber > 100000000 && studentNumber < 999999999) {
            this.studentNumber = studentNumber;
        }

        else {
            throw new IllegalArgumentException("Enter a Valid Student Number:");
        }
    }

    public Image getFirstImage() {
        return firstImage;
    }
}
