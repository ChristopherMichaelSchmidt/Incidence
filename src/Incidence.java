import java.util.Objects;

public class Incidence {
    public String getState() {
        return state;
    }

    public String getDate() {
        return date;
    }

    public int getNumber() {
        return Number;
    }

    private String state;
    private String date;
    private int Number;
    public Incidence(String state, String date, int Number){
        this.state=state;
        this.date=date;
        this.Number=Number;

    }
// code generate/hashcode und equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Incidence incidence = (Incidence) o;
        return Objects.equals(state, incidence.state) && Objects.equals(date, incidence.date);
    }

    @Override
    public String toString() {
        return "Incidence{" +
                "state='" + state + '\'' +
                ", date='" + date + '\'' +
                ", Number=" + Number +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(state, date);

     // code generate tostring

        

    }
}
