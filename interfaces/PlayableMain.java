package interfaces;

import java.util.Scanner;

interface Playable 
{
 void play();
 void pause();
 void stop();
}



class MP3Player implements Playable 
{
 public void play() 
 {
     System.out.println("Playing MP3 song...");
 }

 public void pause() 
 {
     System.out.println("MP3 playback paused.");
 }

 public void stop() 
 {
     System.out.println("MP3 playback stopped.");
 }
}



class CDPlayer implements Playable 
{
 public void play() 
 {
     System.out.println("Playing CD track...");
 }

 public void pause()
 {
     System.out.println("CD playback paused.");
 }

 public void stop()
 {
     System.out.println("CD playback stopped.");
 }
}



class StreamingPlayer implements Playable 
{
 public void play() 
 {
     System.out.println("Streaming music online...");
 }

 public void pause() 
 {
     System.out.println("Streaming paused.");
 }

 public void stop() 
 {
     System.out.println("Streaming stopped.");
 }
}



public class PlayableMain
{
 public static void main(String[] args)
 {
     Scanner sc = new Scanner(System.in);
     Playable player;

     System.out.println("Select your music player:");
     System.out.println("1. MP3 Player");
     System.out.println("2. CD Player");
     System.out.println("3. Streaming Player");
     System.out.print("Your choice: ");
     int choice = sc.nextInt();

     switch (choice)
     {
         case 1:
             player = new MP3Player();
             break;
         case 2:
             player = new CDPlayer();
             break;
         case 3:
             player = new StreamingPlayer();
             break;
         default:
             System.out.println("Invalid choice. Exiting...");
             return;
     }

     boolean exit = false;

     while (!exit) 
     {
         System.out.println("\n Choose playback action:");
         System.out.println("1. Play");
         System.out.println("2. Pause");
         System.out.println("3. Stop");
         System.out.println("4. Exit");
         System.out.print("Your action: ");
         int action = sc.nextInt();

         switch (action) 
         {
             case 1:
                 player.play();
                 break;
             case 2:
                 player.pause();
                 break;
             case 3:
                 player.stop();
                 break;
             case 4:
                 exit = true;
                 System.out.println("Exiting player. Goodbye!");
                 break;
             default:
                 System.out.println("Invalid action. Try again.");
         }
     }

     sc.close();
 }
}

