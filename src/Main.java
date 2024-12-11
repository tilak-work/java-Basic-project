//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Address address = new Address("CHHATTISGARH", "BHILAI");
        ImmutablePerson person = new ImmutablePerson("TILAK", 24, address);

        System.out.println(person);

        // Attempting to modify the original address object
        //address.setCity("Los Angeles");(not work)
        System.out.println(person); // Person's address remains unchanged

        // Attempting to modify the returned address from getAddress
        Address personAddress = person.getAddress();
      //  personAddress.setCity("San Francisco");(not work)
        System.out.println(person); // Person's address still remains unchanged

    }
}