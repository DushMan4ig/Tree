package Tree;
/*
 * Создадим класс Person, который будет представлять каждого человека в генеалогическом древе. 
 * У каждого человека может быть имя, фамилия, год рождения и, возможно, другие свойства.
 */
public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public Person(String firstName, String lastName, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
    }

    // Геттеры и сеттеры (если нужны) для свойств

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (р. " + birthYear + ")";
    }
}
