import javax.swing.*;
import java.awt.*;

public class WelcomeGUI {

    public static void main(String[] args) {
        // Create main frame
        JFrame frame = new JFrame("Welcome App");
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Default background color
        Color defaultBg = new Color(230, 240, 255);
        frame.getContentPane().setBackground(defaultBg);

        // Create welcome message label (center)
        JLabel messageLabel = new JLabel("", SwingConstants.CENTER);
        messageLabel.setFont(new Font("Serif", Font.BOLD, 24));
        messageLabel.setForeground(new Color(0, 102, 0));

        // Heading (top)
        JLabel heading = new JLabel("Welcome Application", SwingConstants.CENTER);
        heading.setFont(new Font("Arial", Font.BOLD, 28));
        heading.setForeground(new Color(0, 51, 153));
        heading.setBorder(BorderFactory.createEmptyBorder(20, 10, 10, 10));

        // Create control buttons
        JButton showButton = new JButton("Show Welcome");
        JButton undoButton = new JButton("Undo");
        JButton resetButton = new JButton("Reset");
        JButton exitButton = new JButton("Exit");

        // Light background buttons
        JButton blueButton = new JButton("Blue");
        JButton peachButton = new JButton("Peach");
        JButton greenButton = new JButton("Green");

        // Dark background buttons
        JButton darkGrayButton = new JButton("Dark Gray");
        JButton navyButton = new JButton("Navy Blue");
        JButton blackButton = new JButton("Black");

        // Text color buttons
        JButton textRed = new JButton("Red");
        JButton textBlue = new JButton("Blue");
        JButton textGreen = new JButton("Green");
        JButton textBlack = new JButton("Black");
        JButton textWhite = new JButton("White");

        // Action Listeners
        showButton.addActionListener(e -> messageLabel.setText("🎉 Welcome Vikas ..! Click on the buttons to see changes. "));
        undoButton.addActionListener(e -> messageLabel.setText(""));
        resetButton.addActionListener(e -> {
            messageLabel.setText("");
            frame.getContentPane().setBackground(defaultBg);
            heading.setForeground(new Color(0, 51, 153));
            messageLabel.setForeground(new Color(0, 102, 0));
        });
        exitButton.addActionListener(e -> System.exit(0));

        // Light theme background color actions
        blueButton.addActionListener(e -> {
            frame.getContentPane().setBackground(new Color(204, 229, 255));
            heading.setForeground(Color.BLACK);
        });
        peachButton.addActionListener(e -> {
            frame.getContentPane().setBackground(new Color(255, 224, 204));
            heading.setForeground(Color.BLACK);
        });
        greenButton.addActionListener(e -> {
            frame.getContentPane().setBackground(new Color(204, 255, 229));
            heading.setForeground(Color.BLACK);
        });

        // Dark theme background color actions
        darkGrayButton.addActionListener(e -> {
            frame.getContentPane().setBackground(Color.DARK_GRAY);
            heading.setForeground(Color.WHITE);
        });
        navyButton.addActionListener(e -> {
            frame.getContentPane().setBackground(new Color(0, 0, 80));
            heading.setForeground(Color.WHITE);
        });
        blackButton.addActionListener(e -> {
            frame.getContentPane().setBackground(Color.BLACK);
            heading.setForeground(Color.WHITE);
        });

        // Text color actions
        textRed.addActionListener(e -> messageLabel.setForeground(Color.RED));
        textBlue.addActionListener(e -> messageLabel.setForeground(Color.BLUE));
        textGreen.addActionListener(e -> messageLabel.setForeground(new Color(0, 153, 0)));
        textBlack.addActionListener(e -> messageLabel.setForeground(Color.BLACK));
        textWhite.addActionListener(e -> messageLabel.setForeground(Color.WHITE));

        // Panels
        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new GridLayout(4, 1, 5, 5));
        controlPanel.setBackground(defaultBg);

        JPanel messageButtons = new JPanel();
        messageButtons.setBackground(defaultBg);
        messageButtons.add(showButton);
        messageButtons.add(undoButton);
        messageButtons.add(resetButton);
        messageButtons.add(exitButton);

        JPanel lightColors = new JPanel();
        lightColors.setBackground(defaultBg);
        lightColors.add(new JLabel("Light Theme: "));
        lightColors.add(blueButton);
        lightColors.add(peachButton);
        lightColors.add(greenButton);

        JPanel darkColors = new JPanel();
        darkColors.setBackground(defaultBg);
        darkColors.add(new JLabel("Dark Theme: "));
        darkColors.add(darkGrayButton);
        darkColors.add(navyButton);
        darkColors.add(blackButton);

        JPanel textColors = new JPanel();
        textColors.setBackground(defaultBg);
        textColors.add(new JLabel("Text Color: "));
        textColors.add(textRed);
        textColors.add(textBlue);
        textColors.add(textGreen);
        textColors.add(textBlack);
        textColors.add(textWhite);

        // Add panels to controlPanel
        controlPanel.add(messageButtons);
        controlPanel.add(lightColors);
        controlPanel.add(darkColors);
        controlPanel.add(textColors);

        // Add everything to frame
        frame.add(heading, BorderLayout.NORTH);
        frame.add(messageLabel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);

        // Show the GUI
        frame.setVisible(true);
    }
}
