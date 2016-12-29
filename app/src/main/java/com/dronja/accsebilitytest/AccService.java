package com.dronja.accsebilitytest;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class AccService extends Service {
    public AccService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
