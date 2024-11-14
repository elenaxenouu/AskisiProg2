public class BookitMembersΑΜ {
    public static void main(String[] args) {
        // Λίστα ΑΜ μελών της ομάδας "Book-it" - κάθε μέλος προσθέτει το ΑΜ του
        int[] members_am = {
            // Κάθε μέλος μπορεί να προσθέσει το ΑΜ του εδώ
            8190381, 8220110, 8220071, 8230086, 8220148, 8220143, 8230247, 8220152
        };
        // Εμφάνιση κάθε ΑΜ σε νέα γραμμή
        for (int am : members_am) {
            System.out.println(am);
        }
    }
}
