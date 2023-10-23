interface ElectricDevice {
    void plugIn();
    void unplug();
}

class Iron implements ElectricDevice {
    @Override
    public void plugIn() {
        System.out.println("Iron is plugged into the socket.");
    }

    @Override
    public void unplug() {
        System.out.println("Iron is unplugged from the socket.");
    }
}

class WaterFilter {
    public void connectToWaterSupply() {
        System.out.println("Water filter is connected to the water.");
    }
}

class ElectricAdapter implements ElectricDevice {
    private WaterFilter waterFilter;

    public ElectricAdapter(WaterFilter waterFilter) {
        this.waterFilter = waterFilter;
    }

    @Override
    public void plugIn() {
        waterFilter.connectToWaterSupply();
        System.out.println("Adapter is plugged into the socket.");
    }

    @Override
    public void unplug() {
        System.out.println("Adapter is unplugged from the socket.");
    }
}

public class Main {
    public static void main(String[] args) {
        ElectricDevice iron = new Iron();
        WaterFilter waterFilter = new WaterFilter();
        ElectricDevice adapter = new ElectricAdapter(waterFilter);

        iron.plugIn();
        iron.unplug();

        adapter.plugIn();
        adapter.unplug();
    }
}
