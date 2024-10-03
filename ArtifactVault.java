import java.util.Arrays;

class Artifact {
    String name;
    int age;

    public Artifact(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class ArtifactVault {
    private Artifact[] vault;
    private int count;

    public ArtifactVault(int capacity) {
        vault = new Artifact[capacity];
        count = 0;
    }

    public void addArtifact(String name, int age) {
        if (count >= vault.length) {
            System.out.println("Vault is full. Cannot add more artifacts.");
            return;
        }

        // Add artifact to the first empty slot
        for (int i = 0; i < vault.length; i++) {
            if (vault[i] == null) {
                vault[i] = new Artifact(name, age);
                count++;
                sortArtifacts(); // Sort by age after adding
                System.out.println("Added artifact: " + name + ", Age: " + age);
                return;
            }
        }
    }

    public void removeArtifact(String name) {
        for (int i = 0; i < vault.length; i++) {
            if (vault[i] != null && vault[i].name.equals(name)) {
                System.out.println("Removing artifact: " + vault[i].name);
                vault[i] = null; // Remove the artifact by setting to null
                count--;
                return;
            }
        }
        System.out.println("Artifact named " + name + " not found.");
    }

    public Artifact findArtifactLinear(String name) {
        for (Artifact artifact : vault) {
            if (artifact != null && artifact.name.equals(name)) {
                System.out.println("Found artifact: " + artifact.name + ", Age: " + artifact.age);
                return artifact;
            }
        }
        System.out.println("Artifact named " + name + " not found.");
        return null;
    }

    // Note: Binary search is not implemented for name, as it would not be sorted by name.
    // If you want to have a binary search, we can implement a separate sorting method for names.
    
    private void sortArtifacts() {
        // Sort the artifacts by age using a custom comparator
        Artifact[] sorted = Arrays.stream(vault)
                .filter(artifact -> artifact != null)
                .sorted((a1, a2) -> Integer.compare(a1.age, a2.age))
                .toArray(Artifact[]::new);

        // Fill the vault with sorted artifacts
        System.arraycopy(sorted, 0, vault, 0, sorted.length);
        // Fill remaining slots with null
        for (int i = sorted.length; i < vault.length; i++) {
            vault[i] = null;
        }
        count = sorted.length; // Update count
    }

    public static void main(String[] args) {
        ArtifactVault vault = new ArtifactVault(5);
        vault.addArtifact("Ancient Vase", 2000);
        vault.addArtifact("Old Coin", 1500);
        vault.addArtifact("Medieval Sword", 800);
        vault.addArtifact("Egyptian Scroll", 3000);
        vault.addArtifact("Roman Armor", 1000);

        vault.removeArtifact("Old Coin"); // Remove by name
        vault.findArtifactLinear("Ancient Vase"); // Find by name
        vault.findArtifactLinear("Old Coin"); // Find by name
    }
}