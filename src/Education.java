import java.time.LocalDate;

public  abstract class  Education {
    private String name;
    private String address;
    private LocalDate dataOsnovaie;


    public Education(String name, String address, LocalDate dataOsnovaie) {
        this.name = name;
        this.address = address;
        this.dataOsnovaie = dataOsnovaie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getDataOsnovaie() {
        return dataOsnovaie;
    }

    public void setDataOsnovaie(LocalDate dataOsnovaie) {
        this.dataOsnovaie = dataOsnovaie;
    }

    @Override
    public String toString() {
        return "Education{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", dataOsnovaie=" + dataOsnovaie +
                '}';
    }
}
