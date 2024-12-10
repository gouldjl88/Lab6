
class Main {
  public static void main(String[] args) {

    // Step 3
    MyMap<String, Integer> creditHours = new MyHashMap<>();

    // Step 4
    creditHours.put("IT-1025", 3);
    creditHours.put("IT-1050", 3);
    creditHours.put("IT-1150", 3);
    creditHours.put("IT-2310", 3);
    creditHours.put("IT-2320", 4);
    creditHours.put("IT-2351", 4);
    creditHours.put("IT-2650", 4);
    creditHours.put("IT-2660", 4);
    creditHours.put("IT-2030", 4);

    // Step 5
    boolean exists = creditHours.containsKey("IT-1025");
    System.out.println("Is IT-1025 in Map? " + exists);

    exists = creditHours.containsKey("IT-2110");
    System.out.println("Is IT-2110 in Map? " + exists);

    // Step 6
    System.out.println("Entries in Map Before Removing Entries: " + creditHours);

    // Step 7
    creditHours.remove("IT-1025");
    creditHours.remove("IT-2110");

    // Step 8
    System.out.println("Entries in Map After Removing Entries: " + creditHours);
    
  }
}