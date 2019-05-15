package com.arturo.seidortech.Utilidades;

import android.app.Activity;
import android.graphics.Point;
import android.view.Display;

public class DisplayUtilidades {
    private static double x;
    private static double y;

    public DisplayUtilidades(Activity activity) {
        Display display = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        display.getSize(point);
        x = point.x;
        y = point.y;
    }

    public static double getX() {
        return x;
    }

    public static double getY() {
        return y;
    }
}
