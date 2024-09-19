package Ex13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class RecordingSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Recording[] recordings = new Recording[5];

        // Prompt user for recording details
        for (int i = 0; i < recordings.length; i++) {
            System.out.println("Enter details for recording " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = scanner.nextLine();
            System.out.print("Artist: ");
            String artist = scanner.nextLine();
            System.out.print("Playing Time (in seconds): ");
            int playingTime = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            recordings[i] = new Recording(title, artist, playingTime);
        }

        // Prompt user for sorting preference
        System.out.println("Sort recordings by (1) Title, (2) Artist, (3) Playing Time:");
        int sortChoice = scanner.nextInt();

        // Sort recordings based on user choice
        switch (sortChoice) {
            case 1:
                Arrays.sort(recordings, Comparator.comparing(Recording::getTitle));
                break;
            case 2:
                Arrays.sort(recordings, Comparator.comparing(Recording::getArtist));
                break;
            case 3:
                Arrays.sort(recordings, Comparator.comparingInt(Recording::getPlayingTime));
                break;
            default:
                System.out.println("Invalid choice. No sorting will be performed.");
                break;
        }

        // Display sorted recordings
        System.out.println("Sorted Recordings:");
        for (Recording recording : recordings) {
            System.out.println(recording);
        }

        scanner.close();
    }
}
