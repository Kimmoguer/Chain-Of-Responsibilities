public class Main {

    public static void main(String[] args) {

        System.out.println("=== Automated Waste Management System ===");

        // Create collectors
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        // Build chain (Order matters)
        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);

        // Create sample waste containers
        WasteContainer organicBin =
                new WasteContainer(WasteType.ORGANIC, 100, true);

        WasteContainer recyclableBin =
                new WasteContainer(WasteType.RECYCLABLE, 80, true);

        WasteContainer hazardousBin =
                new WasteContainer(WasteType.HAZARDOUS, 50, true);

        WasteContainer notFullBin =
                new WasteContainer(WasteType.ORGANIC, 40, false);

        System.out.println("\n--- Waste Collection Process ---");

        // Trigger waste collection
        organicCollector.collectWaste(organicBin);
        organicCollector.collectWaste(recyclableBin);
        organicCollector.collectWaste(hazardousBin);
        organicCollector.collectWaste(notFullBin);
    }
}