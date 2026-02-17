import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PalindromeCheckerApp extends JFrame {

    private JTextField inputField;
    private JLabel resultLabel;

    public PalindromeCheckerApp() {
        setTitle("Powerful Palindrome Checker");
        setSize(500, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeUI();
    }

    private void initializeUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel titleLabel = new JLabel("Enter Text to Check:", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));

        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 16));

        JButton checkButton = new JButton("Check Palindrome");
        checkButton.setFont(new Font("Arial", Font.BOLD, 16));

        resultLabel = new JLabel(" ", SwingConstants.CENTER);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 18));

        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkPalindrome();
            }
        });

        panel.add(titleLabel, BorderLayout.NORTH);
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(checkButton, BorderLayout.WEST);
        panel.add(resultLabel, BorderLayout.SOUTH);

        add(panel);
    }

    private void checkPalindrome() {
        String input = inputField.getText();

        if (input == null || input.trim().isEmpty()) {
            resultLabel.setText("⚠ Please enter some text.");
            resultLabel.setForeground(Color.ORANGE);
            return;
        }

        boolean isPalindrome = isPalindromeAdvanced(input);

        if (isPalindrome) {
            resultLabel.setText("✅ It is a PALINDROME!");
            resultLabel.setForeground(new Color(0, 128, 0));
        } else {
            resultLabel.setText("❌ Not a palindrome.");
            resultLabel.setForeground(Color.RED);
        }
    }

    // Powerful optimized palindrome checker
    private boolean isPalindromeAdvanced(String text) {

        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PalindromeCheckerApp().setVisible(true);
        });
    }
}
