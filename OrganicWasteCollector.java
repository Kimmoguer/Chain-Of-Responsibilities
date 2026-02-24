public class OrganicWasteCollector extends WasteCollector {

    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType() == WasteType.ORGANIC;
    }

    @Override
    protected void processWaste(WasteContainer container) {
        if (container.isFull()) {
            System.out.println("Organic waste collected. Capacity: "
                    + container.getCapacity());
        } else {
            System.out.println("Organic container not full — skipping.");
        }
    }
}