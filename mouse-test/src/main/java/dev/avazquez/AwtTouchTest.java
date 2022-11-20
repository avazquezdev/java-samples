package dev.avazquez;

import java.awt.*;

public class AwtTouchTest {
    public static void main(String[] args) {
        int width = 400;
        int height = 400;
        Frame frame = new Frame("AwtTouchTest");
        frame.setPreferredSize(new Dimension(width,height));
        int rows = height/10;
        int cols = width/10;
        GridLayout gridLayout = new GridLayout(rows, cols, 0,0);
        frame.setLayout(gridLayout);
        for (int i = 0; i < gridLayout.getRows(); i++) {
            for (int j = 0; j < gridLayout.getColumns(); j++) {
                System.out.println("Create new component");
                TestComponent component = new TestComponent();
                frame.add(component);
            }
        }
        frame.pack();
        frame.show();
    }
}
