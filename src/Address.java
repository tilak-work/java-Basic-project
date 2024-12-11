//mutable clas ued inside person
//no setter is added

class Address {
    private String state;
    private String city;

    public Address(String state, String city) {
        this.state = state;
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
