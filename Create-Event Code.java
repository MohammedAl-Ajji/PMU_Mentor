import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CreateEventPage extends JFrame implements ActionListener {
    JTextField eventTitleField;
    JTextField locationField;
    JTextField startTimeField;
    JTextField endTimeField;
    JComboBox<String> contentSharingComboBox;
    JButton createEventButton;

    public CreateEventPage() {
        setTitle("Create Event");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));

        JLabel eventTitleLabel = new JLabel("Event Title:");
        JLabel locationLabel = new JLabel("Location / Virtual Link:");
        JLabel startTimeLabel = new JLabel("Start Time:");
        JLabel endTimeLabel = new JLabel("End Time:");
        JLabel contentSharingLabel = new JLabel("Content Sharing:");
        eventTitleField = new JTextField();
        locationField = new JTextField();
        startTimeField = new JTextField();
        endTimeField = new JTextField();
        String[] contentSharingOptions = {"Academic", "Articles", "Course", "Study Guides", "Internships", "Scholarships", "Tutorials", "Opportunities"};
        contentSharingComboBox = new JComboBox<>(contentSharingOptions);
        createEventButton = new JButton("Create Event");

        createEventButton.addActionListener(this);

        panel.add(eventTitleLabel);
        panel.add(eventTitleField);
        panel.add(locationLabel);
        panel.add(locationField);
        panel.add(startTimeLabel);
        panel.add(startTimeField);
        panel.add(endTimeLabel);
        panel.add(endTimeField);
        panel.add(contentSharingLabel);
        panel.add(contentSharingComboBox);
        panel.add(new JLabel()); // Placeholder for spacing
        panel.add(createEventButton);

        add(panel);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createEventButton) {
            String eventTitle = eventTitleField.getText();
            String location = locationField.getText();
            String startTime = startTimeField.getText();
            String endTime = endTimeField.getText();
            String contentSharing = (String) contentSharingComboBox.getSelectedItem();

           
            System.out.println("Event Title: " + eventTitle);
            System.out.println("Location / Virtual Link: " + location);
            System.out.println("Start Time: " + startTime);
            System.out.println("End Time: " + endTime);
            System.out.println("Content Sharing: " + contentSharing);
            

        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CreateEventPage();
            }
        });
    }
}
