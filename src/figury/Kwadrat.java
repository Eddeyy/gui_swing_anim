package figury;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.Rectangle2D;

public class Kwadrat extends Figura {
    public Kwadrat(Graphics2D buf, int del, int w, int h, Color color){
        super(buf, del, w, h, color);
        shape = new Rectangle2D.Float(0, 0, 30, 30);
        aft = new AffineTransform();
        area = new Area(shape);
    }
}
