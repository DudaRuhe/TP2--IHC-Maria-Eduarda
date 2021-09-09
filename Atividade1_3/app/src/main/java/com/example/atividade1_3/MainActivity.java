package com.example.atividade1_3;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;




public class MainActivity extends AppCompatActivity {
    private SensorManager sensorManager;
    private Sensor acelerando;
    EditText sensorX;
    EditText sensorY;
    EditText sensorZ;
    SensorEvent event;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorX = (EditText)findViewById(R.id.textX);
        sensorY = (EditText)findViewById(R.id.textY);
        sensorZ = (EditText)findViewById(R.id.textZ);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        acelerando = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        boolean b = sensorManager.registerListener(MainActivity.this, acelerando, SensorManager.SENSOR_DELAY_NORMAL);


    }
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
    }
    public void onSensorChanged(SensorEvent event) {


            sensorX.setText(""+event.values[0]);
            sensorY.setText(""+event.values[1]);
            sensorZ.setText(""+event.values[2]);

    }

}

