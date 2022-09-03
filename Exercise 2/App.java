import java.util.LinkedList;

class Main {
    public static void main(String[] args) {

         // 1. Create your own music playlist by creating a LinkedList object
        LinkedList<String> Tristantopsongs = new LinkedList<>();

         // 2. Add 5 new songs to your Playlist using the add() method
        Playlist.add("Get you");
        Playlist.add("Movie");
        Playlist.add("Instagram");
        Playlist.add("Calico");
        Playlist.add("Easy");

        // 3. Add a new song at the front of the Playlist using the addFirst() method
        Playlist.addFirst("Traingazing");

        // 4. Add a new song at the end of the Playlist using the addLast() method
        Playlist.addLast("Shouldn't be");

        // 5. Display the song at the front of the Playlist using the combination of
        // get() method and the println() method
        System.out.println(Playlist.get(0));

        // 6. Replace the last song using the set() method
        Playlist.set(6, "Die for you");

        // 7. Remove the first song using the remove() method
        Playlist.remove(0);

        // 8. Display all songs in your Playlist using the println method
        System.out.println("My updated top songs: " + Tristantopsongs);
    }
}
