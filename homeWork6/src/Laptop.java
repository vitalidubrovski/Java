public class Laptop {
    String id;
    String trademark;
    String ram_value;
    String disk_value;
    String operation_system;
    String colour;

    Laptop(String id, String trademark, String ram_value, String disk_value, String operation_system, String colour) {
        this.id = id;
        this.trademark = trademark;
        this.ram_value = ram_value;
        this.disk_value = disk_value;
        this.operation_system = operation_system;
        this.colour = colour;
    }

    public String getID() {
        return id;
    }

    public String getTrademark() {
        return trademark;
    }

    public String getRamValue() {
        return ram_value;
    }

    public String getHardDisk() {
        return disk_value;
    }

    public String getOperatingSystem() {
        return operation_system;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Ноутбук " + trademark + " c ID номером: " + id + ", объёмом ОЗУ: " + ram_value +
                "GB, объёмом диска: " + disk_value + "GB, операционной система: " + operation_system +
                ", Цвет корпуса: " + colour + "." + "\n";
    }
}


