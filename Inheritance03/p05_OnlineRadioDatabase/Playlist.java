package p05_OnlineRadioDatabase;

import java.util.LinkedList;
import java.util.List;

public class Playlist {
    private List<Song> playlist;
    private String playlistLength;

    public Playlist() {
        this.playlist = new LinkedList<>();
    }

    public List<Song> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(Song song) {
        this.playlist.add(song);
    }

    public void setPlaylistLength() {
        Long hours = 0l;
        long minutes = 0l;
        long seconds = 0l;

        for (Song song: playlist) {
            seconds += (song.getSongLengthMins()*60) + song.getSongLengthSeconds();
        }

        hours = seconds / 3600;
        minutes = (seconds - hours*3600) / 60;
        seconds = seconds - (hours*3600 + minutes*60);

        this.playlistLength = "Playlist length: " + hours + "h " + minutes + "m " + seconds + "s" + "\n";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Songs added: ").append(playlist.size()).append("\n");
        sb.append(playlistLength);
        return sb.toString();
    }
}
