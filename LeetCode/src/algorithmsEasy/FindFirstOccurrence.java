package algorithmsEasy;

public class FindFirstOccurrence {

    public static void main(String[] args) {
        String mainString = "Hello, world! Hello, Java!";
        String substringToFind = "Hellos";

        int firstOccurrenceIndex = findFirstOccurrence(mainString, substringToFind);

        if (firstOccurrenceIndex != -1) {
            System.out.println("First occurrence of '" + substringToFind + "' starts at index: " + firstOccurrenceIndex);
        } else {
            System.out.println("'" + substringToFind + "' not found in the string.");
        }
    }

    private static int findFirstOccurrence(String mainString, String substringToFind) {
        // Use indexOf to find the index of the first occurrence
    	System.out.println(mainString.indexOf(substringToFind));
        return mainString.indexOf(substringToFind);
    }
}
