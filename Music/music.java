public class MusicTest {
    public static void main(String[] args) {

        Album album1 = new Album("Artist1", "Rock");
        Album album2 = new Album("Artist2", "Jazz");


        Song song1 = new Song("Song1", album1);
        Song song2 = new Song("Song2", album1);
        Song song3 = new Song("Song3", album2);


        System.out.println("Song1 and Song2 are on the same album: " + song1.onSameAlbum(song2));
        System.out.println("Song1 and Song3 are on the same album: " + song1.onSameAlbum(song3));

        System.out.println("Album1 has rock music: " + album1.hasRockMusic());
        System.out.println("Album2 has rock music: " + album2.hasRockMusic());

        System.out.println(song1);
        System.out.println(song2);
        System.out.println(song3);
    }
}