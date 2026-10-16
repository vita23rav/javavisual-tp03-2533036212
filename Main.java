
import com.unpri.charactermanager.CharacterManager;
import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Character Manager TP5 ===");

        CharacterManager manager = new CharacterManager();

        // 1. Menambahkan karakter
        Character hero = new Character(
            "Arjuna", CharacterType.WARRIOR, 5
        );
        Character wizard = new Character(
            "Merlin", CharacterType.MAGE, 3
        );
        Character scout = new Character(
            "Athena", CharacterType.ARCHER, 4
        );

        System.out.println("\n=== CREATE ===");
        System.out.println("Arjuna: " + manager.addCharacter(hero));
        System.out.println("Merlin: " + manager.addCharacter(wizard));
        System.out.println("Athena: " + manager.addCharacter(scout));

        // 2. Menguji nama duplikat
        System.out.println("\n=== CEK DUPLIKAT ===");
        Character duplicate = new Character(
            "Arjuna", CharacterType.MAGE, 2
        );
        System.out.println(
            "Tambah Arjuna duplikat: "
            + manager.addCharacter(duplicate)
        );

        // 3. Menampilkan seluruh karakter
        System.out.println("\n=== READ ===");
        for (Character c : manager.getAllCharacters()) {
            System.out.println(c);
        }

        // 4. Mencari karakter
        System.out.println("\n=== FIND BY NAME ===");
        System.out.println(manager.findByName("Merlin"));

        // 5. Menghitung jumlah karakter
        System.out.println("\n=== TOTAL KARAKTER ===");
        System.out.println(manager.getTotalCharacters());

        // 6. Mini-challenge: rata-rata level
        System.out.println("\n=== AVERAGE LEVEL ===");
        System.out.println(manager.getAverageLevel());

        // 7. Mini-challenge: mencari berdasarkan tipe
        System.out.println("\n=== FIND BY TYPE: WARRIOR ===");
        System.out.println(
            manager.findByType(CharacterType.WARRIOR)
        );

        // 8. Fitur analitik: karakter dengan level tertinggi
        System.out.println("\n=== KARAKTER TERKUAT ===");
        System.out.println(manager.findStrongest());

        // 9. Eksperimen reference: daftar yang dikembalikan adalah salinan
        System.out.println("\n=== EKSPERIMEN REFERENCE ===");
        java.util.ArrayList<Character> copy =
            manager.getAllCharacters();

        copy.clear();

        System.out.println(
            "Isi daftar salinan setelah clear: " + copy.size()
        );
        System.out.println(
            "Jumlah karakter asli: "
            + manager.getTotalCharacters()
        );

        // 10. Menghapus karakter
        System.out.println("\n=== DELETE ===");
        System.out.println(
            "Hapus Athena: " + manager.removeCharacter("Athena")
        );
        System.out.println(
            "Jumlah setelah penghapusan: "
            + manager.getTotalCharacters()
        );

        // 11. Menguji daftar kosong
        System.out.println("\n=== UJI DAFTAR KOSONG ===");
        CharacterManager emptyManager = new CharacterManager();
        System.out.println(
            "Rata-rata level daftar kosong: "
            + emptyManager.getAverageLevel()
        );
    }
}
