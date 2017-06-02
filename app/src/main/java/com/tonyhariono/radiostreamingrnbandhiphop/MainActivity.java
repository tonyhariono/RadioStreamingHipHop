package com.tonyhariono.radiostreamingrnbandhiphop;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.wang.avi.AVLoadingIndicatorView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    ProgressBar progressBar1,progressBar2,progressBar3,progressBar4,progressBar5,progressBar6,progressBar7,progressBar8,progressBar9,progressBar10;
    Button playstop1,playstop2,playstop3,playstop4,playstop5,playstop6,playstop7,playstop8,playstop9,playstop10;
    AVLoadingIndicatorView avl,av2,av3,av4,av5,av6,av7,av8,av9,av10;
    MediaPlayer player;
    MediaPlayer player1,player2,player3,player4,player5,player6,player7,player8,player9,player10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initControl();

        playstop1.setText("PLAY");
        playstop2.setText("PLAY");
        playstop3.setText("PLAY");
        playstop4.setText("PLAY");
        playstop5.setText("PLAY");
        playstop6.setText("PLAY");
        playstop7.setText("PLAY");
        playstop8.setText("PLAY");
        playstop9.setText("PLAY");
        playstop10.setText("PLAY");

        player=new MediaPlayer();
        player.setAudioStreamType(AudioManager.STREAM_MUSIC);

        player1=new MediaPlayer();
        player1.setAudioStreamType(AudioManager.STREAM_MUSIC);

        player2=new MediaPlayer();
        player2.setAudioStreamType(AudioManager.STREAM_MUSIC);

        player3=new MediaPlayer();
        player3.setAudioStreamType(AudioManager.STREAM_MUSIC);

        player4=new MediaPlayer();
        player4.setAudioStreamType(AudioManager.STREAM_MUSIC);

        player5=new MediaPlayer();
        player5.setAudioStreamType(AudioManager.STREAM_MUSIC);

        player6=new MediaPlayer();
        player6.setAudioStreamType(AudioManager.STREAM_MUSIC);

        player7=new MediaPlayer();
        player7.setAudioStreamType(AudioManager.STREAM_MUSIC);

        player8=new MediaPlayer();
        player8.setAudioStreamType(AudioManager.STREAM_MUSIC);

        player9=new MediaPlayer();
        player9.setAudioStreamType(AudioManager.STREAM_MUSIC);

        player10=new MediaPlayer();
        player10.setAudioStreamType(AudioManager.STREAM_MUSIC);

        // inisialisasi url baru
        try {
            player1.setDataSource("http://192.99.8.192:3132/stream");
            player2.setDataSource("http://103.16.198.36:9160/stream");
            player3.setDataSource("http://62.210.75.134:8000/stream/8/");
            player4.setDataSource("http://80.64.65.48:8390/deluxefm");
            player5.setDataSource("http://188.40.135.197:8111/stream");
            player6.setDataSource("http://37.59.119.174:8300/random");
            player7.setDataSource("http://206.190.135.28:8554/stream");
            player8.setDataSource("http://192.254.215.245:8003/stream");
            player9.setDataSource("http://173.192.105.231:5324/Live");
            player10.setDataSource("http://173.192.105.231:7007/Live");
        } catch (IOException e) {
            e.printStackTrace();
        } catch(IllegalArgumentException e){
            e.printStackTrace();
        } catch(IllegalStateException e){
            e.printStackTrace();
        }

        playstop1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // stop player dulu
                /*
                umpetin();
                try{
                    if (player==null) return;
                    if (player.isPlaying()){
                        player.stop();
                    }
                } catch(IllegalStateException e) {
                    e.printStackTrace();
                }
                */
                if(playstop1.getText()=="PLAY"){
                    if ((!player1.isPlaying()) && (!player2.isPlaying()) && (!player3.isPlaying()) && (!player4.isPlaying()) && (!player5.isPlaying()) && (!player6.isPlaying()) && (!player7.isPlaying()) && (!player8.isPlaying()) && (!player9.isPlaying()) && (!player10.isPlaying())) {
                        jalankan1();
                        playstop1.setText("STOP");
                        progressBar1.setVisibility(View.VISIBLE);
                        avl.setVisibility(View.VISIBLE);
                    }
                } else if(playstop1.getText()=="STOP"){
                    berhenti1();
                    playstop1.setText("PLAY");
                    progressBar1.setVisibility(View.INVISIBLE);
                    avl.setVisibility(View.INVISIBLE);
                }

            }
        });

        playstop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //2
                if(playstop2.getText()=="PLAY"){
                    if ((!player1.isPlaying()) && (!player2.isPlaying()) && (!player3.isPlaying()) && (!player4.isPlaying()) && (!player5.isPlaying()) && (!player6.isPlaying()) && (!player7.isPlaying()) && (!player8.isPlaying()) && (!player9.isPlaying()) && (!player10.isPlaying())) {
                        jalankan2();
                        playstop2.setText("STOP");
                        progressBar2.setVisibility(View.VISIBLE);
                        av2.setVisibility(View.VISIBLE);
                    }
                } else if(playstop2.getText()=="STOP"){
                    berhenti2();
                    playstop2.setText("PLAY");
                    progressBar2.setVisibility(View.INVISIBLE);
                    av2.setVisibility(View.INVISIBLE);
                }

            }
        });

        playstop3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //3
                if(playstop3.getText()=="PLAY"){
                    if ((!player1.isPlaying()) && (!player2.isPlaying()) && (!player3.isPlaying()) && (!player4.isPlaying()) && (!player5.isPlaying()) && (!player6.isPlaying()) && (!player7.isPlaying()) && (!player8.isPlaying()) && (!player9.isPlaying()) && (!player10.isPlaying())) {
                        jalankan3();
                        playstop3.setText("STOP");
                        progressBar3.setVisibility(View.VISIBLE);
                        av3.setVisibility(View.VISIBLE);
                    }
                } else if(playstop3.getText()=="STOP"){
                    berhenti3();
                    playstop3.setText("PLAY");
                    progressBar3.setVisibility(View.INVISIBLE);
                    av3.setVisibility(View.INVISIBLE);
                }
            }
        });

        playstop4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //4
                if(playstop4.getText()=="PLAY"){
                    if ((!player1.isPlaying()) && (!player2.isPlaying()) && (!player3.isPlaying()) && (!player4.isPlaying()) && (!player5.isPlaying()) && (!player6.isPlaying()) && (!player7.isPlaying()) && (!player8.isPlaying()) && (!player9.isPlaying()) && (!player10.isPlaying())) {
                        jalankan4();
                        playstop4.setText("STOP");
                        progressBar4.setVisibility(View.VISIBLE);
                        av4.setVisibility(View.VISIBLE);
                    }
                } else if(playstop4.getText()=="STOP"){
                    berhenti4();
                    playstop4.setText("PLAY");
                    progressBar4.setVisibility(View.INVISIBLE);
                    av4.setVisibility(View.INVISIBLE);
                }

            }
        });

        playstop5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //5
                if(playstop5.getText()=="PLAY"){
                    if ((!player1.isPlaying()) && (!player2.isPlaying()) && (!player3.isPlaying()) && (!player4.isPlaying()) && (!player5.isPlaying()) && (!player6.isPlaying()) && (!player7.isPlaying()) && (!player8.isPlaying()) && (!player9.isPlaying()) && (!player10.isPlaying())) {
                        jalankan5();
                        playstop5.setText("STOP");
                        progressBar5.setVisibility(View.VISIBLE);
                        av5.setVisibility(View.VISIBLE);
                    }
                } else if(playstop5.getText()=="STOP"){
                    berhenti5();
                    playstop5.setText("PLAY");
                    progressBar5.setVisibility(View.INVISIBLE);
                    av5.setVisibility(View.INVISIBLE);
                }

            }
        });

        playstop6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //6
                if(playstop6.getText()=="PLAY"){
                    if ((!player1.isPlaying()) && (!player2.isPlaying()) && (!player3.isPlaying()) && (!player4.isPlaying()) && (!player5.isPlaying()) && (!player6.isPlaying()) && (!player7.isPlaying()) && (!player8.isPlaying()) && (!player9.isPlaying()) && (!player10.isPlaying())) {
                        jalankan6();
                        playstop6.setText("STOP");
                        progressBar6.setVisibility(View.VISIBLE);
                        av6.setVisibility(View.VISIBLE);
                    }
                } else if(playstop6.getText()=="STOP"){
                    berhenti6();
                    playstop6.setText("PLAY");
                    progressBar6.setVisibility(View.INVISIBLE);
                    av6.setVisibility(View.INVISIBLE);
                }
            }
        });

        playstop7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //7
                if(playstop7.getText()=="PLAY"){
                    if ((!player1.isPlaying()) && (!player2.isPlaying()) && (!player3.isPlaying()) && (!player4.isPlaying()) && (!player5.isPlaying()) && (!player6.isPlaying()) && (!player7.isPlaying()) && (!player8.isPlaying()) && (!player9.isPlaying()) && (!player10.isPlaying())) {
                        jalankan7();
                        playstop7.setText("STOP");
                        progressBar7.setVisibility(View.VISIBLE);
                        av7.setVisibility(View.VISIBLE);
                    }
                } else if(playstop7.getText()=="STOP"){
                    berhenti7();
                    playstop7.setText("PLAY");
                    progressBar7.setVisibility(View.INVISIBLE);
                    av7.setVisibility(View.INVISIBLE);
                }
            }
        });

        playstop8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //8
                if(playstop8.getText()=="PLAY"){
                    if ((!player1.isPlaying()) && (!player2.isPlaying()) && (!player3.isPlaying()) && (!player4.isPlaying()) && (!player5.isPlaying()) && (!player6.isPlaying()) && (!player7.isPlaying()) && (!player8.isPlaying()) && (!player9.isPlaying()) && (!player10.isPlaying())) {
                        jalankan8();
                        playstop8.setText("STOP");
                        progressBar8.setVisibility(View.VISIBLE);
                        av8.setVisibility(View.VISIBLE);
                    }
                } else if(playstop8.getText()=="STOP"){
                    berhenti8();
                    playstop8.setText("PLAY");
                    progressBar8.setVisibility(View.INVISIBLE);
                    av8.setVisibility(View.INVISIBLE);
                }
            }
        });

        playstop9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //9
                if(playstop9.getText()=="PLAY"){
                    if ((!player1.isPlaying()) && (!player2.isPlaying()) && (!player3.isPlaying()) && (!player4.isPlaying()) && (!player5.isPlaying()) && (!player6.isPlaying()) && (!player7.isPlaying()) && (!player8.isPlaying()) && (!player9.isPlaying()) && (!player10.isPlaying())) {
                        jalankan9();
                        playstop9.setText("STOP");
                        progressBar9.setVisibility(View.VISIBLE);
                        av9.setVisibility(View.VISIBLE);
                    }
                } else if(playstop9.getText()=="STOP"){
                    berhenti9();
                    playstop9.setText("PLAY");
                    progressBar9.setVisibility(View.INVISIBLE);
                    av9.setVisibility(View.INVISIBLE);
                }
            }
        });

        playstop10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //10
                if(playstop10.getText()=="PLAY"){
                    if ((!player1.isPlaying()) && (!player2.isPlaying()) && (!player3.isPlaying()) && (!player4.isPlaying()) && (!player5.isPlaying()) && (!player6.isPlaying()) && (!player7.isPlaying()) && (!player8.isPlaying()) && (!player9.isPlaying()) && (!player10.isPlaying())) {
                        jalankan10();
                        playstop10.setText("STOP");
                        progressBar10.setVisibility(View.VISIBLE);
                        av10.setVisibility(View.VISIBLE);
                    }
                } else if(playstop10.getText()=="STOP"){
                    berhenti10();
                    playstop10.setText("PLAY");
                    progressBar10.setVisibility(View.INVISIBLE);
                    av10.setVisibility(View.INVISIBLE);
                }
            }
        });

    }

    private void umpetin() {
        progressBar1.setVisibility(View.INVISIBLE);
        avl.setVisibility(View.INVISIBLE);

        progressBar2.setVisibility(View.INVISIBLE);
        av2.setVisibility(View.INVISIBLE);

        progressBar3.setVisibility(View.INVISIBLE);
        av3.setVisibility(View.INVISIBLE);

        progressBar4.setVisibility(View.INVISIBLE);
        av4.setVisibility(View.INVISIBLE);

        progressBar5.setVisibility(View.INVISIBLE);
        av5.setVisibility(View.INVISIBLE);

        progressBar6.setVisibility(View.INVISIBLE);
        av6.setVisibility(View.INVISIBLE);

        progressBar7.setVisibility(View.INVISIBLE);
        av7.setVisibility(View.INVISIBLE);

        progressBar8.setVisibility(View.INVISIBLE);
        av8.setVisibility(View.INVISIBLE);

        progressBar9.setVisibility(View.INVISIBLE);
        av9.setVisibility(View.INVISIBLE);

        progressBar10.setVisibility(View.INVISIBLE);
        av10.setVisibility(View.INVISIBLE);

        playstop1.setText("PLAY");
        playstop2.setText("PLAY");
        playstop3.setText("PLAY");
        playstop4.setText("PLAY");
        playstop5.setText("PLAY");
        playstop6.setText("PLAY");
        playstop7.setText("PLAY");
        playstop8.setText("PLAY");
        playstop9.setText("PLAY");
        playstop10.setText("PLAY");
    }

    private void jalankan1() {
        try {
            player1.prepareAsync();
            player1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    player1.start();
                }
            });
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }

    private void berhenti1() {
        try{
            if (player1==null) return;
            if (player1.isPlaying()){
                player1.stop();
            }
        } catch(IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void jalankan2() {
        try {
            player2.prepareAsync();
            player2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    player2.start();
                }
            });
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }

    private void berhenti2() {
        try{
            if (player2==null) return;
            if (player2.isPlaying()){
                player2.stop();
            }
        } catch(IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void jalankan3() {
        try {
            player3.prepareAsync();
            player3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    player3.start();
                }
            });
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }

    private void berhenti3() {
        try{
            if (player3==null) return;
            if (player3.isPlaying()){
                player3.stop();
            }
        } catch(IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void jalankan4() {
        try {
            player4.prepareAsync();
            player4.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    player4.start();
                }
            });
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }

    private void berhenti4() {
        try{
            if (player4==null) return;
            if (player4.isPlaying()){
                player4.stop();
            }
        } catch(IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void jalankan5() {
        try {
            player5.prepareAsync();
            player5.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    player5.start();
                }
            });
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }

    private void berhenti5() {
        try{
            if (player5==null) return;
            if (player5.isPlaying()){
                player5.stop();
            }
        } catch(IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void jalankan6() {
        try {
            player6.prepareAsync();
            player6.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    player6.start();
                }
            });
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }

    private void berhenti6() {
        try{
            if (player6==null) return;
            if (player6.isPlaying()){
                player6.stop();
            }
        } catch(IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void jalankan7() {
        try {
            player7.prepareAsync();
            player7.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    player7.start();
                }
            });
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }

    private void berhenti7() {
        try{
            if (player7==null) return;
            if (player7.isPlaying()){
                player7.stop();
            }
        } catch(IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void jalankan8() {
        try {
            player8.prepareAsync();
            player8.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    player8.start();
                }
            });
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }

    private void berhenti8() {
        try{
            if (player8==null) return;
            if (player8.isPlaying()){
                player8.stop();
            }
        } catch(IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void jalankan9() {
        try {
            player9.prepareAsync();
            player9.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    player9.start();
                }
            });
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }

    private void berhenti9() {
        try{
            if (player9==null) return;
            if (player9.isPlaying()){
                player9.stop();
            }
        } catch(IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void jalankan10() {
        try {
            player10.prepareAsync();
            player10.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                @Override
                public void onPrepared(MediaPlayer mp) {
                    player10.start();
                }
            });
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }

    private void berhenti10() {
        try{
            if (player10==null) return;
            if (player10.isPlaying()){
                player10.stop();
            }
        } catch(IllegalStateException e) {
            e.printStackTrace();
        }
    }

    private void initControl() {
        progressBar1=(ProgressBar) findViewById(R.id.progressBar1);
        progressBar2=(ProgressBar) findViewById(R.id.progressBar2);
        progressBar3=(ProgressBar) findViewById(R.id.progressBar3);
        progressBar4=(ProgressBar) findViewById(R.id.progressBar4);
        progressBar5=(ProgressBar) findViewById(R.id.progressBar5);
        progressBar6=(ProgressBar) findViewById(R.id.progressBar6);
        progressBar7=(ProgressBar) findViewById(R.id.progressBar7);
        progressBar8=(ProgressBar) findViewById(R.id.progressBar8);
        progressBar9=(ProgressBar) findViewById(R.id.progressBar9);
        progressBar10=(ProgressBar) findViewById(R.id.progressBar10);

        playstop1=(Button) findViewById(R.id.btnPlayStop1);
        playstop2=(Button) findViewById(R.id.btnPlayStop2);
        playstop3=(Button) findViewById(R.id.btnPlayStop3);
        playstop4=(Button) findViewById(R.id.btnPlayStop4);
        playstop5=(Button) findViewById(R.id.btnPlayStop5);
        playstop6=(Button) findViewById(R.id.btnPlayStop6);
        playstop7=(Button) findViewById(R.id.btnPlayStop7);
        playstop8=(Button) findViewById(R.id.btnPlayStop8);
        playstop9=(Button) findViewById(R.id.btnPlayStop9);
        playstop10=(Button) findViewById(R.id.btnPlayStop10);

        progressBar1.setMax(100);
        progressBar1.setVisibility(View.INVISIBLE);
        progressBar1.setIndeterminate(true);

        progressBar2.setMax(100);
        progressBar2.setVisibility(View.INVISIBLE);
        progressBar2.setIndeterminate(true);

        progressBar3.setMax(100);
        progressBar3.setVisibility(View.INVISIBLE);
        progressBar3.setIndeterminate(true);

        progressBar4.setMax(100);
        progressBar4.setVisibility(View.INVISIBLE);
        progressBar4.setIndeterminate(true);

        progressBar5.setMax(100);
        progressBar5.setVisibility(View.INVISIBLE);
        progressBar5.setIndeterminate(true);

        progressBar6.setMax(100);
        progressBar6.setVisibility(View.INVISIBLE);
        progressBar6.setIndeterminate(true);

        progressBar7.setMax(100);
        progressBar7.setVisibility(View.INVISIBLE);
        progressBar7.setIndeterminate(true);

        progressBar8.setMax(100);
        progressBar8.setVisibility(View.INVISIBLE);
        progressBar8.setIndeterminate(true);

        progressBar9.setMax(100);
        progressBar9.setVisibility(View.INVISIBLE);
        progressBar9.setIndeterminate(true);

        progressBar10.setMax(100);
        progressBar10.setVisibility(View.INVISIBLE);
        progressBar10.setIndeterminate(true);

        avl=(AVLoadingIndicatorView) findViewById(R.id.avloading1);
        avl.setVisibility(View.INVISIBLE);

        av2=(AVLoadingIndicatorView) findViewById(R.id.avloading2);
        av2.setVisibility(View.INVISIBLE);

        av3=(AVLoadingIndicatorView) findViewById(R.id.avloading3);
        av3.setVisibility(View.INVISIBLE);

        av4=(AVLoadingIndicatorView) findViewById(R.id.avloading4);
        av4.setVisibility(View.INVISIBLE);

        av5=(AVLoadingIndicatorView) findViewById(R.id.avloading5);
        av5.setVisibility(View.INVISIBLE);

        av6=(AVLoadingIndicatorView) findViewById(R.id.avloading6);
        av6.setVisibility(View.INVISIBLE);

        av7=(AVLoadingIndicatorView) findViewById(R.id.avloading7);
        av7.setVisibility(View.INVISIBLE);

        av8=(AVLoadingIndicatorView) findViewById(R.id.avloading8);
        av8.setVisibility(View.INVISIBLE);

        av9=(AVLoadingIndicatorView) findViewById(R.id.avloading9);
        av9.setVisibility(View.INVISIBLE);

        av10=(AVLoadingIndicatorView) findViewById(R.id.avloading10);
        av10.setVisibility(View.INVISIBLE);

    }
}
