package builder.computer;

//Lớp có đối tượng ần xây dựng với nhiều thành phần
public class Computer {
    //Các thanh phần cần xây dựng, việc xây dựng các thành phần này là phức tạp
    String CPU, RAM, storage, screen;
    //3.Hàm khởi tạo, khởi tạo đối tượng xây dựng từ đối tượng builder. Không sử dụng bổ từ truy cập publish cho hàm truy cập
    private Computer(Builder b) {
        this.CPU = b.CPU;
        this.RAM = b.RAM;
        this.storage = b.storage;
        this.screen = b.screen;
    }
    //2.Lớp Builder có nhiệm vụ xây dựng các thành phần cho đối tượng cần khời tạo (Computer)
    public static class Builder{
        private String CPU, RAM, storage, screen;
        //4.Phương thức bắt buộc phải có của lớp Builder dùng để trả về đối tượng cần được xây dựng
        public Computer build(){
            return new Computer(this);
        }
        //Phương thức xây dựng một thành phần của Computer
        public Builder addCPU(String cpu){
            this.CPU = cpu;
            return this;
        }
        public Builder addRAM(String ram){
            this.RAM = ram;
            return this;
        }
        public Builder addStorage(String storage){
            this.storage = storage;
            return this;
        }
        public Builder addScreen(String screen){
            this.screen = screen;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", screen='" + screen + '\'' +
                '}';
    }
}
