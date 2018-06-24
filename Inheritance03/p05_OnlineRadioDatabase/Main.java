package p05_OnlineRadioDatabase;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        Integer n = Integer.parseInt(bufferedReader.readLine());

        Playlist playlist = new Playlist();

        for (int i = 0; i < n; i++) {
            String[] songInfo = bufferedReader.readLine().split(";");

            try {
                String artist = songInfo[0];
                String songName = songInfo[1];
                Long minutes = Long.parseLong(songInfo[2].split(":")[0]);
                Long seconds = Long.parseLong(songInfo[2].split(":")[1]);

                Song song = new Song(artist, songName, minutes, seconds);
                System.out.println("Song added.");
                playlist.setPlaylist(song);

            } catch (IllegalArgumentException iae) {
                System.out.println(iae.getMessage());
            }
        }

        playlist.setPlaylistLength();
        System.out.println(playlist.toString());


    }
}
