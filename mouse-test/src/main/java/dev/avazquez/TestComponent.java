package dev.avazquez;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Arrays;

public class TestComponent extends Component implements MouseListener {

    ArrayList<Color> levels = new ArrayList<Color>(Arrays.asList(Color.green,
            Color.orange, Color.red));

    int counterClicks = 0;
    int width = 10;
    int height = 10;

    public TestComponent(){
        addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("mouseClicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Graphics graphics = this.getGraphics();
        Color color = levels.get(levels.size()-1);

        System.out.println("mousePressed");
        if (counterClicks < levels.size()-1)
            color = levels.get(counterClicks);

        graphics.setColor(color);
        graphics.fillRect(0,0,width,height);
        update(graphics);
        counterClicks++;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("mouseReleased");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("mouseEntered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("mouseExited");
    }
}
