public class HazardousWasteCollector extends WasteCollector {

    @Override
    protected boolean canHandle(WasteContainer container) {
        return container.getType() == WasteType.HAZARDOUS;
    }

    @Override
    protected void processWaste(WasteContainer container) {
        if (container.isFull()) {
            System.out.println("Hazardous waste safely disposed! Capacity: "
                    + container.getCapacity());
        } else {
            System.out.println("Hazardous container not full — skipping.");
        }
    }
}