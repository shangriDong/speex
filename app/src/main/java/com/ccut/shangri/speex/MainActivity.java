package com.ccut.shangri.speex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private Speex mSpeex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        byte a[] = new byte[200];
        short b[] = new short[200];
        int size = 8;

        //mSpeex = new Speex();
        //mSpeex.init();

        //mSpeex.getFrameSize();
        //mSpeex.decode(a, b, size);
        //mSpeex.encode(b, size, a, size);
        //mSpeex.close();
    }
}
