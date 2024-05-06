package Challenge;

import java.util.Objects;

public class Song {

    String title;
    String artist;
    double lenght;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Song song = (Song) o;

        if (!Objects.equals(title, song.title)) return false;
        return Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        int result = title != null ? title.hashCode() : 0;
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        return result;
    }
}
