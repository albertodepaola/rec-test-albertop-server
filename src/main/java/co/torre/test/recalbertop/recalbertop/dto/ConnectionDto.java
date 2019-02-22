package co.torre.test.recalbertop.recalbertop.dto;

public class ConnectionDto {

    private PersonDto person;
    private Integer degrees;

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

    public Integer getDegrees() {
        return degrees;
    }

    public void setDegrees(Integer degrees) {
        this.degrees = degrees;
    }
}
