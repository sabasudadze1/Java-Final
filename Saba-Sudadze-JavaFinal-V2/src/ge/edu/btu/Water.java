package ge.edu.btu;





public class Water {
    private String customerNumber;
    private Double amount;

    public Water(String customerNumber, Double amount) {

        this.customerNumber = customerNumber;

        this.amount = amount;
    }

    @Override
    public String toString() {
        String u = String.format("Water(customerNumber='%s', amount='%s')",
            customerNumber, amount);
        return u;
    }
}
