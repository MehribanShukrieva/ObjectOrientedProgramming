public class Album {
    private String artist;
    private String genre;

    public Album(String artist, String genre) {
        this.artist = artist;
        this.genre = genre;
    }

    public boolean hasRockMusic() {
        return genre.equalsIgnoreCase("rock");
    }
}