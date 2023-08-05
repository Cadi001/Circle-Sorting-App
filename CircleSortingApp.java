import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CircleSortingApps extends JFrame {

    private int[] circleValues;
    private boolean isSorted;
    private int gridSize;
    private int gridSpacing;
    private int circleRadius;
    private int swapCount;
    private JLabel timeLabel;
    private long startTime;
    private JPanel sortingPanel;
    private JTextField inputTextField;
    private JButton selectionSortButton;
    private JButton bubbleSortButton;
    private JButton stoogeSortButton;
    private JButton quickSortButton;
    private JButton insertionSortButton;
    private JButton bucketSortButton;
    private JButton cocktailShakerSortButton;
    private JButton combSortButton;
    private JButton cycleSortButton;
    private JButton oddEvenSortButton;
    private JButton pancakeSortButton;
    private JButton gnomeSortButton;
    private JButton beadSortButton;
    private JButton sleepSortButton;
    private JButton timSortButton;

    public CircleSortingApps() {
        this.isSorted = false;
        this.gridSize = 10;
        this.gridSpacing = 10;
        this.circleRadius = 10;

        setTitle("Circle Sorting App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.X_AXIS));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        inputTextField = new JTextField(10);
        topPanel.add(inputTextField);

        // Set the text field width to 10% of the window width
        inputTextField.setPreferredSize(new Dimension((int) (getPreferredSize().width * 0.1), inputTextField.getPreferredSize().height));

        selectionSortButton = new JButton("Selection Sort");
        selectionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Selection Sort", () -> selectionSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(selectionSortButton);

        bubbleSortButton = new JButton("Bubble Sort");
        bubbleSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Bubble Sort", () -> bubbleSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(bubbleSortButton);

        stoogeSortButton = new JButton("Stooge Sort");
        stoogeSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Stooge Sort", () -> stoogeSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(stoogeSortButton);

        quickSortButton = new JButton("Quick Sort");
        quickSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Quick Sort", () -> quickSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(quickSortButton);

        insertionSortButton = new JButton("Insertion Sort");
        insertionSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Insertion Sort", () -> insertionSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(insertionSortButton);

        bucketSortButton = new JButton("Bucket Sort");
        bucketSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Bucket Sort", () -> bucketSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(bucketSortButton);

        // Add additional sorting buttons
        cocktailShakerSortButton = new JButton("Cocktail Shaker Sort");
        cocktailShakerSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Cocktail Shaker Sort", () -> cocktailShakerSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(cocktailShakerSortButton);

        combSortButton = new JButton("Comb Sort");
        combSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Comb Sort", () -> combSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(combSortButton);

        cycleSortButton = new JButton("Cycle Sort");
        cycleSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Cycle Sort", () -> cycleSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(cycleSortButton);

        oddEvenSortButton = new JButton("Odd-Even Sort");
        oddEvenSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Odd-Even Sort", () -> oddEvenSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(oddEvenSortButton);

        pancakeSortButton = new JButton("Pancake Sort");
        pancakeSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Pancake Sort", () -> pancakeSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(pancakeSortButton);

        gnomeSortButton = new JButton("Gnome Sort");
        gnomeSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Gnome Sort", () -> gnomeSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(gnomeSortButton);

        beadSortButton = new JButton("Bead Sort");
        beadSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Bead Sort", () -> beadSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(beadSortButton);

        sleepSortButton = new JButton("Sleep Sort");
        sleepSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Sleep Sort", () -> sleepSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(sleepSortButton);

        timSortButton = new JButton("Tim Sort");
        timSortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int preferredQuantity = getPreferredQuantity();
                if (preferredQuantity >= 2) {
                    gridSize = preferredQuantity;
                    generateRandomCircles();
                    startSortingAnimation("Tim Sort", () -> timSort());
                } else {
                    JOptionPane.showMessageDialog(CircleSortingApps.this, "Please enter a valid quantity (>= 2).", "Invalid Quantity", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        topPanel.add(timSortButton);

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

        pack();
        setVisible(true);
    }

    private int getPreferredQuantity() {
        String input = inputTextField.getText();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return -1; // Invalid input
        }
    }

    private void generateRandomCircles() {
        circleValues = new int[gridSize];

        // Populate the circleValues with numbers from 1 to gridSize
        for (int i = 0; i < gridSize; i++) {
            circleValues[i] = i + 1;
        }

        // Shuffle the circleValues to randomize the locations
        List<Integer> list = Arrays.asList(Arrays.stream(circleValues).boxed().toArray(Integer[]::new));
        Collections.shuffle(list);
        circleValues = list.stream().mapToInt(Integer::intValue).toArray();

        isSorted = false; // Fix: Reset isSorted flag to false
        sortingPanel.repaint();
    }

    private void selectionSort() {
        int n = circleValues.length;
        swapCount = 0;
        startTime = System.currentTimeMillis();

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (circleValues[j] < circleValues[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = circleValues[i];
                circleValues[i] = circleValues[minIndex];
                circleValues[minIndex] = temp;
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

        isSorted = true;
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

    private void stoogeSort() {
        stoogeSort(0, circleValues.length - 1);
        isSorted = true;
        sortingPanel.repaint();
    }

    private void stoogeSort(int left, int right) {
        if (circleValues[left] > circleValues[right]) {
            int temp = circleValues[left];
            circleValues[left] = circleValues[right];
            circleValues[right] = temp;

            sortingPanel.repaint();

            updateElapsedTime();

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if (right - left + 1 > 2) {
            int third = (right - left + 1) / 3;

            stoogeSort(left, right - third);
            stoogeSort(left + third, right);
            stoogeSort(left, right - third);
        }
    }

    private void quickSort() {
        quickSort(0, circleValues.length - 1);
        isSorted = true;
        sortingPanel.repaint();
    }

    private void quickSort(int low, int high) {
        if (low < high) {
            int partitionIndex = partition(low, high);

            quickSort(low, partitionIndex - 1);
            quickSort(partitionIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        int pivot = circleValues[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (circleValues[j] < pivot) {
                i++;

                int temp = circleValues[i];
                circleValues[i] = circleValues[j];
                circleValues[j] = temp;

                sortingPanel.repaint();

                updateElapsedTime();

                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        int temp = circleValues[i + 1];
        circleValues[i + 1] = circleValues[high];
        circleValues[high] = temp;

        sortingPanel.repaint();

        updateElapsedTime();

        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return i + 1;
    }

    private void insertionSort() {
        int n = circleValues.length;
        startTime = System.currentTimeMillis();

        for (int i = 1; i < n; i++) {
            int key = circleValues[i];
            int j = i - 1;

            while (j >= 0 && circleValues[j] > key) {
                circleValues[j + 1] = circleValues[j];
                j = j - 1;
            }

            circleValues[j + 1] = key;

            sortingPanel.repaint();

            updateElapsedTime();

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        isSorted = true;
        sortingPanel.repaint();
    }

    private void bucketSort() {
        int n = circleValues.length;
        int maxVal = getMaxValue();
        int numBuckets = (int) Math.sqrt(n);

        List<Integer>[] buckets = new List[numBuckets];
        for (int i = 0; i < numBuckets; i++) {
            buckets[i] = new java.util.LinkedList<>();
        }

        for (int value : circleValues) {
            int bucketIndex = (int) (value * 1.0 / maxVal * (numBuckets - 1));
            buckets[bucketIndex].add(value);
        }

        int currentIndex = 0;
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
            for (int value : bucket) {
                circleValues[currentIndex++] = value;

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

    // Additional Sorting Algorithms

    private void cocktailShakerSort() {
        int n = circleValues.length;
        swapCount = 0;
        startTime = System.currentTimeMillis();

        boolean swapped;
        do {
            swapped = false;

            // Sort from left to right, like Bubble Sort
            for (int i = 0; i < n - 1; i++) {
                if (circleValues[i] > circleValues[i + 1]) {
                    int temp = circleValues[i];
                    circleValues[i] = circleValues[i + 1];
                    circleValues[i + 1] = temp;
                    swapped = true;

                    sortingPanel.repaint();

                    updateElapsedTime();

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

            // If nothing is swapped, the array is sorted
            if (!swapped) {
                break;
            }

            // Otherwise, reset the flag and sort from right to left
            swapped = false;
            for (int i = n - 2; i >= 0; i--) {
                if (circleValues[i] > circleValues[i + 1]) {
                    int temp = circleValues[i];
                    circleValues[i] = circleValues[i + 1];
                    circleValues[i + 1] = temp;
                    swapped = true;

                    sortingPanel.repaint();

                    updateElapsedTime();

                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        } while (swapped);

        isSorted = true;
        sortingPanel.repaint();
    }

    private void combSort() {
        int n = circleValues.length;
        swapCount = 0;
        startTime = System.currentTimeMillis();

        int gap = n;
        boolean swapped = true;

        while (gap > 1 || swapped) {
            gap = getNextGap(gap);
            swapped = false;

            for (int i = 0; i < n - gap; i++) {
                if (circleValues[i] > circleValues[i + gap]) {
                    int temp = circleValues[i];
                    circleValues[i] = circleValues[i + gap];
                    circleValues[i + gap] = temp;
                    swapped = true;
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

    private int getNextGap(int gap) {
        gap = (gap * 10) / 13;
        return Math.max(gap, 1);
    }

    private void cycleSort() {
        int n = circleValues.length;
        swapCount = 0;
        startTime = System.currentTimeMillis();

        for (int cycleStart = 0; cycleStart < n - 1; cycleStart++) {
            int item = circleValues[cycleStart];

            int pos = cycleStart;
            for (int i = cycleStart + 1; i < n; i++) {
                if (circleValues[i] < item) {
                    pos++;
                }
            }

            if (pos == cycleStart) {
                continue;
            }

            while (item == circleValues[pos]) {
                pos++;
            }

            if (pos != cycleStart) {
                int temp = item;
                item = circleValues[pos];
                circleValues[pos] = temp;
                swapCount++;

                sortingPanel.repaint();

                updateElapsedTime();

                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            while (pos != cycleStart) {
                pos = cycleStart;
                for (int i = cycleStart + 1; i < n; i++) {
                    if (circleValues[i] < item) {
                        pos++;
                    }
                }

                while (item == circleValues[pos]) {
                    pos++;
                }

                if (item != circleValues[pos]) {
                    int temp = item;
                    item = circleValues[pos];
                    circleValues[pos] = temp;
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

    private void oddEvenSort() {
        int n = circleValues.length;
        swapCount = 0;
        startTime = System.currentTimeMillis();

        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            // Perform odd-even sort on odd indices
            for (int i = 1; i <= n - 2; i += 2) {
                if (circleValues[i] > circleValues[i + 1]) {
                    int temp = circleValues[i];
                    circleValues[i] = circleValues[i + 1];
                    circleValues[i + 1] = temp;
                    isSorted = false;
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

            // Perform odd-even sort on even indices
            for (int i = 0; i <= n - 2; i += 2) {
                if (circleValues[i] > circleValues[i + 1]) {
                    int temp = circleValues[i];
                    circleValues[i] = circleValues[i + 1];
                    circleValues[i + 1] = temp;
                    isSorted = false;
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

    private void pancakeSort() {
        int n = circleValues.length;
        swapCount = 0;
        startTime = System.currentTimeMillis();

        for (int currentSize = n; currentSize > 1; currentSize--) {
            int maxIndex = getMaxIndex(currentSize);

            if (maxIndex != currentSize - 1) {
                flip(maxIndex);
                flip(currentSize - 1);
            }

            sortingPanel.repaint();

            updateElapsedTime();

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        isSorted = true;
        sortingPanel.repaint();
    }

    private int getMaxIndex(int n) {
        int maxIndex = 0;
        for (int i = 0; i < n; i++) {
            if (circleValues[i] > circleValues[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    private void flip(int endIndex) {
        int start = 0;
        while (start < endIndex) {
            int temp = circleValues[start];
            circleValues[start] = circleValues[endIndex];
            circleValues[endIndex] = temp;
            start++;
            endIndex--;
            swapCount++;
        }
    }

    private void gnomeSort() {
        int n = circleValues.length;
        swapCount = 0;
        startTime = System.currentTimeMillis();

        int index = 0;
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

        isSorted = true;
        sortingPanel.repaint();
    }

    private void beadSort() {
        int n = circleValues.length;
        int maxVal = getMaxValue();
        swapCount = 0;
        startTime = System.currentTimeMillis();

        boolean[][] grid = new boolean[n][maxVal];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < circleValues[i]; j++) {
                grid[i][j] = true;
            }
        }

        for (int j = 0; j < maxVal; j++) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                if (grid[i][j]) {
                    circleValues[i] = 1;
                    sum++;
                } else {
                    circleValues[i] = 0;
                }

                sortingPanel.repaint();

                updateElapsedTime();

                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            for (int i = n - sum; i < n; i++) {
                circleValues[i] = 0;

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

    private int getMaxValue() {
        int max = circleValues[0];
        for (int i = 1; i < circleValues.length; i++) {
            if (circleValues[i] > max) {
                max = circleValues[i];
            }
        }
        return max;
    }

    private void sleepSort() {
        int n = circleValues.length;
        swapCount = 0;
        startTime = System.currentTimeMillis();

        Thread[] threads = new Thread[n];
        for (int i = 0; i < n; i++) {
            final int value = circleValues[i];
            threads[i] = new Thread(() -> {
                try {
                    Thread.sleep(value * 100); // Sleep in milliseconds
                    System.out.print(value + " "); // Output the sorted value (not used for sorting)
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        isSorted = true;
        sortingPanel.repaint();
    }

    private void timSort() {
        int n = circleValues.length;
        swapCount = 0;
        startTime = System.currentTimeMillis();

        final int RUN = 32;
        for (int i = 0; i < n; i += RUN) {
            insertionSortForTimSort(i, Math.min((i + 31), (n - 1)));
        }

        for (int size = RUN; size < n; size = 2 * size) {
            for (int left = 0; left < n; left += 2 * size) {
                int mid = left + size - 1;
                int right = Math.min((left + 2 * size - 1), (n - 1));

                mergeForTimSort(left, mid, right);
            }
        }

        isSorted = true;
        sortingPanel.repaint();
    }

    private void insertionSortForTimSort(int left, int right) {
        for (int i = left + 1; i <= right; i++) {
            int temp = circleValues[i];
            int j = i - 1;
            while (j >= left && circleValues[j] > temp) {
                circleValues[j + 1] = circleValues[j];
                j--;
            }
            circleValues[j + 1] = temp;

            sortingPanel.repaint();

            updateElapsedTime();

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void mergeForTimSort(int left, int mid, int right) {
        int len1 = mid - left + 1;
        int len2 = right - mid;

        int[] leftArray = new int[len1];
        int[] rightArray = new int[len2];

        for (int i = 0; i < len1; i++) {
            leftArray[i] = circleValues[left + i];
        }
        for (int i = 0; i < len2; i++) {
            rightArray[i] = circleValues[mid + 1 + i];
        }

        int i = 0, j = 0, k = left;

        while (i < len1 && j < len2) {
            if (leftArray[i] <= rightArray[j]) {
                circleValues[k] = leftArray[i];
                i++;
            } else {
                circleValues[k] = rightArray[j];
                j++;
            }
            k++;

            sortingPanel.repaint();

            updateElapsedTime();

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (i < len1) {
            circleValues[k] = leftArray[i];
            i++;
            k++;

            sortingPanel.repaint();

            updateElapsedTime();

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        while (j < len2) {
            circleValues[k] = rightArray[j];
            j++;
            k++;

            sortingPanel.repaint();

            updateElapsedTime();

            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void startSortingAnimation(String sortName, Runnable sortingAlgorithm) {
        new Thread(() -> {
            if (sortingAlgorithm != null) {
                disableButtons();

                sortingAlgorithm.run();

                enableButtons();

                long endTime = System.currentTimeMillis();
                long elapsedTime = endTime - startTime;
                timeLabel.setText("Time Elapsed: " + elapsedTime + " ms");
                swapCount = 0;
            }
        }).start();
    }

    private void disableButtons() {
        selectionSortButton.setEnabled(false);
        bubbleSortButton.setEnabled(false);
        stoogeSortButton.setEnabled(false);
        quickSortButton.setEnabled(false);
        insertionSortButton.setEnabled(false);
        bucketSortButton.setEnabled(false);
        cocktailShakerSortButton.setEnabled(false);
        combSortButton.setEnabled(false);
        cycleSortButton.setEnabled(false);
        oddEvenSortButton.setEnabled(false);
        pancakeSortButton.setEnabled(false);
        gnomeSortButton.setEnabled(false);
        beadSortButton.setEnabled(false);
        sleepSortButton.setEnabled(false);
        timSortButton.setEnabled(false);
    }

    private void enableButtons() {
        selectionSortButton.setEnabled(true);
        bubbleSortButton.setEnabled(true);
        stoogeSortButton.setEnabled(true);
        quickSortButton.setEnabled(true);
        insertionSortButton.setEnabled(true);
        bucketSortButton.setEnabled(true);
        cocktailShakerSortButton.setEnabled(true);
        combSortButton.setEnabled(true);
        cycleSortButton.setEnabled(true);
        oddEvenSortButton.setEnabled(true);
        pancakeSortButton.setEnabled(true);
        gnomeSortButton.setEnabled(true);
        beadSortButton.setEnabled(true);
        sleepSortButton.setEnabled(true);
        timSortButton.setEnabled(true);
    }

    private void updateElapsedTime() {
        long currentTime = System.currentTimeMillis();
        long elapsedTime = currentTime - startTime;
        timeLabel.setText("Time Elapsed: " + elapsedTime + " ms");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CircleSortingApps();
            }
        });
    }
}
