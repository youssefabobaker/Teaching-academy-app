package project;

public class Student_Sign_up extends Sign_Up {
    private int academic_year;

    public int getAcademic_year() {
        return academic_year;
    }

    public void setAcademic_year(int academic_year) {
        this.academic_year = ++academic_year;
    }  
}
