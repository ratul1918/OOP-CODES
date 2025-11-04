import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

class Ride {
    String driver, source, destination;
    int distance;
    double fare;

    Ride(String driver, String source, String destination, int distance, double fare) {
        this.driver = driver;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
        this.fare = fare;
    }

    @Override
    public String toString() {
        return  "🚗 Ride Completed!\n"
                + "Driver: " + driver + "\n"
                + "From: " + source + "\n"
                + "To: " + destination + "\n"
                + "Distance: " + distance + " km\n"
                + "Rate: 20 BDT/km\n"
                + "Total Fare: " + fare + " BDT\n";
    }
}

public class CholoRideSharing extends JFrame implements ActionListener {

    private JComboBox<String> srcCombo, destCombo;
    private JButton[] driverBtns;
    private JButton startBtn, stopBtn;
    private JTextArea outputArea;

    private String[] locations = {"Azimpur", "Gulshan", "UIU"};
    private String[] drivers = {"Sakib", "Tashfia", "Rafiq"};
    private boolean[] available = {true, true, false}; // One busy by default

    private int[][] distance = {
            {0, 9, 5},
            {9, 0, 8},
            {5, 8, 0}
    };

    private String selectedDriver = null;
    private boolean rideActive = false;
    private ArrayList<Ride> rideHistory = new ArrayList<>();

    public CholoRideSharing() {
        setTitle("🚖 Cholo Ride-Sharing System");
        setSize(750, 450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout(15, 15));
        getContentPane().setBackground(new Color(245, 245, 245));

        // --- Title ---
        JLabel title = new JLabel("Cholo Ride-Sharing System", JLabel.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 22));
        title.setForeground(new Color(0, 102, 204));
        add(title, BorderLayout.NORTH);

        // --- Location Panel ---
        JPanel locPanel = new JPanel(new FlowLayout());
        locPanel.setBackground(new Color(230, 240, 250));

        locPanel.add(new JLabel("Source:"));
        srcCombo = new JComboBox<>(locations);
        locPanel.add(srcCombo);

        locPanel.add(new JLabel("Destination:"));
        destCombo = new JComboBox<>(locations);
        locPanel.add(destCombo);

        add(locPanel, BorderLayout.WEST);

        // --- Driver Panel ---
        JPanel driverPanel = new JPanel(new GridLayout(3, 1, 10, 10));
        driverPanel.setBorder(BorderFactory.createTitledBorder("Select Driver"));
        driverPanel.setBackground(Color.WHITE);

        driverBtns = new JButton[3];
        for (int i = 0; i < 3; i++) {
            driverBtns[i] = new JButton(drivers[i]);
            driverBtns[i].setFont(new Font("Arial", Font.BOLD, 16));
            driverBtns[i].setForeground(Color.WHITE);
            driverBtns[i].setBackground(available[i] ? Color.GREEN.darker() : Color.RED);
            int idx = i;
            driverBtns[i].addActionListener(e -> selectDriver(idx));
            driverPanel.add(driverBtns[i]);
        }

        add(driverPanel, BorderLayout.CENTER);

        // --- Buttons Panel ---
        JPanel controlPanel = new JPanel();
        controlPanel.setBackground(new Color(240, 240, 240));
        startBtn = new JButton("▶ Start Ride");
        stopBtn = new JButton("⛔ Stop Ride");
        startBtn.setFont(new Font("SansSerif", Font.BOLD, 14));
        stopBtn.setFont(new Font("SansSerif", Font.BOLD, 14));

        startBtn.setBackground(new Color(0, 153, 51));
        startBtn.setForeground(Color.WHITE);
        stopBtn.setBackground(new Color(204, 0, 0));
        stopBtn.setForeground(Color.WHITE);

        stopBtn.setEnabled(false);
        startBtn.addActionListener(this);
        stopBtn.addActionListener(this);

        controlPanel.add(startBtn);
        controlPanel.add(stopBtn);
        add(controlPanel, BorderLayout.SOUTH);

        // --- Output Area ---
        outputArea = new JTextArea(12, 25);
        outputArea.setEditable(false);
        outputArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        outputArea.setBackground(new Color(250, 250, 250));
        outputArea.setBorder(BorderFactory.createTitledBorder("Ride Summary"));
        add(new JScrollPane(outputArea), BorderLayout.EAST);
    }

    private void selectDriver(int idx) {
        if (!available[idx]) {
            System.out.println("Driver is currently busy. Please select another driver.");
            JOptionPane.showMessageDialog(this, "Driver is currently busy. Please select another driver.");
            return;
        }
        selectedDriver = drivers[idx];
        System.out.println("Driver selected: " + selectedDriver);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn) startRide();
        else if (e.getSource() == stopBtn) stopRide();
    }

    private void startRide() {
        String source = (String) srcCombo.getSelectedItem();
        String destination = (String) destCombo.getSelectedItem();

        if (source.equals(destination)) {
            System.out.println("Source and Destination cannot be the same!");
            JOptionPane.showMessageDialog(this, "Source and Destination cannot be the same!");
            return;
        }

        if (selectedDriver == null) {
            JOptionPane.showMessageDialog(this, "Please select an available driver first!");
            return;
        }

        int driverIndex = getDriverIndex(selectedDriver);
        available[driverIndex] = false;
        driverBtns[driverIndex].setBackground(Color.RED);

        rideActive = true;
        stopBtn.setEnabled(true);

        System.out.println("Ride Started! Driver " + selectedDriver + " is on the way from " + source + " to " + destination + ".");
        JOptionPane.showMessageDialog(this, "Ride Started! Driver " + selectedDriver + " is on the way from " + source + " to " + destination +".");
    }

    private void stopRide() {
        if (!rideActive) {
            System.out.println("No active ride to stop. Please start a ride first.");
            JOptionPane.showMessageDialog(this, "No active ride to stop. Please start a ride first.");
            return;
        }

        String source = (String) srcCombo.getSelectedItem();
        String destination = (String) destCombo.getSelectedItem();
        int srcIndex = srcCombo.getSelectedIndex();
        int destIndex = destCombo.getSelectedIndex();
        int dist = distance[srcIndex][destIndex];
        double fare = dist * 20;

        Ride ride = new Ride(selectedDriver, source, destination, dist, fare);
        rideHistory.add(ride);

        outputArea.setText(ride.toString());
        System.out.println(ride);
        JOptionPane.showMessageDialog(this, "Ride Completed!\nDriver " + selectedDriver + " has finished the trip.");

        saveToFile(ride);

        int driverIndex = getDriverIndex(selectedDriver);
        available[driverIndex] = true;
        driverBtns[driverIndex].setBackground(Color.GREEN.darker());

        rideActive = false;
        stopBtn.setEnabled(false);
        selectedDriver = null;
    }

    private int getDriverIndex(String name) {
        for (int i = 0; i < drivers.length; i++) {
            if (drivers[i].equals(name)) return i;
        }
        return -1;
    }

    private void saveToFile(Ride ride) {
        try (FileWriter fw = new FileWriter("rides.txt", true)) {
            fw.write(ride.toString() + "\n-----------------------------\n");
        } catch (IOException ex) {
            System.out.println("Error saving to file: " + ex.getMessage());
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CholoRideSharing().setVisible(true));
    }
}
