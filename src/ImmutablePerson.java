public final class ImmutablePerson {

    private final String name;
    private final int age;
    private final Address address;//mutable class

    public ImmutablePerson(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address =new Address(address.getState(), address.getCity());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    //for getAddress new instance of address is return with this.Address properties so that it remain immutable.
    public Address getAddress() {
        return new Address(address.getState(),address.getCity());
    }

    @Override
    public String toString() {
        return "ImmutablePerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
