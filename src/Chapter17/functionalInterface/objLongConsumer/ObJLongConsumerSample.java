package Chapter17.functionalInterface.objLongConsumer;

import java.util.function.ObjLongConsumer;

public class ObJLongConsumerSample {
    public static void main(String[] args) {
        Computer computer1 = new Computer("dell",8L);
        Computer computer2 = new Computer("hp", 16L);


        ObjLongConsumer<Computer> ramSizeChanged = (computer, newRamSize) ->{
          computer.setRamSize(newRamSize);
        };


        ramSizeChanged.accept(computer1,10083L);
        ramSizeChanged.accept(computer2,1000L);

        System.out.println(computer1);
        System.out.println(computer2);

    }
}
