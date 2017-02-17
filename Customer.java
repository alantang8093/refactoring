class Customer {
  private String _name;
  private Vector _rentals = new Vector();
  
  public Customer(String name) {
    _name = name;
  }
  
  public void addRental(Rental arg) {
    _rentals.addElement(arg);
  }
  
  public String getName() {
    return _name;
  }
  
  public String statement() {
    double totalAmount = 0;
    int frequentRenterPoints = 0;
    Enumeration rentals = _rentals.elements();
    String result = "Rental Record for " + getName() + "\n";
    while (rentals.hasMoreElements()) {
      double thisAmount = 0;
      Rental each = (Rental) rentals.nextElements();
      
  }
}
