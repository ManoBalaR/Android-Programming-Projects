package aa.answerarea;

import android.app.Application;
import android.os.SystemClock;

/**
 * Created by Mano Bala on 21-08-2017.
 */

public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        SystemClock.sleep(1500);
    }
}

