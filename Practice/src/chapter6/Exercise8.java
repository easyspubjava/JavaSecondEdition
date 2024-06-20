package chapter6;

class Computer {
    private String processor;
    private String ram;
    private String storage;
    private String graphicsCard;

    private Computer(Builder builder) {
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
    }

    public static class Builder {
        private String processor;
        private String ram;
        private String storage;
        private String graphicsCard;

        public Builder(String processor) {
            this.processor = processor;
        }

        public Builder withRAM(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder withStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder withGraphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }


    public String showComputerInfo() {
        return "Computer{" +
                "processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}

public class Exercise8 {
    public static void main(String[] args) {
        Computer myComputer = new Computer.Builder("Intel i9")
                .withRAM("16GB")
                .withStorage("1TB SSD")
                .withGraphicsCard("NVIDIA RTX 3080")
                .build();

        System.out.println(myComputer.showComputerInfo());
    }
}
