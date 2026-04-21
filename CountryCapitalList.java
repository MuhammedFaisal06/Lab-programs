package Swings;
import javax.swing.*;
import javax.swing.event.*;
import java.util.HashMap;

public class CountryCapitalList {

    public static void main(String[] args) {

        // Create Frame
        JFrame frame = new JFrame("Country Capitals");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Country List
        String countries[] = {
                "USA", "India", "Vietnam", "Canada", "Denmark",
                "France", "Great Britain", "Japan", "Africa",
                "Greenland", "Singapore"
        };

        // Capitals Mapping
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "Addis Ababa");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        // Create JList
        JList<String> list = new JList<>(countries);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add Listener (FIXED)
        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {

                // Prevent double printing
                if (!e.getValueIsAdjusting()) {

                    String selectedCountry = list.getSelectedValue();

                    if (selectedCountry != null) {
                        System.out.println("Capital of " + selectedCountry + " is: "
                                + capitals.get(selectedCountry));
                    }
                }
            }
        });

        // Add to Frame
        frame.add(new JScrollPane(list));

        // Show Frame
        frame.setVisible(true);
    }
}