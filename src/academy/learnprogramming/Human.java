package academy.learnprogramming;

public class Human {

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBornYear(int bornYear) {
        this.bornYear = bornYear;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String firstName;
    public String lastName;

    public int getBornYear() {
        return bornYear;
    }

    public int bornYear;
    public char gender;


    public void printHuman() {

        System.out.print(this.firstName + " " + this.lastName + " " + this.gender + " " + this.bornYear);
        System.out.println();
    }
}
