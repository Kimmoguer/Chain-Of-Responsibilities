public class WasteManagementSystem {

    private WasteCollector chain;

    public WasteManagementSystem() {
        buildChain();
    }

    // Initialize chain of collectors
    private void buildChain() {

        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);

        chain = organicCollector;
    }

    // Trigger waste collection
    public void processWaste(WasteContainer container) {
        if (chain != null) {
            chain.collectWaste(container);
        }
    }
}