import java.util.*;
import javax.sound.sampled.*;
import java.net.URL;






public class MusicPlayer2{

String ArtistName;
String AlbumName;
String SongEntry;
String URL;
String FinalURL;


public static void main(String[] args)

{

MusicPlayer player = new MusicPlayer();
player.setURL("http://spotify.com/musiclibrary/");
System.out.println("Please enter an artist or song");
Scanner menu = new Scanner(System.in);
String enterOption = new menu.nextLine();
switch(enterOption)
  case "Artist":

          Scanner entry = new Scanner(System.in);
          String entry2 = new entry.nextLine();
          player.setName(entry2);
          Scanner entry3 = new Scanner(System.in);
          String entry4 = new entry3.nextLine();
          player.setAlbum(entry4);
          Scanner entry5 = new Scanner(System.in);
          String entry6 = new entry5.nextLine();
          player.setSong(entry6);
          String url = player.getURL();
          String name = player.getName();
          player.setURL(url + name);

          break;

System.out.println("Enter Play all or Play song");
Scanner menu2 = new Scanner(System.in);
String enterOption2 = new entry.nextLine();

switch(enterOption2)
      case "Play all from album":
          Scanner entry = new Scanner(System.in);
          String entry2 = new entry.nextLine();
          player.setName(entry2);
          Scanner entry3 = new Scanner(System.in);
          String entry4 = new entry.nextLine();
          player.setAlbum(entry4);
          url = player.getURL();
          name = player.getName();
          String album = player.getAlbum();
          player.setURL(url + name + album);
          player.playAllFromCd();
          break;
      case "Play song"
        Scanner entry = new Scanner(System.in);
        String entry2 = new entry.nextLine();
        player.setName(entry2);
        Scanner entry3 = new Scanner(System.in);
        String entry4 = new entry.nextLine();
        player.setAlbum(entry4);
        System.out.println("Please enter a Track Number")
        Scanner entry5 = new Scanner(System.in);
        String entry6 = new entry.nextLine();
        player.setSong(entry6);
        url = player.getURL();
        name = player.getName();
        album = player.getAlbum();
        String song = player.getSong();
        String songVar = song + "Track1/";
        String urlName = url + name + album;
        String final2 = urlName + song;
        player.setURL(urlName;

        player.setFinalURL(final2);
          //player.play():
          break();

















public void playAllFromCd(String name, String cdname)
{
String[] array ;
array = new String[20];
int number;
Random rand = new Random(20);
String finalUrl;
String urlVar = player.getURL();
String song = getSong();


for(int i = 0; i < array.length(); i++)
{

  number = rand.nextInt(19);
  finalUrl = urlVar + i;
  player.setFinalURL(finalUrl);
  array[i]= player.getFinalURL();


for(int y= 0; y < i; y++)
{
if(array[i] = array[y])
{
i--;

}



}
System.out.println(array);

//play();
}



}

public void play()
{

  String url2 = player.getFinalURL();
  AudioInputStream in = AudioSystemInputStream(new URL(url2);
  AudioFormat baseFormat = in.getFormat();
  baseFormat.getSampleRate(), 16, baseFormat.getChannels(),
                  baseFormat.getChannels() * 2, baseFormat.getSampleRate(),
                  false);
          din = AudioSystem.getAudioInputStream(decodedFormat, in);
          DataLine.Info info = new DataLine.Info(SourceDataLine.class, decodedFormat);
          SourceDataLine line = (SourceDataLine) AudioSystem.getLine(info);
          if(line != null) {
              line.open(decodedFormat);
              byte[] data = new byte[4096];
              // Start
              line.start();
              int nBytesRead;

              while ((nBytesRead = din.read(data, 0, data.length)) != -1) {
                          line.write(data, 0, nBytesRead);
                    }

                    // Stop
                    line.drain();
                    line.stop();
                    line.close();
                    din.close();



}



}













public void setName(String name)
[


ArtistName = name;



]


public void setAlbum(String cdname)
{

AlbumName = cdname;


}
public void setSong(String song)
{

  SongEntry = song;
}
public void setURL(String firsturl)
{

  URL = firsturl;
}
set void finalURL(String url)
{
  FinalURL = url;

}


public String getName()
{

  return ArtistName;
}

public String getAlbum()
{

  return AlbumName;
}

public String getSong()
{

  return SongEntry;
}
public String getURL()
{

  return URL;
}

public String getFinalURL())
{

  return FinalURL;
}




}



}
