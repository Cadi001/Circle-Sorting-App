package oop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class CircleSortingApp extends JFrame {

    private int[] circleValues;
    private boolean isSorted;
    private int gridSize;
    private int gridSpacing;
    private int circleRadius;
    private int swapCount;
    private JLabel timeLabel;
    private long startTime;
    private JPanel sortingPanel;
    private JButton bubbleSortButton;
    private JButton gnomeSortButton;

    public CircleSortingApp() {
        this.isSorted = false;
        this.gridSize = 10;
        this.gridSpacing = 10;
        this.circleRadius = 10;

        setTitle("Circle Sorting App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new BorderLayout());
        setSize(700,700);
        setResizable(false);

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        bubbleSortButton = new JButton("Bubble Sort");
        bubbleSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateRandomCircles();
                startSortingAnimation("Bubble Sort", () -> bubbleSort());
            }
        });
        topPanel.add(bubbleSortButton);

        gnomeSortButton = new JButton("Gnome Sort");
        gnomeSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                generateRandomCircles();
                startSortingAnimation("Gnome Sort", () -> gnomeSort());
            }
        });
        topPanel.add(gnomeSortButton);

        timeLabel = new JLabel("Time Elapsed: 0 ms");
        topPanel.add(timeLabel);

        add(topPanel, BorderLayout.NORTH);

        sortingPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                if (circleValues == null || circleValues.length == 0) {
                    return; // Return early if circleValues is not initialized
                }

                Graphics2D g2d = (Graphics2D) g;
                g2d.setFont(new Font("Arial", Font.PLAIN, 12)); // Set font for the circle values

                int startX = (getWidth() - (gridSize * gridSpacing)) / 2;
                int startY = (getHeight() - (gridSize * gridSpacing)) / 2;

                for (int i = 0; i < circleValues.length; i++) {
                    int x = startX + (circleValues[i] * gridSpacing);
                    int y = startY + (i * gridSpacing);

                    if (isSorted) {
                        g2d.setColor(Color.BLACK);
                    } else {
                        g2d.setColor(Color.BLACK);
                    }

                    g2d.fillOval(x - circleRadius, y - circleRadius, circleRadius * 2, circleRadius * 2);

                    // Draw the circle value in the center of the circle
                    String value = String.valueOf(circleValues[i]);
                    FontMetrics fm = g2d.getFontMetrics();
                    int textWidth = fm.stringWidth(value);
                    int textHeight = fm.getAscent();
                    g2d.setColor(Color.WHITE); // Set color for text
                    g2d.drawString(value, x - textWidth / 2, y + textHeight / 2);
                }
            }
        };
        add(sortingPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    private void generateRandomCircles() {
        gridSize = 50;
        circleValues = new int[gridSize];

        // Populate the circleValues with numbers from 1 to gridSize
        for (int i = 0; i < gridSize; i++) {
            circleValues[i] = i + 1;
        }

        // Shuffle the circleValues to randomize the locations
        for (int i = 0; i < gridSize; i++) {
            int randomIndex = (int) (Math.random() * gridSize);
            int temp = circleValues[i];
            circleValues[i] = circleValues[randomIndex];
            circleValues[randomIndex] = temp;
        }

        isSorted = false; // Fix: Reset isSorted flag to false
        sortingPanel.repaint();
    }

    private void bubbleSort() {
        int n = circleValues.length;
        swapCount = 0;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (circleValues[j] > circleValues[j + 1]) {
                    int temp = circleValues[j];
                    circleValues[j] = circleValues[j + 1];
                    circleValues[j + 1] = temp;
                    swapCount++;

                    sortingPanel.repaint();

                    updateElapsedTime();

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        isSorted = true;
        sortingPanel.repaint();
    }

    private void gnomeSort() {
        int index = 0;
        int n = circleValues.length;
        swapCount = 0;
        startTime = System.currentTimeMillis();

        while (index < n) {
            if (index == 0) {
                index++;
            }
            if (circleValues[index] >= circleValues[index - 1]) {
                index++;
            } else {
                int temp = circleValues[index];
                circleValues[index] = circleValues[index - 1];
                circleValues[index - 1] = temp;
                index--;

                sortingPanel.repaint();

                updateElapsedTime();

                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        isSorted = true;
        sortingPanel.repaint();
    }

    private void startSortingAnimation(String sortName, Runnable sortingAlgorithm) {
        if (circleValues != null) {
            bubbleSortButton.setEnabled(false);
            gnomeSortButton.setEnabled(false);
            startTime = System.currentTimeMillis();
            new Thread(() -> {
                try {
                    // Wait for a few seconds before starting the sorting animation
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                sortingAlgorithm.run();
                bubbleSortButton.setEnabled(true);
                gnomeSortButton.setEnabled(true);
                JOptionPane.showMessageDialog(this,
                        sortName + " completed in " + (System.currentTimeMillis() - startTime) + " ms",
                        "Sorting Completed", JOptionPane.INFORMATION_MESSAGE);
            }).start();
        }
    }

    private void updateElapsedTime() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - startTime;

        timeLabel.setText("Time Elapsed: " + elapsedTime + " ms");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CircleSortingApp().setVisible(true);
        });
    }
}
