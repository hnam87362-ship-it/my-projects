import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Main {
    private static int currentIndex = 0;

    static class Screen {
        String title;
        String description;
        String imageName;

        public Screen(String title, String description, String imageName) {
            this.title = title;
            this.description = description;
            this.imageName = imageName;
        }
    }

    public static void main(String[] args) {
        Screen[] screens = {
            new Screen("Welcome to my application", "Screen 1 description", "page1.png.png"),
            new Screen("Enter your information", "Please enter your details below", "page2.png.png"),
            new Screen("Screen 3: Reading", "Reading section", "page3.png.png"),
            new Screen("Screen 4: Additional wisdom", "Coffee time", "page4.png.png")
        };

        JFrame frame = new JFrame("Daily Wisdom App");
        frame.setSize(450, 680);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10, 10));

        JLabel titleLabel = new JLabel("", SwingConstants.CENTER);
        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 18));

        JLabel imageLabel = new JLabel("", SwingConstants.CENTER);
        JLabel contentLabel = new JLabel("", SwingConstants.CENTER);
        contentLabel.setFont(new Font("SansSerif", Font.PLAIN, 14));

        JButton nextButton = new JButton("التالي (Next)");
        nextButton.setFont(new Font("SansSerif", Font.BOLD, 14));

        Runnable updateScreen = () -> {
            Screen current = screens[currentIndex];
            titleLabel.setText(current.title);
            contentLabel.setText(current.description);

            // البحث المباشر عن الصورة في نفس مسار المشروع الحالي
            File imgFile = new File(current.imageName);

            if (imgFile.exists()) {
                ImageIcon originalIcon = new ImageIcon(imgFile.getAbsolutePath());
                Image scaledImg = originalIcon.getImage().getScaledInstance(380, 480, Image.SCALE_SMOOTH);
                imageLabel.setIcon(new ImageIcon(scaledImg));
                imageLabel.setText("");
            } else {
                imageLabel.setIcon(null);
                imageLabel.setText("الصورة غير موجودة: " + current.imageName);
            }
        };

        nextButton.addActionListener(e -> {
            currentIndex = (currentIndex + 1) % screens.length;
            updateScreen.run();
        });

        JPanel centerPanel = new JPanel(new BorderLayout(5, 5));
        centerPanel.add(imageLabel, BorderLayout.CENTER);
        centerPanel.add(contentLabel, BorderLayout.SOUTH);

        frame.add(titleLabel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(nextButton, BorderLayout.SOUTH);

        updateScreen.run();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}