import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterType;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== Character Manager v0.1 ===");

        // Membuat 3 karakter
        Character hero = new Character(
            "Arjuna", CharacterType.WARRIOR, 5
        );

        Character wizard = new Character(
            "Merlin", CharacterType.MAGE, 3
        );

        Character scout = new Character(
            "Athena", CharacterType.ARCHER, 4
        );

        // Menampilkan 3 karakter
        System.out.println("\n=== Daftar Karakter ===");
        System.out.println(hero);
        System.out.println(wizard);
        System.out.println(scout);

        // Demo level up
        System.out.println("\n=== Demo Level Up ===");
        System.out.println(hero.getName() + " level up!");

        hero.setLevel(hero.getLevel() + 1);

        System.out.println("After level up: " + hero);

        // Menampilkan informasi karakter
        System.out.println("\n=== Informasi Karakter ===");
        System.out.println("Nama: " + hero.getName());
        System.out.println("Jenis: " + hero.getType());
        System.out.println("HP: " + hero.getHitPoints());

        // Demo fitur mana
        System.out.println("\n=== Demo Mana ===");
        wizard.setMana(50);

        System.out.println("Mana " + wizard.getName()
            + ": " + wizard.getMana());

        // Demo isAlive()
        System.out.println("\n=== Demo isAlive() ===");
        System.out.println(hero.getName()
            + " masih hidup: " + hero.isAlive());

        // Pengujian validasi mana
        System.out.println("\n=== Demo Validasi Mana ===");

        try {
            wizard.setMana(-10);
        } catch (IllegalArgumentException e) {
            System.out.println("Validasi berhasil: "
                + e.getMessage());
        }
    }
}
