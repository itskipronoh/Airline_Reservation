import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class CustomerPanel extends JFrame {
    private JTextArea resultTextArea;

    public CustomerPanel() {
        setTitle("Customer Panel");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel headerLabel = new JLabel("Customer Panel", SwingConstants.CENTER);
        panel.add(headerLabel);

        resultTextArea = new JTextArea();
        resultTextArea.setEditable(false);
        panel.add(new JScrollPane(resultTextArea));

        JButton viewSeatsButton = new JButton("View Available Seats");
        panel.add(viewSeatsButton);

        viewSeatsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                resultTextArea.setText("Customer Panel - View Available Seats:\n");
                // Add logic to view available seats
            }
        });

        add(panel);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CustomerPanel();
    }
}
