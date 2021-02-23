/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package event_management_system;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

/**
 *
 * @author salman
 */
public class Alarm_class extends Thread{
    
    
   Connection con;
   ResultSet rs;
   Statement st;
   PreparedStatement ps;
    
   
   

    public static void main(String[] args) {
 
        
        new Alarm_class().run();
    }
    

    
    public  void run() {
  try{
         
 String mp3File ="alarm_beep.wav";
 FileInputStream in = new FileInputStream(mp3File);
       
final AudioStream audioStream = new AudioStream(in);
 
 AudioData as= audioStream.getData();
 ContinuousAudioDataStream cs = new ContinuousAudioDataStream(as);

AudioPlayer.player.start(cs);
//AudioPlayer.player.run();

    } catch(Exception e){
            System.out.println(e);
        }
    } 
}

    

