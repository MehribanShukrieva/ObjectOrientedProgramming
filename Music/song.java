public class Song {
    private String title;
    private Album onAlbum;

    public Song(String title, Album onAlbum) {
        this.title = title;
        this.onAlbum = onAlbum;
    }

    public Album getOnAlbum() {
        return onAlbum;
    }

    public boolean onSameAlbum(Song otherSong) {
        return this.onAlbum.equals(otherSong.getOnAlbum());
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Album: " + onAlbum;
    }
}