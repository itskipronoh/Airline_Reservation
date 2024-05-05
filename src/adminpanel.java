import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AdminPanel extends JFrame {
    private JTextArea resultTextArea;

    public AdminPanel() {
        setTitle("Admin Panel");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel headerLabel = new JLabel("Admin Panel", SwingConstants.CENTER);
        panel.add(headerLabel);

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        panel.add(new JScrollPane(resultTextArea));

        JButton viewFlightsButton = new JButton("View All Flights");
        panel.add(viewFlightsButton);

        viewFlightsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextArea.setText("Admin Panel - View All Flights:\n");
                // Add logic to view all flights
            }
        });

        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new AdminPanel();
    }
}
