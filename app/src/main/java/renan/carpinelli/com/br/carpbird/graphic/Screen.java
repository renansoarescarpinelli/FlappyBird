package renan.carpinelli.com.br.carpbird.graphic;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by rcarpinelli on 21/09/2017.
 */

public class Screen {

    private DisplayMetrics metrics;

    public Screen(Context context) {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        metrics = new DisplayMetrics();
        display.getMetrics(metrics);
    }

    public int getHeight() {
        return metrics.heightPixels;
    }

    public int getWidth() {
        return metrics.widthPixels;
    }

}
