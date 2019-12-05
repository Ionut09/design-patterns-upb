package ionut.training;

import java.util.Enumeration;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;

import static java.awt.Font.BOLD;

public class UIUtils {
    public static void setUIFont(int size) {
        FontUIResource f = new FontUIResource("Tahoma", BOLD, size);
        Enumeration keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource) UIManager.put(key, f);
        }
    }
}
