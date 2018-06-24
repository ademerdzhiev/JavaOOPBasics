package p05_OnlineRadioDatabase;


public class Song {
    private String artistName;
    private String songName;
    private Long songLengthMins;
    private Long songLengthSeconds;

    public Song(String artistName, String songName, Long songLengthMins, Long songLengthSeconds) {
        this.setArtistName(artistName);
        this.setSongName(songName);
        this.setSongLengthMins(songLengthMins);
        this.setGetSongLengthSeconds(songLengthSeconds);
    }


    public void setArtistName(String artistName) {
        if (artistName.length() < 3 || artistName.length() > 20) {
            throw new IllegalArgumentException("Artist name should be between 3 and 20 symbols.");
        }
        this.artistName = artistName;
    }

    public void setSongName(String songName) {
        if (songName.length() < 3 || songName.length() > 30) {
            throw new IllegalArgumentException("Song name should be between 3 and 30 symbols.");
        }
        this.songName = songName;
    }


    public Long getSongLengthMins() {
        return songLengthMins;
    }

    public Long getSongLengthSeconds() {
        return songLengthSeconds;
    }

    public void setSongLengthMins(Long songLengthMins) {
        if (songLengthMins < 0 || songLengthMins > 14) {
            throw new IllegalArgumentException("Song minutes should be between 0 and 14.");
        }

        this.songLengthMins = songLengthMins;
    }

    public void setGetSongLengthSeconds(Long songLengthSeconds) {
        if (songLengthSeconds < 0 || songLengthSeconds > 59) {
            throw new IllegalArgumentException("Song seconds should be between 0 and 59.");
        }

        this.songLengthSeconds = songLengthSeconds;
    }

}
