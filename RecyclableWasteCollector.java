public class RecyclableWasteCollector extends WasteCollector {

    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType() == WasteType.RECYCLABLE;
    }

    @Override
    protected void processWaste(WasteContainer container) {
        if (container.isFull()) {
            System.out.println("Recyclable waste sent for recycling. Capacity: "
                    + container.getCapacity());
        } else {
            System.out.println("Recyclable container not full — skipping.");
        }
    }
}