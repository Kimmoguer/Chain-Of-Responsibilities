public abstract class WasteCollector {

    protected WasteCollector nextCollector;

    // Set next handler in chain
    public void setNextCollector(WasteCollector nextCollector) {
        this.nextCollector = nextCollector;
    }

    // Main chain processing method
    public void collectWaste(WasteContainer container) {

        if (canHandle(container)) {
            processWaste(container);
        } else if (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println("No collector available for waste type: "
                    + container.getType());
        }
    }

    protected abstract boolean canHandle(WasteContainer container);

    protected abstract void processWaste(WasteContainer container);
}