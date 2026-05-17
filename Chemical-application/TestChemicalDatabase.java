public class TestChemicalDatabase {

    public static void main(String[] args) {

        ChemicalDatabase db = new ChemicalDatabase();

        // Display all tables
        db.displayElements();
        db.displayCompounds();
        db.displayDetails();

        // Search element by symbol
        db.searchElementBySymbol("Na");
        db.searchElementBySymbol("Au");

        // Search compound by ID
        db.searchCompoundById("102");
        db.searchCompoundById("999");

        // Search details by compound ID
        db.searchDetailsByCompoundId("100");

        // Search details by element symbol
        db.searchDetailsByElement("H");
        db.searchDetailsByElement("Fe");

        // Sort elements by symbol
        db.sortElementsBySymbol();

        // Sort elements by name
        ChemicalDatabase db2 = new ChemicalDatabase();
        db2.sortElementsByName();

        // Sort compounds by ID
        ChemicalDatabase db3 = new ChemicalDatabase();
        db3.sortCompoundsById();

        // Sort compounds by name
        ChemicalDatabase db4 = new ChemicalDatabase();
        db4.sortCompoundsByName();

        // Sort details by number of atoms descending
        ChemicalDatabase db5 = new ChemicalDatabase();
        db5.sortDetailsByAtoms();

        // Utility: total atoms in a compound
        ChemicalDatabase db6 = new ChemicalDatabase();
        System.out.println("\nTotal atoms in Water (100): "   + db6.totalAtomsInCompound("100"));
        System.out.println("Total atoms in Ammonia (102): "  + db6.totalAtomsInCompound("102"));

        // Utility: count elements in a compound
        System.out.println("Elements in Water (100): "       + db6.countElementsInCompound("100"));
        System.out.println("Elements in Table Salt (103): "  + db6.countElementsInCompound("103"));
    }
}
