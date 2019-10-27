import javax.swing.*;
public class Listing {


        //declare variables
        private String name;
        private int id;
        private double gpa;

        //  constructor
        public Listing(){
            this.name ="";
            this.id = 0;
            this.gpa = 0.0;
        }

        public Listing(String name, int id, double gpa)
        {
            this.name=name;
            this.id= id;
            this.gpa = gpa;
        }
        public String getName()
        {
            return name;
        }
        public void SetName(String name)
        {
            this.name = name;
        }

        public int getID()
        {
            return id;
        }
        public void setID(int id)
        {
            this.id = id;
        }
        public double getGPA()
        {
            return gpa;
        }
        public void setGPA(float gpa)
        {
            this.gpa = gpa;
        }

        public String toString()
        {
            return ("Name is " + name+
                    "\n Student ID number is " + id +
                    "\n Student GPA is " + gpa + "\n");
        }

        public int compareTo(String targetKey)
        {
            return (name.compareTo(targetKey));
        }
        public Listing deepCopy(){
            Listing clone = new Listing(name,id,gpa);
            return clone;
        }
        public void input()
        {
            name = JOptionPane.showInputDialog("Enter name of student");
            id = Integer.parseInt(JOptionPane.showInputDialog("Enter student id"));
            gpa = Double.parseDouble(JOptionPane.showInputDialog("Enter student GPA"));
        }

    }

